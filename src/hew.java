import javax.annotation.Nullable;

public class hew implements hey {
   private static final int a = 600;
   private static final xl b = xl.c("tutorial.punch_tree.title");
   private static final xl c = xl.a("tutorial.punch_tree.description", hex.a("attack"));
   private final hex d;
   @Nullable
   private foi e;
   private int f;
   private int g;

   public hew(hex $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hez.f);
      } else {
         if (this.f == 1) {
            ght $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gl().a(axm.r)) {
                  this.d.a(hez.e);
                  return;
               }

               if (het.a($$0)) {
                  this.d.a(hez.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new foi(foi.a.c, b, c, true);
            this.d.e().aA().a(this.e);
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
   public void a(gcy $$0, jh $$1, dvo $$2, float $$3) {
      boolean $$4 = $$2.a(axd.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hez.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cwf $$0) {
      if ($$0.a(axm.r)) {
         this.d.a(hez.e);
      }
   }
}
