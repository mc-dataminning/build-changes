public class hez extends hec {
   public final hhi a = new hhi();
   public int b;
   public int c;

   public void a(bxe $$0, dak $$1, hhg $$2) {
      $$2.a(this.a, $$1, dai.h, $$0);
      this.b = a($$1.M());
      this.c = a($$1);
   }

   public static int a(dak $$0) {
      return $$0.f() ? 187 : dag.a($$0.h()) + $$0.o();
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
