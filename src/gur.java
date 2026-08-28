public class gur implements gux {
   private static final int a = 1200;
   private static final xo b = xo.c("tutorial.craft_planks.title");
   private static final xo c = xo.c("tutorial.craft_planks.description");
   private final guw d;
   private fjn e;
   private int f;

   public gur(guw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guy.f);
      } else {
         if (this.f == 1) {
            gco $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awx.b)) {
                  this.d.a(guy.f);
                  return;
               }

               if (a($$0, awx.b)) {
                  this.d.a(guy.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fjn(fjn.a.e, b, c, false);
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
   public void a(cun $$0) {
      if ($$0.a(awx.b)) {
         this.d.a(guy.f);
      }
   }

   public static boolean a(gco $$0, axe<cui> $$1) {
      for (ji<cui> $$2 : lp.h.c($$1)) {
         if ($$0.j().a(awj.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
