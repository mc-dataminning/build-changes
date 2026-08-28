import javax.annotation.Nullable;

public interface hlk extends hlh {
   boolean c = true;
   hlk.a d = hlk.a.b;

   hkp a(grl var1, hky var2, hlf var3, boolean var4, boolean var5, grj var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hlk.a b() {
      return null;
   }

   @Nullable
   default grj e() {
      return null;
   }

   default grl.a d() {
      return grl.a.a;
   }

   @Nullable
   default hlk c() {
      return null;
   }

   static hkp a(hlk $$0, hky $$1, hlf $$2) {
      grl $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      grj $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static grl a(hlk $$0, hla $$1) {
      grl.c $$2 = new grl.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hlk $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hlk.a b(hlk $$0) {
      while ($$0 != null) {
         hlk.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gri a(hlk $$0, cyw $$1) {
      while ($$0 != null) {
         grj $$2 = $$0.e();
         if ($$2 != null) {
            gri $$3 = $$2.a($$1);
            if ($$3 != gri.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gri.a;
   }

   static grj c(hlk $$0) {
      gri $$1 = a($$0, cyw.b);
      gri $$2 = a($$0, cyw.c);
      gri $$3 = a($$0, cyw.d);
      gri $$4 = a($$0, cyw.e);
      gri $$5 = a($$0, cyw.f);
      gri $$6 = a($$0, cyw.g);
      gri $$7 = a($$0, cyw.h);
      gri $$8 = a($$0, cyw.i);
      return new grj($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hlk.a a(String $$0) {
         for (hlk.a $$1 : values()) {
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
