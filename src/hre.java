import javax.annotation.Nullable;

public class hre implements hrg {
   private static final int a = 600;
   private static final xa b = xa.c("tutorial.punch_tree.title");
   private static final xa c = xa.a("tutorial.punch_tree.description", hrf.a("attack"));
   private final hrf d;
   @Nullable
   private fwx e;
   private int f;
   private int g;

   public hre(hrf $$0) {
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
               if ($$1.gj().a(axm.r)) {
                  this.d.a(hrh.e);
                  return;
               }

               if (hrb.a($$1)) {
                  this.d.a(hrh.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fwx($$0.h, fwx.a.c, b, c, true);
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
   public void a(gmb $$0, iv $$1, ebe $$2, float $$3) {
      boolean $$4 = $$2.a(axe.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hrh.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(czy $$0) {
      if ($$0.a(axm.r)) {
         this.d.a(hrh.e);
      }
   }
}
