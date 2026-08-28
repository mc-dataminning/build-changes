import javax.annotation.Nullable;

public class hox implements hpd {
   private static final int a = 1200;
   private static final wy b = wy.c("tutorial.craft_planks.title");
   private static final wy c = wy.c("tutorial.craft_planks.description");
   private final hpc d;
   @Nullable
   private fuv e;
   private int f;

   public hox(hpc $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpe.f);
      } else {
         foz $$0 = this.d.e();
         if (this.f == 1) {
            gox $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gj().a(axk.b)) {
                  this.d.a(hpe.f);
                  return;
               }

               if (a($$1, axk.b)) {
                  this.d.a(hpe.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fuv($$0.h, fuv.a.e, b, c, false);
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
   public void a(czd $$0) {
      if ($$0.a(axk.b)) {
         this.d.a(hpe.f);
      }
   }

   public static boolean a(gox $$0, axr<cyz> $$1) {
      for (je<cyz> $$2 : mf.g.c($$1)) {
         if ($$0.l().a(awx.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
