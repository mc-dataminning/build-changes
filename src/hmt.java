import javax.annotation.Nullable;

public class hmt implements hmy {
   private static final int a = 6000;
   private static final wv b = wv.c("tutorial.find_tree.title");
   private static final wv c = wv.c("tutorial.find_tree.description");
   private final hmx d;
   @Nullable
   private fsz e;
   private int f;

   public hmt(hmx $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hmz.f);
      } else {
         fnd $$0 = this.d.e();
         if (this.f == 1) {
            gmw $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hmz.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fsz($$0.h, fsz.a.c, b, c, false);
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
   public void a(ghz $$0, fcs $$1) {
      if ($$1.d() == fcs.a.b) {
         dym $$2 = $$0.a_(((fcq)$$1).b());
         if ($$2.a(awz.al)) {
            this.d.a(hmz.c);
         }
      }
   }

   @Override
   public void a(cxy $$0) {
      if ($$0.a(axi.aQ)) {
         this.d.a(hmz.e);
      }
   }

   private static boolean b(gmw $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(axi.aQ));
   }

   public static boolean a(gmw $$0) {
      for (js<dku> $$1 : md.e.c(awz.al)) {
         dku $$2 = $$1.a();
         if ($$0.l().a(awu.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
