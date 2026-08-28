import javax.annotation.Nullable;

public class hhd implements hhj {
   private static final int a = 1200;
   private static final xv b = xv.c("tutorial.craft_planks.title");
   private static final xv c = xv.c("tutorial.craft_planks.description");
   private final hhi d;
   @Nullable
   private fql e;
   private int f;

   public hhd(hhi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhk.f);
      } else {
         if (this.f == 1) {
            gka $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gg().a(ayd.b)) {
                  this.d.a(hhk.f);
                  return;
               }

               if (a($$0, ayd.b)) {
                  this.d.a(hhk.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fql(fql.a.e, b, c, false);
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
   public void a(cxk $$0) {
      if ($$0.a(ayd.b)) {
         this.d.a(hhk.f);
      }
   }

   public static boolean a(gka $$0, ayk<cxg> $$1) {
      for (jq<cxg> $$2 : ma.g.c($$1)) {
         if ($$0.m().a(axp.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
