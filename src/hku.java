import javax.annotation.Nullable;

public class hku implements hkz {
   private static final int a = 6000;
   private static final wp b = wp.c("tutorial.find_tree.title");
   private static final wp c = wp.c("tutorial.find_tree.description");
   private final hky d;
   @Nullable
   private frg e;
   private int f;

   public hku(hky $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hla.f);
      } else {
         flk $$0 = this.d.e();
         if (this.f == 1) {
            gkx $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hla.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new frg($$0.h, frg.a.c, b, c, false);
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
   public void a(gga $$0, faz $$1) {
      if ($$1.d() == faz.a.b) {
         dwy $$2 = $$0.a_(((fax)$$1).b());
         if ($$2.a(awp.al)) {
            this.d.a(hla.c);
         }
      }
   }

   @Override
   public void a(cwq $$0) {
      if ($$0.a(awy.aQ)) {
         this.d.a(hla.e);
      }
   }

   private static boolean b(gkx $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(awy.aQ));
   }

   public static boolean a(gkx $$0) {
      for (jr<djn> $$1 : mb.e.c(awp.al)) {
         djn $$2 = $$1.a();
         if ($$0.m().a(awk.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
