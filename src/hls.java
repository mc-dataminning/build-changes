import javax.annotation.Nullable;

public class hls implements hlx {
   private static final int a = 6000;
   private static final wp b = wp.c("tutorial.find_tree.title");
   private static final wp c = wp.c("tutorial.find_tree.description");
   private final hlw d;
   @Nullable
   private fsc e;
   private int f;

   public hls(hlw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hly.f);
      } else {
         fmg $$0 = this.d.e();
         if (this.f == 1) {
            glv $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hly.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fsc($$0.h, fsc.a.c, b, c, false);
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
   public void a(ggy $$0, fbv $$1) {
      if ($$1.d() == fbv.a.b) {
         dxq $$2 = $$0.a_(((fbt)$$1).b());
         if ($$2.a(awp.al)) {
            this.d.a(hly.c);
         }
      }
   }

   @Override
   public void a(cxh $$0) {
      if ($$0.a(awy.aQ)) {
         this.d.a(hly.e);
      }
   }

   private static boolean b(glv $$0) {
      return $$0.gl().a_($$0x -> $$0x.a(awy.aQ));
   }

   public static boolean a(glv $$0) {
      for (jr<dke> $$1 : mb.e.c(awp.al)) {
         dke $$2 = $$1.a();
         if ($$0.l().a(awk.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
