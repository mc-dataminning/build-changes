import javax.annotation.Nullable;

public class hrg implements hri {
   private static final int a = 600;
   private static final xc b = xc.c("tutorial.punch_tree.title");
   private static final xc c = xc.a("tutorial.punch_tree.description", hrh.a("attack"));
   private final hrh d;
   @Nullable
   private fwz e;
   private int f;
   private int g;

   public hrg(hrh $$0) {
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
               if ($$1.gj().a(axo.r)) {
                  this.d.a(hrj.e);
                  return;
               }

               if (hrd.a($$1)) {
                  this.d.a(hrj.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fwz($$0.h, fwz.a.c, b, c, true);
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
   public void a(gmd $$0, iw $$1, ebg $$2, float $$3) {
      boolean $$4 = $$2.a(axg.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hrj.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(daa $$0) {
      if ($$0.a(axo.r)) {
         this.d.a(hrj.e);
      }
   }
}
