import javax.annotation.Nullable;

public interface hns extends hnl {
   boolean a = true;
   hnv.a b = hnv.a.b;

   hnv a();

   @Nullable
   hns b();

   static gtv a(hns $$0) {
      hns $$1 = $$0;

      gtv.c $$2;
      for ($$2 = new gtv.c(); $$1 != null; $$1 = $$1.b()) {
         $$2.a($$1.a().e());
      }

      return $$2.a($$0);
   }

   default gtv g() {
      return a(this);
   }

   static boolean b(hns $$0) {
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

   static hnv.a c(hns $$0) {
      while ($$0 != null) {
         hnv.a $$1 = $$0.a().b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return b;
   }

   default hnv.a d() {
      return c(this);
   }

   static hnu d(hns $$0) {
      while ($$0 != null) {
         hnu $$1 = $$0.a().a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return hnu.a;
   }

   default hnu f() {
      return d(this);
   }

   default hnq a(gtv $$0, hnj $$1, hnp $$2) {
      return this.f().bake($$0, $$1, $$2, this);
   }

   static hla a(gtv $$0, hnj $$1, hnl $$2) {
      return $$1.a().a($$0, "particle", $$2);
   }

   default hla a(gtv $$0, hnj $$1) {
      return a($$0, $$1, this);
   }

   static gtq a(hns $$0, czw $$1) {
      while ($$0 != null) {
         gtr $$2 = $$0.a().d();
         if ($$2 != null) {
            gtq $$3 = $$2.a($$1);
            if ($$3 != gtq.a) {
               return $$3;
            }
         }

         $$0 = $$0.b();
      }

      return gtq.a;
   }

   static gtr e(hns $$0) {
      gtq $$1 = a($$0, czw.b);
      gtq $$2 = a($$0, czw.c);
      gtq $$3 = a($$0, czw.d);
      gtq $$4 = a($$0, czw.e);
      gtq $$5 = a($$0, czw.f);
      gtq $$6 = a($$0, czw.g);
      gtq $$7 = a($$0, czw.h);
      gtq $$8 = a($$0, czw.i);
      return new gtr($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   default gtr e() {
      return e(this);
   }
}
