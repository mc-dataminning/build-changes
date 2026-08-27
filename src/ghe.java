public class ghe implements ghk {
   private static final int a = 1200;
   private static final ur b = ur.c("tutorial.craft_planks.title");
   private static final ur c = ur.c("tutorial.craft_planks.description");
   private final ghj d;
   private exj e;
   private int f;

   public ghe(ghj $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ghl.f);
      } else {
         if (this.f == 1) {
            fpw $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fT().a(aro.b)) {
                  this.d.a(ghl.f);
                  return;
               }

               if (a($$0, aro.b)) {
                  this.d.a(ghl.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new exj(exj.a.e, b, c, false);
            this.d.e().ax().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(clj $$0) {
      if ($$0.a(aro.b)) {
         this.d.a(ghl.f);
      }
   }

   public static boolean a(fpw $$0, arv<cle> $$1) {
      for (ib<cle> $$2 : jy.i.c($$1)) {
         if ($$0.j().a(arb.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
