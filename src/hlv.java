import javax.annotation.Nullable;

public class hlv implements hlx {
   private static final int a = 600;
   private static final wp b = wp.c("tutorial.punch_tree.title");
   private static final wp c = wp.a("tutorial.punch_tree.description", hlw.a("attack"));
   private final hlw d;
   @Nullable
   private fsc e;
   private int f;
   private int g;

   public hlv(hlw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hly.f);
      } else {
         fmg $$0 = this.d.e();
         if (this.f == 1) {
            glv $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gl().a(awy.r)) {
                  this.d.a(hly.e);
                  return;
               }

               if (hls.a($$1)) {
                  this.d.a(hly.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fsc($$0.h, fsc.a.c, b, c, true);
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
   public void a(ggy $$0, ji $$1, dxq $$2, float $$3) {
      boolean $$4 = $$2.a(awp.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hly.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cxh $$0) {
      if ($$0.a(awy.r)) {
         this.d.a(hly.e);
      }
   }
}
