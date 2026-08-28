import javax.annotation.Nullable;

public class hpl implements hpq {
   private static final int a = 6000;
   private static final wy b = wy.c("tutorial.find_tree.title");
   private static final wy c = wy.c("tutorial.find_tree.description");
   private final hpp d;
   @Nullable
   private fvh e;
   private int f;

   public hpl(hpp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpr.f);
      } else {
         fpo $$0 = this.d.e();
         if (this.f == 1) {
            gpj $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hpr.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fvh($$0.h, fvh.a.c, b, c, false);
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
   public void a(gkl $$0, fev $$1) {
      if ($$1.d() == fev.a.b) {
         eao $$2 = $$0.a_(((fet)$$1).b());
         if ($$2.a(axc.al)) {
            this.d.a(hpr.c);
         }
      }
   }

   @Override
   public void a(czk $$0) {
      if ($$0.a(axk.aR)) {
         this.d.a(hpr.e);
      }
   }

   private static boolean b(gpj $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(axk.aR));
   }

   public static boolean a(gpj $$0) {
      for (jf<dmm> $$1 : mg.e.c(axc.al)) {
         dmm $$2 = $$1.a();
         if ($$0.l().a(awx.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
