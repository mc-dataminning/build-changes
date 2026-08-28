import javax.annotation.Nullable;

public class hqr implements hqw {
   private static final int a = 6000;
   private static final xg b = xg.c("tutorial.find_tree.title");
   private static final xg c = xg.c("tutorial.find_tree.description");
   private final hqv d;
   @Nullable
   private fwk e;
   private int f;

   public hqr(hqv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hqx.f);
      } else {
         fqq $$0 = this.d.e();
         if (this.f == 1) {
            gqm $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hqx.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fwk($$0.h, fwk.a.c, b, c, false);
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
   public void a(glo $$0, fga $$1) {
      if ($$1.d() == fga.a.b) {
         ebq $$2 = $$0.a_(((ffy)$$1).b());
         if ($$2.a(axn.al)) {
            this.d.a(hqx.c);
         }
      }
   }

   @Override
   public void a(dak $$0) {
      if ($$0.a(axv.aS)) {
         this.d.a(hqx.e);
      }
   }

   private static boolean b(gqm $$0) {
      return $$0.gj().a_($$0x -> $$0x.a(axv.aS));
   }

   public static boolean a(gqm $$0) {
      for (jg<dno> $$1 : mh.e.c(axn.al)) {
         dno $$2 = $$1.a();
         if ($$0.l().a(axi.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
