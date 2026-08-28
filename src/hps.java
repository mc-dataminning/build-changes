import javax.annotation.Nullable;

public class hps implements hpx {
   private static final int a = 6000;
   private static final wy b = wy.c("tutorial.find_tree.title");
   private static final wy c = wy.c("tutorial.find_tree.description");
   private final hpw d;
   @Nullable
   private fvm e;
   private int f;

   public hps(hpw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpy.f);
      } else {
         fpt $$0 = this.d.e();
         if (this.f == 1) {
            gpo $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hpy.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fvm($$0.h, fvm.a.c, b, c, false);
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
   public void a(gkq $$0, ffa $$1) {
      if ($$1.d() == ffa.a.b) {
         eat $$2 = $$0.a_(((fey)$$1).b());
         if ($$2.a(axc.al)) {
            this.d.a(hpy.c);
         }
      }
   }

   @Override
   public void a(czn $$0) {
      if ($$0.a(axk.aR)) {
         this.d.a(hpy.e);
      }
   }

   private static boolean b(gpo $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(axk.aR));
   }

   public static boolean a(gpo $$0) {
      for (jf<dmr> $$1 : mg.e.c(axc.al)) {
         dmr $$2 = $$1.a();
         if ($$0.l().a(awx.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
