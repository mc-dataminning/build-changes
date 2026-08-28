import javax.annotation.Nullable;

public class hqq implements hqw {
   private static final int a = 1200;
   private static final xg b = xg.c("tutorial.craft_planks.title");
   private static final xg c = xg.c("tutorial.craft_planks.description");
   private final hqv d;
   @Nullable
   private fwk e;
   private int f;

   public hqq(hqv $$0) {
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
               if ($$1.gj().a(axv.b)) {
                  this.d.a(hqx.f);
                  return;
               }

               if (a($$1, axv.b)) {
                  this.d.a(hqx.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fwk($$0.h, fwk.a.e, b, c, false);
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
   public void a(dak $$0) {
      if ($$0.a(axv.b)) {
         this.d.a(hqx.f);
      }
   }

   public static boolean a(gqm $$0, ayc<dag> $$1) {
      for (jg<dag> $$2 : mh.g.c($$1)) {
         if ($$0.l().a(axi.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
