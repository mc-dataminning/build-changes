import javax.annotation.Nullable;

public class hrd implements hri {
   private static final int a = 6000;
   private static final xc b = xc.c("tutorial.find_tree.title");
   private static final xc c = xc.c("tutorial.find_tree.description");
   private final hrh d;
   @Nullable
   private fwz e;
   private int f;

   public hrd(hrh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hrj.f);
      } else {
         frf $$0 = this.d.e();
         if (this.f == 1) {
            grb $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hrj.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fwz($$0.h, fwz.a.c, b, c, false);
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
   public void a(gmd $$0, ffq $$1) {
      if ($$1.d() == ffq.a.b) {
         ebg $$2 = $$0.a_(((ffo)$$1).b());
         if ($$2.a(axg.al)) {
            this.d.a(hrj.c);
         }
      }
   }

   @Override
   public void a(daa $$0) {
      if ($$0.a(axo.aS)) {
         this.d.a(hrj.e);
      }
   }

   private static boolean b(grb $$0) {
      return $$0.gj().a_($$0x -> $$0x.a(axo.aS));
   }

   public static boolean a(grb $$0) {
      for (jg<dne> $$1 : mh.e.c(axg.al)) {
         dne $$2 = $$1.a();
         if ($$0.l().a(axb.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
