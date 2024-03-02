#include <string>
#include <iostream>

using namespace std;

class Person
{
private:
    string name;
    int age;

public:
    Person(string name, int age)
    {
        this->name = name;
        this->age = age;
    }
    string getName()
    {
        return this->name;
    }

    void setName(string value)
    {
        this->name = value;
    }

    int getAge()
    {
        return this->age;
    }

    void setAge(int age)
    {
        this->age = age;
    }

    virtual string toString()
    {
        return getName() + " - " + to_string(getAge());
    }
};

class Student : public Person
{
private:
    int studentNo;

public:
    Student(string name, int age, int studentNo) : Person(name, age)
    {
        this->studentNo = studentNo;
    }

    int getStudentNo()
    {
        return this->studentNo;
    }

    void setStudentNo(int value)
    {
        this->studentNo = value;
    }

    string toString() override
    {
        return getName() + " - " + to_string(getAge()) + " - " + to_string(getStudentNo());
    }
};

class Teacher : public Person
{
private:
    string branch;

public:
    Teacher(string name, int age, string branch) : Person(name, age)
    {
        this->branch = branch;
    }
    string getBranch()
    {
        return this->branch;
    }
    void setBranch(string branch)
    {
        this->branch = branch;
    }

    string toString() override
    {
        return getName() + " - " + to_string(getAge()) + " - " + getBranch();
    }
};

int main()
{
    Person person = Person("Sarp", 28);
    Student student = Student("Bugra Durmus", 19, 536);
    Teacher teacher = Teacher("Mehmet Karadeniz", 56, "Ilkokul Ogretmeni");

    cout << person.toString() << endl;
    cout << student.toString() << endl;
    cout << teacher.toString() << endl;

    return 0;
}