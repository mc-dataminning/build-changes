import java.io.DataOutput;
import java.io.IOException;

public interface vh {
   int d = 8;
   int e = 12;
   int f = 4;
   int g = 28;
   byte h = 0;
   byte i = 1;
   byte j = 2;
   byte k = 3;
   byte l = 4;
   byte m = 5;
   byte n = 6;
   byte o = 7;
   byte p = 8;
   byte q = 9;
   byte r = 10;
   byte s = 11;
   byte t = 12;
   byte u = 99;
   int v = 512;

   void a(DataOutput var1) throws IOException;

   @Override
   String toString();

   byte b();

   vj<?> c();

   vh d();

   int a();

   default String s_() {
      return new vg().a(this);
   }

   void a(vl var1);

   ve.b a(ve var1);

   default void b(ve $$0) {
      ve.b $$1 = $$0.b(this.c());
      if ($$1 == ve.b.a) {
         this.a($$0);
      }
   }
}
