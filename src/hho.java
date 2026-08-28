import javax.annotation.Nullable;

public interface hho extends hhl {
   boolean c = true;
   hho.a d = hho.a.b;

   hgt a(gns var1, hhc var2, hhj var3, boolean var4, boolean var5, gnq var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hho.a b() {
      return null;
   }

   @Nullable
   default gnq e() {
      return null;
   }

   default gns.a d() {
      return gns.a.a;
   }

   @Nullable
   default hho c() {
      return null;
   }

   static hgt a(hho $$0, hhc $$1, hhj $$2) {
      gns $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      gnq $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static gns a(hho $$0, hhe $$1) {
      gns.c $$2 = new gns.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hho $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hho.a b(hho $$0) {
      while ($$0 != null) {
         hho.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gnp a(hho $$0, cwo $$1) {
      while ($$0 != null) {
         gnq $$2 = $$0.e();
         if ($$2 != null) {
            gnp $$3 = $$2.a($$1);
            if ($$3 != gnp.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gnp.a;
   }

   static gnq c(hho $$0) {
      gnp $$1 = a($$0, cwo.b);
      gnp $$2 = a($$0, cwo.c);
      gnp $$3 = a($$0, cwo.d);
      gnp $$4 = a($$0, cwo.e);
      gnp $$5 = a($$0, cwo.f);
      gnp $$6 = a($$0, cwo.g);
      gnp $$7 = a($$0, cwo.h);
      gnp $$8 = a($$0, cwo.i);
      return new gnq($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hho.a a(String $$0) {
         for (hho.a $$1 : values()) {
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
