import javax.annotation.Nullable;

public class hpk implements hpq {
   private static final int a = 1200;
   private static final wy b = wy.c("tutorial.craft_planks.title");
   private static final wy c = wy.c("tutorial.craft_planks.description");
   private final hpp d;
   @Nullable
   private fvh e;
   private int f;

   public hpk(hpp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpr.f);
      } else {
         fpo $$0 = this.d.e();
         if (this.f == 1) {
            gpj $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axk.b)) {
                  this.d.a(hpr.f);
                  return;
               }

               if (a($$1, axk.b)) {
                  this.d.a(hpr.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fvh($$0.h, fvh.a.e, b, c, false);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }
   }

   @Override
   public void a(czk $$0) {
      if ($$0.a(axk.b)) {
         this.d.a(hpr.f);
      }
   }

   public static boolean a(gpj $$0, axr<czg> $$1) {
      for (jf<czg> $$2 : mg.g.c($$1)) {
         if ($$0.l().a(awx.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
