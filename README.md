ทำไม Java สืบทอดหลาย class ไม่ได้
เพราะจะเกิดปัญหา Diamond Problem ทำให้เมธอดที่ชื่อซ้ำกันเกิดความกำกวมว่า ควรเรียกของ class ใด
ดังนั้น Java จึงอนุญาตให้ extends ได้เพียง 1 class เพื่อป้องกันความสับสน

ใช้ interface + composition แทนอย่างไร
เราใช้ implements หลาย interface เพื่อให้ class มีหลายความสามารถแทนการสืบทอดหลาย class
และใช้ composition (has-a relationship) โดยสร้าง object ภายใน class แทนการสืบทอด เช่น มี Battery, GPS เป็นส่วนประกอบ

การแก้ปัญหา default method ชื่อชนกัน
เมื่อ interface สองตัวมี default method ชื่อเดียวกัน Java จะบังคับให้ class ทำการ override เอง
และใช้ InterfaceName.super.method() เพื่อระบุชัดเจนว่าจะเรียกของ interface ใด
