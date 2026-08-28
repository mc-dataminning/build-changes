import javax.annotation.Nullable;

public class hhg implements hhm {
   private static final int a = 1200;
   private static final xk b = xk.c("tutorial.craft_planks.title");
   private static final xk c = xk.c("tutorial.craft_planks.description");
   private final hhl d;
   @Nullable
   private fql e;
   private int f;

   public hhg(hhl $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhn.f);
      } else {
         flz $$0 = this.d.e();
         if (this.f == 1) {
            gkc $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axt.b)) {
                  this.d.a(hhn.f);
                  return;
               }

               if (a($$1, axt.b)) {
                  this.d.a(hhn.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fql($$0.h, fql.a.e, b, c, false);
            $$0.aA().a(this.e);
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
   public void a(cxg $$0) {
      if ($$0.a(axt.b)) {
         this.d.a(hhn.f);
      }
   }

   public static boolean a(gkc $$0, aya<cxc> $$1) {
      for (jq<cxc> $$2 : ma.g.c($$1)) {
         if ($$0.m().a(axf.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
