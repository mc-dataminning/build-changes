public class gzg extends gyl {
   public final hbp a = new hbp();
   public int b;
   public int c;

   public void a(bum $$0, cwq $$1, hbn $$2) {
      $$2.a(this.a, $$1, cwo.h, $$0);
      this.b = a($$1.M());
      this.c = a($$1);
   }

   public static int a(cwq $$0) {
      return $$0.f() ? 187 : cwm.a($$0.h()) + $$0.o();
   }

   public static int a(int $$0) {
      if ($$0 <= 1) {
         return 1;
      } else if ($$0 <= 16) {
         return 2;
      } else if ($$0 <= 32) {
         return 3;
      } else {
         return $$0 <= 48 ? 4 : 5;
      }
   }
}
