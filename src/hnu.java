import javax.annotation.Nullable;

public interface hnu extends hnn {
   boolean a = true;
   hnx.a b = hnx.a.b;

   hnx a();

   @Nullable
   hnu b();

   static gtx a(hnu $$0) {
      hnu $$1 = $$0;

      gtx.c $$2;
      for ($$2 = new gtx.c(); $$1 != null; $$1 = $$1.b()) {
         $$2.a($$1.a().e());
      }

      return $$2.a($$0);
   }

   default gtx g() {
      return a(this);
   }

   static boolean b(hnu $$0) {
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

   static hnx.a c(hnu $$0) {
      while ($$0 != null) {
         hnx.a $$1 = $$0.a().b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return b;
   }

   default hnx.a d() {
      return c(this);
   }

   static hnw d(hnu $$0) {
      while ($$0 != null) {
         hnw $$1 = $$0.a().a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return hnw.a;
   }

   default hnw f() {
      return d(this);
   }

   default hns a(gtx $$0, hnl $$1, hnr $$2) {
      return this.f().bake($$0, $$1, $$2, this);
   }

   static hlc a(gtx $$0, hnl $$1, hnn $$2) {
      return $$1.a().a($$0, "particle", $$2);
   }

   default hlc a(gtx $$0, hnl $$1) {
      return a($$0, $$1, this);
   }

   static gts a(hnu $$0, czy $$1) {
      while ($$0 != null) {
         gtt $$2 = $$0.a().d();
         if ($$2 != null) {
            gts $$3 = $$2.a($$1);
            if ($$3 != gts.a) {
               return $$3;
            }
         }

         $$0 = $$0.b();
      }

      return gts.a;
   }

   static gtt e(hnu $$0) {
      gts $$1 = a($$0, czy.b);
      gts $$2 = a($$0, czy.c);
      gts $$3 = a($$0, czy.d);
      gts $$4 = a($$0, czy.e);
      gts $$5 = a($$0, czy.f);
      gts $$6 = a($$0, czy.g);
      gts $$7 = a($$0, czy.h);
      gts $$8 = a($$0, czy.i);
      return new gtt($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   default gtt e() {
      return e(this);
   }
}
