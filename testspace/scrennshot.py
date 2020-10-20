import pyautogui
import tkinter as tk
from aip import AipOcr

# 百度云服务器配置参数
APP_ID = '22797992'
API_KEY = 'En5GYXIim8pusG4SiGwGLD2z'
SECRET_KEY = 'QlY595Q2YVlCT9lxN0hTl6L2qXFsVXfS'
# 用于连接服务器
client = AipOcr(APP_ID, API_KEY, SECRET_KEY)
filePath = r'./test.png'  # 截屏文件保存的路径
txtPath = r'./test.txt'  # 文本保存位置

global x, y  # 鼠标移动后的坐标
global xstart, ystart  # 点击鼠标左键的坐标
global xend, yend  # 抬起鼠标左键的坐标


######## 监听鼠标行为 ########
#监听鼠标位置
def move(event):
    global x, y, xstart, ystart
    new_x = (event.x-x)+canvas.winfo_x()
    new_y = (event.y-y)+canvas.winfo_y()
    s = "300x200+" + str(new_x)+"+" + str(new_y)
    canvas.place(x=new_x - xstart, y=new_y - ystart)
    print("s = ", s)
    print(root.winfo_x(), root.winfo_y())
    print(event.x, event.y)
# 点击鼠标左键,创建子窗口：


def button_1(event):
    global x, y, xstart, ystart
    global rec
    x, y = event.x, event.y
    xstart, ystart = event.x, event.y
    xstart, ystart = event.x, event.y
    cv.configure(height=1)
    cv.configure(width=1)
    cv.config(highlightthickness=0)  # 无边框
    cv.place(x=event.x, y=event.y)
    rec = cv.create_rectangle(0, 0, 0, 0, outline='red', width=8, dash=(4, 4))
# 拖动鼠标，改变子窗口大小：


def b1_Motion(event):
    global x, y, xstart, ystart
    x, y = event.x, event.y
    print("event.x, event.y = ", event.x, event.y)
    cv.configure(height=event.y - ystart)
    cv.configure(width=event.x - xstart)
    cv.coords(rec, 0, 0, event.x-xstart, event.y-ystart)
# 抬起鼠标左键，记录最后的光标位置并保存截图


def buttonRelease_1(event):
    global xend, yend, xstart, ystart
    xend, yend = event.x, event.y
    img = pyautogui.screenshot(
        region=[xstart, ystart, xend-xstart, yend-ystart])  # x,y,w,h
    img.save(filePath)
    sys_out(None)
# 退出程序：


def sys_out(even):
    root.destroy()

################


# 定义一个与屏幕相同大小透明的窗口
def root():
    global root
    root = tk.Tk()
    root.overrideredirect(True)  # 隐藏窗口的标题栏
    root.attributes("-alpha", 0.1)  # 窗口透明度10%
    root.geometry("{0}x{1}+0+0".format(root.winfo_screenwidth(),
                                       root.winfo_screenheight()))
    root.configure(bg="black")
# 创建一个Canvas用于选择截取区域


def canvas():
    global cv, x, y, xstart, ystart, xend, yend
    cv = tk.Canvas(root)
    x, y = 0, 0
    xstart, ystart = 0, 0
    xend, yend = 0, 0
# 监听鼠标和键盘事件


def bind():
    global root
    root.bind('<Escape>', sys_out)      # Esc
    root.bind("<Button-1>", button_1)  # 鼠标左键点击
    root.bind("<B1-Motion>", b1_Motion)  # 鼠标左键移动
    root.bind("<ButtonRelease-1>", buttonRelease_1)  # 鼠标左键释放
    root.mainloop()


# 识别图片文字并写入txt文件
def reg():
    # 读取截图
    f = open(filePath, 'rb')
    image = f.read()
    f.close()

    # 识别文字
    req = client.basicGeneral(image)

    all_text = ''

    # 将识别的文字写入all_text
    for i in req['words_result']:
            all_text += i['words'] + '\n'
    # 保存txt文件
    f = open(txtPath, 'a')
    f.write(all_text)
    f.close


if __name__ == "__main__":
    root()  # 定义一个与屏幕相同大小透明的窗口
    canvas()  # 创建一个Canvas用于选择截取区域
    bind()  # 监听鼠标和键盘事件
    reg()  # 识别图片文字并写入txt文件
