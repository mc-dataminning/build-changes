import javax.annotation.Nullable;

public class hra implements hrg {
   private static final int a = 1200;
   private static final xa b = xa.c("tutorial.craft_planks.title");
   private static final xa c = xa.c("tutorial.craft_planks.description");
   private final hrf d;
   @Nullable
   private fwx e;
   private int f;

   public hra(hrf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hrh.f);
      } else {
         frd $$0 = this.d.e();
         if (this.f == 1) {
            gqz $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gj().a(axm.b)) {
                  this.d.a(hrh.f);
                  return;
               }

               if (a($$1, axm.b)) {
                  this.d.a(hrh.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fwx($$0.h, fwx.a.e, b, c, false);
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
   public void a(czy $$0) {
      if ($$0.a(axm.b)) {
         this.d.a(hrh.f);
      }
   }

   public static boolean a(gqz $$0, axt<czu> $$1) {
      for (jf<czu> $$2 : mg.g.c($$1)) {
         if ($$0.l().a(awz.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
