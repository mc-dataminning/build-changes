import javax.annotation.Nullable;

public class hoy implements hpd {
   private static final int a = 6000;
   private static final wy b = wy.c("tutorial.find_tree.title");
   private static final wy c = wy.c("tutorial.find_tree.description");
   private final hpc d;
   @Nullable
   private fuv e;
   private int f;

   public hoy(hpc $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpe.f);
      } else {
         foz $$0 = this.d.e();
         if (this.f == 1) {
            gox $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hpe.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fuv($$0.h, fuv.a.c, b, c, false);
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
   public void a(gjz $$0, feo $$1) {
      if ($$1.d() == feo.a.b) {
         eah $$2 = $$0.a_(((fem)$$1).b());
         if ($$2.a(axc.al)) {
            this.d.a(hpe.c);
         }
      }
   }

   @Override
   public void a(czd $$0) {
      if ($$0.a(axk.aR)) {
         this.d.a(hpe.e);
      }
   }

   private static boolean b(gox $$0) {
      return $$0.gj().a_($$0x -> $$0x.a(axk.aR));
   }

   public static boolean a(gox $$0) {
      for (je<dmf> $$1 : mf.e.c(axc.al)) {
         dmf $$2 = $$1.a();
         if ($$0.l().a(awx.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
