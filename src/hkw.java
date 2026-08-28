import javax.annotation.Nullable;

public class hkw implements hky {
   private static final int a = 600;
   private static final wp b = wp.c("tutorial.punch_tree.title");
   private static final wp c = wp.a("tutorial.punch_tree.description", hkx.a("attack"));
   private final hkx d;
   @Nullable
   private frf e;
   private int f;
   private int g;

   public hkw(hkx $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hkz.f);
      } else {
         flj $$0 = this.d.e();
         if (this.f == 1) {
            gkw $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(awy.r)) {
                  this.d.a(hkz.e);
                  return;
               }

               if (hkt.a($$1)) {
                  this.d.a(hkz.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new frf($$0.h, frf.a.c, b, c, true);
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
   public void a(gfz $$0, ji $$1, dwx $$2, float $$3) {
      boolean $$4 = $$2.a(awp.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hkz.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cwp $$0) {
      if ($$0.a(awy.r)) {
         this.d.a(hkz.e);
      }
   }
}
