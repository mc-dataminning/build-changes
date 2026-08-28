import javax.annotation.Nullable;

public class hkx implements hkz {
   private static final int a = 600;
   private static final wp b = wp.c("tutorial.punch_tree.title");
   private static final wp c = wp.a("tutorial.punch_tree.description", hky.a("attack"));
   private final hky d;
   @Nullable
   private frg e;
   private int f;
   private int g;

   public hkx(hky $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hla.f);
      } else {
         flk $$0 = this.d.e();
         if (this.f == 1) {
            gkx $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(awy.r)) {
                  this.d.a(hla.e);
                  return;
               }

               if (hku.a($$1)) {
                  this.d.a(hla.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new frg($$0.h, frg.a.c, b, c, true);
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
   public void a(gga $$0, ji $$1, dwy $$2, float $$3) {
      boolean $$4 = $$2.a(awp.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hla.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cwq $$0) {
      if ($$0.a(awy.r)) {
         this.d.a(hla.e);
      }
   }
}
