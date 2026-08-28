import javax.annotation.Nullable;

public class hpo implements hpq {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.punch_tree.title");
   private static final wy c = wy.a("tutorial.punch_tree.description", hpp.a("attack"));
   private final hpp d;
   @Nullable
   private fvh e;
   private int f;
   private int g;

   public hpo(hpp $$0) {
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
               if ($$1.gi().a(axk.r)) {
                  this.d.a(hpr.e);
                  return;
               }

               if (hpl.a($$1)) {
                  this.d.a(hpr.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fvh($$0.h, fvh.a.c, b, c, true);
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
   public void a(gkl $$0, iv $$1, eao $$2, float $$3) {
      boolean $$4 = $$2.a(axc.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hpr.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(czk $$0) {
      if ($$0.a(axk.r)) {
         this.d.a(hpr.e);
      }
   }
}
