import javax.annotation.Nullable;

public class hkm implements hkr {
   private static final int a = 6000;
   private static final wo b = wo.c("tutorial.find_tree.title");
   private static final wo c = wo.c("tutorial.find_tree.description");
   private final hkq d;
   @Nullable
   private fre e;
   private int f;

   public hkm(hkq $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hks.f);
      } else {
         flj $$0 = this.d.e();
         if (this.f == 1) {
            gkv $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hks.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fre($$0.h, fre.a.c, b, c, false);
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
   public void a(gfy $$0, fay $$1) {
      if ($$1.d() == fay.a.b) {
         dwx $$2 = $$0.a_(((faw)$$1).b());
         if ($$2.a(awp.al)) {
            this.d.a(hks.c);
         }
      }
   }

   @Override
   public void a(cwp $$0) {
      if ($$0.a(awy.aQ)) {
         this.d.a(hks.e);
      }
   }

   private static boolean b(gkv $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(awy.aQ));
   }

   public static boolean a(gkv $$0) {
      for (jr<djm> $$1 : mb.e.c(awp.al)) {
         djm $$2 = $$1.a();
         if ($$0.m().a(awk.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
