import javax.annotation.Nullable;

public class hkq implements hks {
   private static final int a = 600;
   private static final wo b = wo.c("tutorial.punch_tree.title");
   private static final wo c = wo.a("tutorial.punch_tree.description", hkr.a("attack"));
   private final hkr d;
   @Nullable
   private frc e;
   private int f;
   private int g;

   public hkq(hkr $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hkt.f);
      } else {
         flh $$0 = this.d.e();
         if (this.f == 1) {
            gkt $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(awx.r)) {
                  this.d.a(hkt.e);
                  return;
               }

               if (hkn.a($$1)) {
                  this.d.a(hkt.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new frc($$0.h, frc.a.c, b, c, true);
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
   public void a(gfw $$0, ji $$1, dwv $$2, float $$3) {
      boolean $$4 = $$2.a(awo.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hkt.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cwn $$0) {
      if ($$0.a(awx.r)) {
         this.d.a(hkt.e);
      }
   }
}
