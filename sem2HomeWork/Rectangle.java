package sem2HomeWork;

class Rectangle {
    private Integer Width;
    private Integer Height;

    public Rectangle(Integer width, Integer height) {
        this.Width = width;
        this.Height = height;
    }
    // конструктор поумолчанию, без значений
    public Rectangle() {
        this.Width = 5;
        this.Height = 10;
    }
    //возвращаем ширину 
    public Integer getWidht(){
        return Width;
    }
    //возвращаем высоту
    public Integer getHeight(){
        return Height;
    }
    //возвращает площадь
    public Integer calculateArea(){
        return Height*Width;
    }
    //вычисляет периметр
    public void calculatePerimeter(){
        System.out.println(2*(Width+Height));
    }

}
