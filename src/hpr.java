import javax.annotation.Nullable;

public class hpr implements hpx {
   private static final int a = 1200;
   private static final wy b = wy.c("tutorial.craft_planks.title");
   private static final wy c = wy.c("tutorial.craft_planks.description");
   private final hpw d;
   @Nullable
   private fvm e;
   private int f;

   public hpr(hpw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpy.f);
      } else {
         fpt $$0 = this.d.e();
         if (this.f == 1) {
            gpo $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axk.b)) {
                  this.d.a(hpy.f);
                  return;
               }

               if (a($$1, axk.b)) {
                  this.d.a(hpy.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fvm($$0.h, fvm.a.e, b, c, false);
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
   public void a(czn $$0) {
      if ($$0.a(axk.b)) {
         this.d.a(hpy.f);
      }
   }

   public static boolean a(gpo $$0, axr<czj> $$1) {
      for (jf<czj> $$2 : mg.g.c($$1)) {
         if ($$0.l().a(awx.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
