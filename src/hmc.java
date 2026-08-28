import javax.annotation.Nullable;

public interface hmc extends hlu {
   boolean a = true;
   hmf.a b = hmf.a.b;

   hmf a();

   @Nullable
   hmc b();

   static gsg a(hmc $$0) {
      hmc $$1 = $$0;

      gsg.c $$2;
      for ($$2 = new gsg.c(); $$1 != null; $$1 = $$1.b()) {
         $$2.a($$1.a().e());
      }

      return $$2.a($$0);
   }

   default gsg g() {
      return a(this);
   }

   static boolean b(hmc $$0) {
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

   static hmf.a c(hmc $$0) {
      while ($$0 != null) {
         hmf.a $$1 = $$0.a().b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return b;
   }

   default hmf.a d() {
      return c(this);
   }

   static hme d(hmc $$0) {
      while ($$0 != null) {
         hme $$1 = $$0.a().a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return hme.a;
   }

   default hme f() {
      return d(this);
   }

   default hma a(gsg $$0, hls $$1, hly $$2) {
      return this.f().bake($$0, $$1, $$2, this);
   }

   static hjk a(gsg $$0, hls $$1, hlu $$2) {
      return $$1.a().a($$0, "particle", $$2);
   }

   default hjk a(gsg $$0, hls $$1) {
      return a($$0, $$1, this);
   }

   static gsb a(hmc $$0, czi $$1) {
      while ($$0 != null) {
         gsc $$2 = $$0.a().d();
         if ($$2 != null) {
            gsb $$3 = $$2.a($$1);
            if ($$3 != gsb.a) {
               return $$3;
            }
         }

         $$0 = $$0.b();
      }

      return gsb.a;
   }

   static gsc e(hmc $$0) {
      gsb $$1 = a($$0, czi.b);
      gsb $$2 = a($$0, czi.c);
      gsb $$3 = a($$0, czi.d);
      gsb $$4 = a($$0, czi.e);
      gsb $$5 = a($$0, czi.f);
      gsb $$6 = a($$0, czi.g);
      gsb $$7 = a($$0, czi.h);
      gsb $$8 = a($$0, czi.i);
      return new gsc($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   default gsc e() {
      return e(this);
   }
}
