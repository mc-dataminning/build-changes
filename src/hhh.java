import javax.annotation.Nullable;

public class hhh implements hhm {
   private static final int a = 6000;
   private static final xk b = xk.c("tutorial.find_tree.title");
   private static final xk c = xk.c("tutorial.find_tree.description");
   private final hhl d;
   @Nullable
   private fql e;
   private int f;

   public hhh(hhl $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhn.f);
      } else {
         flz $$0 = this.d.e();
         if (this.f == 1) {
            gkc $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hhn.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fql($$0.h, fql.a.c, b, c, false);
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
   public void a(gff $$0, fbp $$1) {
      if ($$1.d() == fbp.a.b) {
         dxo $$2 = $$0.a_(((fbn)$$1).b());
         if ($$2.a(axk.al)) {
            this.d.a(hhn.c);
         }
      }
   }

   @Override
   public void a(cxg $$0) {
      if ($$0.a(axt.aS)) {
         this.d.a(hhn.e);
      }
   }

   private static boolean b(gkc $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(axt.aS));
   }

   public static boolean a(gkc $$0) {
      for (jq<dkd> $$1 : ma.e.c(axk.al)) {
         dkd $$2 = $$1.a();
         if ($$0.m().a(axf.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
