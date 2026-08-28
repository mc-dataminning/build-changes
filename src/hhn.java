import javax.annotation.Nullable;

public interface hhn extends hhk {
   boolean c = true;
   hhn.a d = hhn.a.b;

   hgs a(gnr var1, hhb var2, hhi var3, boolean var4, boolean var5, gnp var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hhn.a b() {
      return null;
   }

   @Nullable
   default gnp e() {
      return null;
   }

   default gnr.a d() {
      return gnr.a.a;
   }

   @Nullable
   default hhn c() {
      return null;
   }

   static hgs a(hhn $$0, hhb $$1, hhi $$2) {
      gnr $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      gnp $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static gnr a(hhn $$0, hhd $$1) {
      gnr.c $$2 = new gnr.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hhn $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hhn.a b(hhn $$0) {
      while ($$0 != null) {
         hhn.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gno a(hhn $$0, cwn $$1) {
      while ($$0 != null) {
         gnp $$2 = $$0.e();
         if ($$2 != null) {
            gno $$3 = $$2.a($$1);
            if ($$3 != gno.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gno.a;
   }

   static gnp c(hhn $$0) {
      gno $$1 = a($$0, cwn.b);
      gno $$2 = a($$0, cwn.c);
      gno $$3 = a($$0, cwn.d);
      gno $$4 = a($$0, cwn.e);
      gno $$5 = a($$0, cwn.f);
      gno $$6 = a($$0, cwn.g);
      gno $$7 = a($$0, cwn.h);
      gno $$8 = a($$0, cwn.i);
      return new gnp($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hhn.a a(String $$0) {
         for (hhn.a $$1 : values()) {
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
