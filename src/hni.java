import javax.annotation.Nullable;

public interface hni extends hnb {
   boolean a = true;
   hnl.a b = hnl.a.b;

   hnl a();

   @Nullable
   hni b();

   static gti a(hni $$0) {
      hni $$1 = $$0;

      gti.c $$2;
      for ($$2 = new gti.c(); $$1 != null; $$1 = $$1.b()) {
         $$2.a($$1.a().e());
      }

      return $$2.a($$0);
   }

   default gti g() {
      return a(this);
   }

   static boolean b(hni $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a().c();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return true;
   }

   default boolean c() {
      return b(this);
   }

   static hnl.a c(hni $$0) {
      while ($$0 != null) {
         hnl.a $$1 = $$0.a().b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return b;
   }

   default hnl.a d() {
      return c(this);
   }

   static hnk d(hni $$0) {
      while ($$0 != null) {
         hnk $$1 = $$0.a().a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return hnk.a;
   }

   default hnk f() {
      return d(this);
   }

   default hng a(gti $$0, hmz $$1, hnf $$2) {
      return this.f().bake($$0, $$1, $$2, this);
   }

   static hkq a(gti $$0, hmz $$1, hnb $$2) {
      return $$1.a().a($$0, "particle", $$2);
   }

   default hkq a(gti $$0, hmz $$1) {
      return a($$0, $$1, this);
   }

   static gtd a(hni $$0, dai $$1) {
      while ($$0 != null) {
         gte $$2 = $$0.a().d();
         if ($$2 != null) {
            gtd $$3 = $$2.a($$1);
            if ($$3 != gtd.a) {
               return $$3;
            }
         }

         $$0 = $$0.b();
      }

      return gtd.a;
   }

   static gte e(hni $$0) {
      gtd $$1 = a($$0, dai.b);
      gtd $$2 = a($$0, dai.c);
      gtd $$3 = a($$0, dai.d);
      gtd $$4 = a($$0, dai.e);
      gtd $$5 = a($$0, dai.f);
      gtd $$6 = a($$0, dai.g);
      gtd $$7 = a($$0, dai.h);
      gtd $$8 = a($$0, dai.i);
      return new gte($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   default gte e() {
      return e(this);
   }
}
