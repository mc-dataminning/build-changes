import javax.annotation.Nullable;

public interface hku extends hkr {
   boolean c = true;
   hku.a d = hku.a.b;

   hjz a(gqw var1, hki var2, hkp var3, boolean var4, boolean var5, gqu var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hku.a b() {
      return null;
   }

   @Nullable
   default gqu e() {
      return null;
   }

   default gqw.a d() {
      return gqw.a.a;
   }

   @Nullable
   default hku c() {
      return null;
   }

   static hjz a(hku $$0, hki $$1, hkp $$2) {
      gqw $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      gqu $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static gqw a(hku $$0, hkk $$1) {
      gqw.c $$2 = new gqw.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hku $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hku.a b(hku $$0) {
      while ($$0 != null) {
         hku.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gqt a(hku $$0, cyq $$1) {
      while ($$0 != null) {
         gqu $$2 = $$0.e();
         if ($$2 != null) {
            gqt $$3 = $$2.a($$1);
            if ($$3 != gqt.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gqt.a;
   }

   static gqu c(hku $$0) {
      gqt $$1 = a($$0, cyq.b);
      gqt $$2 = a($$0, cyq.c);
      gqt $$3 = a($$0, cyq.d);
      gqt $$4 = a($$0, cyq.e);
      gqt $$5 = a($$0, cyq.f);
      gqt $$6 = a($$0, cyq.g);
      gqt $$7 = a($$0, cyq.h);
      gqt $$8 = a($$0, cyq.i);
      return new gqu($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hku.a a(String $$0) {
         for (hku.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid gui light: " + $$0);
      }

      public boolean a() {
         return this == b;
      }
   }
}
