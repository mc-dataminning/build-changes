import javax.annotation.Nullable;

public class het implements hey {
   private static final int a = 6000;
   private static final xl b = xl.c("tutorial.find_tree.title");
   private static final xl c = xl.c("tutorial.find_tree.description");
   private final hex d;
   @Nullable
   private foi e;
   private int f;

   public het(hex $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hez.f);
      } else {
         if (this.f == 1) {
            ght $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hez.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new foi(foi.a.c, b, c, false);
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
   public void a(gcy $$0, ezp $$1) {
      if ($$1.d() == ezp.a.b) {
         dvo $$2 = $$0.a_(((ezn)$$1).b());
         if ($$2.a(axd.ak)) {
            this.d.a(hez.c);
         }
      }
   }

   @Override
   public void a(cwf $$0) {
      if ($$0.a(axm.aR)) {
         this.d.a(hez.e);
      }
   }

   private static boolean b(ght $$0) {
      return $$0.gl().a_($$0x -> $$0x.a(axm.aR));
   }

   public static boolean a(ght $$0) {
      for (jq<dij> $$1 : lz.e.c(axd.ak)) {
         dij $$2 = $$1.a();
         if ($$0.i().a(awy.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
