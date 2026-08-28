import javax.annotation.Nullable;

public interface hjn extends hjk {
   boolean c = true;
   hjn.a d = hjn.a.b;

   his a(gpr var1, hjb var2, hji var3, boolean var4, boolean var5, gpp var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hjn.a b() {
      return null;
   }

   @Nullable
   default gpp e() {
      return null;
   }

   default gpr.a d() {
      return gpr.a.a;
   }

   @Nullable
   default hjn c() {
      return null;
   }

   static his a(hjn $$0, hjb $$1, hji $$2) {
      gpr $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      gpp $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static gpr a(hjn $$0, hjd $$1) {
      gpr.c $$2 = new gpr.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hjn $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hjn.a b(hjn $$0) {
      while ($$0 != null) {
         hjn.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gpo a(hjn $$0, cxw $$1) {
      while ($$0 != null) {
         gpp $$2 = $$0.e();
         if ($$2 != null) {
            gpo $$3 = $$2.a($$1);
            if ($$3 != gpo.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gpo.a;
   }

   static gpp c(hjn $$0) {
      gpo $$1 = a($$0, cxw.b);
      gpo $$2 = a($$0, cxw.c);
      gpo $$3 = a($$0, cxw.d);
      gpo $$4 = a($$0, cxw.e);
      gpo $$5 = a($$0, cxw.f);
      gpo $$6 = a($$0, cxw.g);
      gpo $$7 = a($$0, cxw.h);
      gpo $$8 = a($$0, cxw.i);
      return new gpp($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hjn.a a(String $$0) {
         for (hjn.a $$1 : values()) {
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
