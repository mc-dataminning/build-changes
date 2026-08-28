import javax.annotation.Nullable;

public class hhl implements hhq {
   private static final int a = 6000;
   private static final xv b = xv.c("tutorial.find_tree.title");
   private static final xv c = xv.c("tutorial.find_tree.description");
   private final hhp d;
   @Nullable
   private fqs e;
   private int f;

   public hhl(hhp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhr.f);
      } else {
         if (this.f == 1) {
            gkh $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hhr.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fqs(fqs.a.c, b, c, false);
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
   public void a(gfk $$0, fbw $$1) {
      if ($$1.d() == fbw.a.b) {
         dxv $$2 = $$0.a_(((fbu)$$1).b());
         if ($$2.a(axu.al)) {
            this.d.a(hhr.c);
         }
      }
   }

   @Override
   public void a(cxp $$0) {
      if ($$0.a(ayd.aS)) {
         this.d.a(hhr.e);
      }
   }

   private static boolean b(gkh $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(ayd.aS));
   }

   public static boolean a(gkh $$0) {
      for (jq<dkm> $$1 : ma.e.c(axu.al)) {
         dkm $$2 = $$1.a();
         if ($$0.m().a(axp.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
