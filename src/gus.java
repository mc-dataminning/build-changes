public class gus implements guy {
   private static final int a = 1200;
   private static final xo b = xo.c("tutorial.craft_planks.title");
   private static final xo c = xo.c("tutorial.craft_planks.description");
   private final gux d;
   private fjo e;
   private int f;

   public gus(gux $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guz.f);
      } else {
         if (this.f == 1) {
            gcp $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awx.b)) {
                  this.d.a(guz.f);
                  return;
               }

               if (a($$0, awx.b)) {
                  this.d.a(guz.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fjo(fjo.a.e, b, c, false);
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
   public void a(cuo $$0) {
      if ($$0.a(awx.b)) {
         this.d.a(guz.f);
      }
   }

   public static boolean a(gcp $$0, axe<cuj> $$1) {
      for (ji<cuj> $$2 : lp.h.c($$1)) {
         if ($$0.j().a(awj.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
