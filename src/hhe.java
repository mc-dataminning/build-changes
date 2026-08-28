import javax.annotation.Nullable;

public class hhe implements hhj {
   private static final int a = 6000;
   private static final xv b = xv.c("tutorial.find_tree.title");
   private static final xv c = xv.c("tutorial.find_tree.description");
   private final hhi d;
   @Nullable
   private fql e;
   private int f;

   public hhe(hhi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhk.f);
      } else {
         if (this.f == 1) {
            gka $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hhk.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fql(fql.a.c, b, c, false);
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
   public void a(gfd $$0, fbq $$1) {
      if ($$1.d() == fbq.a.b) {
         dxn $$2 = $$0.a_(((fbo)$$1).b());
         if ($$2.a(axu.al)) {
            this.d.a(hhk.c);
         }
      }
   }

   @Override
   public void a(cxk $$0) {
      if ($$0.a(ayd.aS)) {
         this.d.a(hhk.e);
      }
   }

   private static boolean b(gka $$0) {
      return $$0.gg().a_($$0x -> $$0x.a(ayd.aS));
   }

   public static boolean a(gka $$0) {
      for (jq<dke> $$1 : ma.e.c(axu.al)) {
         dke $$2 = $$1.a();
         if ($$0.m().a(axp.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
