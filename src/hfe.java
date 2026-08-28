import javax.annotation.Nullable;

public class hfe implements hfj {
   private static final int a = 6000;
   private static final xj b = xj.c("tutorial.find_tree.title");
   private static final xj c = xj.c("tutorial.find_tree.description");
   private final hfi d;
   @Nullable
   private fop e;
   private int f;

   public hfe(hfi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hfk.f);
      } else {
         if (this.f == 1) {
            gic $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hfk.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fop(fop.a.c, b, c, false);
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
   public void a(gdh $$0, ezw $$1) {
      if ($$1.d() == ezw.a.b) {
         dvv $$2 = $$0.a_(((ezu)$$1).b());
         if ($$2.a(axc.ak)) {
            this.d.a(hfk.c);
         }
      }
   }

   @Override
   public void a(cwm $$0) {
      if ($$0.a(axl.aR)) {
         this.d.a(hfk.e);
      }
   }

   private static boolean b(gic $$0) {
      return $$0.gg().a_($$0x -> $$0x.a(axl.aR));
   }

   public static boolean a(gic $$0) {
      for (jq<diq> $$1 : lz.e.c(axc.ak)) {
         diq $$2 = $$1.a();
         if ($$0.m().a(awx.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
