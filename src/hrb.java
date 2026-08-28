import javax.annotation.Nullable;

public class hrb implements hrg {
   private static final int a = 6000;
   private static final xa b = xa.c("tutorial.find_tree.title");
   private static final xa c = xa.c("tutorial.find_tree.description");
   private final hrf d;
   @Nullable
   private fwx e;
   private int f;

   public hrb(hrf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hrh.f);
      } else {
         frd $$0 = this.d.e();
         if (this.f == 1) {
            gqz $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hrh.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fwx($$0.h, fwx.a.c, b, c, false);
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
   public void a(gmb $$0, ffo $$1) {
      if ($$1.d() == ffo.a.b) {
         ebe $$2 = $$0.a_(((ffm)$$1).b());
         if ($$2.a(axe.al)) {
            this.d.a(hrh.c);
         }
      }
   }

   @Override
   public void a(czy $$0) {
      if ($$0.a(axm.aR)) {
         this.d.a(hrh.e);
      }
   }

   private static boolean b(gqz $$0) {
      return $$0.gj().a_($$0x -> $$0x.a(axm.aR));
   }

   public static boolean a(gqz $$0) {
      for (jf<dnc> $$1 : mg.e.c(axe.al)) {
         dnc $$2 = $$1.a();
         if ($$0.l().a(awz.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
