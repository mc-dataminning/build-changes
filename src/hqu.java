import javax.annotation.Nullable;

public class hqu implements hqw {
   private static final int a = 600;
   private static final xg b = xg.c("tutorial.punch_tree.title");
   private static final xg c = xg.a("tutorial.punch_tree.description", hqv.a("attack"));
   private final hqv d;
   @Nullable
   private fwk e;
   private int f;
   private int g;

   public hqu(hqv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hqx.f);
      } else {
         fqq $$0 = this.d.e();
         if (this.f == 1) {
            gqm $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gj().a(axv.r)) {
                  this.d.a(hqx.e);
                  return;
               }

               if (hqr.a($$1)) {
                  this.d.a(hqx.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fwk($$0.h, fwk.a.c, b, c, true);
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
   public void a(glo $$0, iw $$1, ebq $$2, float $$3) {
      boolean $$4 = $$2.a(axn.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hqx.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(dak $$0) {
      if ($$0.a(axv.r)) {
         this.d.a(hqx.e);
      }
   }
}
