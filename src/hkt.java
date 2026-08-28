import javax.annotation.Nullable;

public class hkt implements hky {
   private static final int a = 6000;
   private static final wp b = wp.c("tutorial.find_tree.title");
   private static final wp c = wp.c("tutorial.find_tree.description");
   private final hkx d;
   @Nullable
   private frf e;
   private int f;

   public hkt(hkx $$0) {
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
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hkz.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new frf($$0.h, frf.a.c, b, c, false);
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
   public void a(gfz $$0, fay $$1) {
      if ($$1.d() == fay.a.b) {
         dwx $$2 = $$0.a_(((faw)$$1).b());
         if ($$2.a(awp.al)) {
            this.d.a(hkz.c);
         }
      }
   }

   @Override
   public void a(cwp $$0) {
      if ($$0.a(awy.aQ)) {
         this.d.a(hkz.e);
      }
   }

   private static boolean b(gkw $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(awy.aQ));
   }

   public static boolean a(gkw $$0) {
      for (jr<djm> $$1 : mb.e.c(awp.al)) {
         djm $$2 = $$1.a();
         if ($$0.m().a(awk.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
