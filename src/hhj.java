import javax.annotation.Nullable;

public class hhj implements hho {
   private static final int a = 6000;
   private static final xv b = xv.c("tutorial.find_tree.title");
   private static final xv c = xv.c("tutorial.find_tree.description");
   private final hhn d;
   @Nullable
   private fqq e;
   private int f;

   public hhj(hhn $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhp.f);
      } else {
         if (this.f == 1) {
            gkf $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hhp.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fqq(fqq.a.c, b, c, false);
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
   public void a(gfi $$0, fbv $$1) {
      if ($$1.d() == fbv.a.b) {
         dxu $$2 = $$0.a_(((fbt)$$1).b());
         if ($$2.a(axu.al)) {
            this.d.a(hhp.c);
         }
      }
   }

   @Override
   public void a(cxo $$0) {
      if ($$0.a(ayd.aS)) {
         this.d.a(hhp.e);
      }
   }

   private static boolean b(gkf $$0) {
      return $$0.gg().a_($$0x -> $$0x.a(ayd.aS));
   }

   public static boolean a(gkf $$0) {
      for (jq<dkl> $$1 : ma.e.c(axu.al)) {
         dkl $$2 = $$1.a();
         if ($$0.m().a(axp.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
