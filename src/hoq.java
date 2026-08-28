import javax.annotation.Nullable;

public class hoq implements hov {
   private static final int a = 6000;
   private static final wy b = wy.c("tutorial.find_tree.title");
   private static final wy c = wy.c("tutorial.find_tree.description");
   private final hou d;
   @Nullable
   private fuo e;
   private int f;

   public hoq(hou $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(how.f);
      } else {
         fos $$0 = this.d.e();
         if (this.f == 1) {
            gop $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(how.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fuo($$0.h, fuo.a.c, b, c, false);
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
   public void a(gjr $$0, feg $$1) {
      if ($$1.d() == feg.a.b) {
         dzz $$2 = $$0.a_(((fee)$$1).b());
         if ($$2.a(axc.al)) {
            this.d.a(how.c);
         }
      }
   }

   @Override
   public void a(cyy $$0) {
      if ($$0.a(axk.aQ)) {
         this.d.a(how.e);
      }
   }

   private static boolean b(gop $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(axk.aQ));
   }

   public static boolean a(gop $$0) {
      for (je<dma> $$1 : mf.e.c(axc.al)) {
         dma $$2 = $$1.a();
         if ($$0.l().a(awx.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
