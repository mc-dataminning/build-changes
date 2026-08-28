import javax.annotation.Nullable;

public interface hmj extends hmb {
   boolean a = true;
   hmm.a b = hmm.a.b;

   hmm a();

   @Nullable
   hmj b();

   static gsl a(hmj $$0) {
      hmj $$1 = $$0;

      gsl.c $$2;
      for ($$2 = new gsl.c(); $$1 != null; $$1 = $$1.b()) {
         $$2.a($$1.a().e());
      }

      return $$2.a($$0);
   }

   default gsl g() {
      return a(this);
   }

   static boolean b(hmj $$0) {
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

   static hmm.a c(hmj $$0) {
      while ($$0 != null) {
         hmm.a $$1 = $$0.a().b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return b;
   }

   default hmm.a d() {
      return c(this);
   }

   static hml d(hmj $$0) {
      while ($$0 != null) {
         hml $$1 = $$0.a().a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return hml.a;
   }

   default hml f() {
      return d(this);
   }

   default hmh a(gsl $$0, hlz $$1, hmf $$2) {
      return this.f().bake($$0, $$1, $$2, this);
   }

   static hjq a(gsl $$0, hlz $$1, hmb $$2) {
      return $$1.a().a($$0, "particle", $$2);
   }

   default hjq a(gsl $$0, hlz $$1) {
      return a($$0, $$1, this);
   }

   static gsg a(hmj $$0, czl $$1) {
      while ($$0 != null) {
         gsh $$2 = $$0.a().d();
         if ($$2 != null) {
            gsg $$3 = $$2.a($$1);
            if ($$3 != gsg.a) {
               return $$3;
            }
         }

         $$0 = $$0.b();
      }

      return gsg.a;
   }

   static gsh e(hmj $$0) {
      gsg $$1 = a($$0, czl.b);
      gsg $$2 = a($$0, czl.c);
      gsg $$3 = a($$0, czl.d);
      gsg $$4 = a($$0, czl.e);
      gsg $$5 = a($$0, czl.f);
      gsg $$6 = a($$0, czl.g);
      gsg $$7 = a($$0, czl.h);
      gsg $$8 = a($$0, czl.i);
      return new gsh($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   default gsh e() {
      return e(this);
   }
}
