class Lib():
    def __init__(self):
        self.WhatIcan = "Java. Python. Git"
        self.ProjectsInRepo = 1
        self.CompletedProjects = 0
    def ComplectingProjects(self):
        self.CompletedProjects += 1
    def work(self):
        self.time = "Forever"
        while self.time != "":
            print("Working......")

work = Lib()
while True:
    work.work()
    #I`am working forever for github and a FUTURE 