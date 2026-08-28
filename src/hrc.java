import javax.annotation.Nullable;

public class hrc implements hri {
   private static final int a = 1200;
   private static final xc b = xc.c("tutorial.craft_planks.title");
   private static final xc c = xc.c("tutorial.craft_planks.description");
   private final hrh d;
   @Nullable
   private fwz e;
   private int f;

   public hrc(hrh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hrj.f);
      } else {
         frf $$0 = this.d.e();
         if (this.f == 1) {
            grb $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gj().a(axo.b)) {
                  this.d.a(hrj.f);
                  return;
               }

               if (a($$1, axo.b)) {
                  this.d.a(hrj.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fwz($$0.h, fwz.a.e, b, c, false);
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
   public void a(daa $$0) {
      if ($$0.a(axo.b)) {
         this.d.a(hrj.f);
      }
   }

   public static boolean a(grb $$0, axv<czw> $$1) {
      for (jg<czw> $$2 : mh.g.c($$1)) {
         if ($$0.l().a(axb.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
