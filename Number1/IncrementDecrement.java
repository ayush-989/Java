class IncrementDecrement{
    public static void main(String[] args) {
        // int a=10;
        // int b=++a;
        // System.out.println(a);
        // System.out.println(b);

//         int a=20;
// a++;
// int b=a++;
// int c=++b;
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);

// int a=10;
// a++;
// int b=++a;
// int c=a++ + ++b;
// b++;
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);

// int a=12;
// int b=20;
// int c= a++ +b++ - ++a- --a;
// System.out.println(c);

// int x=10;

// int y=5;

// int z=x-- - --y + x++ + ++y;

// System.out.println(z);

// int x = 5;
// int result = x++ - --x + x-- - --x;
// System.out.println(result);

// int a=5;
// int b=10;
// int c= a-- + ++b - b-- + ++a;
// System.out.println( c );


// int x=12;
// x=x++;
// x=x++;
// x=x++;
// x=++x;
// x=x++;
// System.out.println(x);

// int x=12;
// int y=x++ + ++x;
// y++;
// int z=++y;
// int p=x++ - ++y + z++;
// System.out.println(x);
// System.out.println(y);
// System.out.println(z);
// System.out.println(p);

// int a=12;
// int b=a++;
// b++;
// int c=a++ + --b;
// int d=a++ + ++b + c++;
// d++;
// c--;
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);

// int a=12;
// a++;
// ++a;
// int b=a++;
// b++;
// int c=a++ + --b;
// c--;
// --b;
// int d=++a + b++ + --c;
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);

int a=8;
int b=12;
int c= ++a +b++;
c--;
--b;
int d= c-- + ++b + ++a;
int e= a + ++b +c + d++;
System.out.println (++e);
    }
}