import javax.annotation.Nullable;

public class hhi implements hho {
   private static final int a = 1200;
   private static final xv b = xv.c("tutorial.craft_planks.title");
   private static final xv c = xv.c("tutorial.craft_planks.description");
   private final hhn d;
   @Nullable
   private fqq e;
   private int f;

   public hhi(hhn $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhp.f);
      } else {
         if (this.f == 1) {
            gkf $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gg().a(ayd.b)) {
                  this.d.a(hhp.f);
                  return;
               }

               if (a($$0, ayd.b)) {
                  this.d.a(hhp.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fqq(fqq.a.e, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void a(cxo $$0) {
      if ($$0.a(ayd.b)) {
         this.d.a(hhp.f);
      }
   }

   public static boolean a(gkf $$0, ayk<cxk> $$1) {
      for (jq<cxk> $$2 : ma.g.c($$1)) {
         if ($$0.m().a(axp.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
