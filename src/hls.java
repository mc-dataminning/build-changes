import javax.annotation.Nullable;

public interface hls extends hlp {
   boolean c = true;
   hls.a d = hls.a.b;

   hkx a(grt var1, hlg var2, hln var3, boolean var4, boolean var5, grr var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hls.a b() {
      return null;
   }

   @Nullable
   default grr e() {
      return null;
   }

   default grt.a d() {
      return grt.a.a;
   }

   @Nullable
   default hls c() {
      return null;
   }

   static hkx a(hls $$0, hlg $$1, hln $$2) {
      grt $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      grr $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static grt a(hls $$0, hli $$1) {
      grt.c $$2 = new grt.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hls $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hls.a b(hls $$0) {
      while ($$0 != null) {
         hls.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static grq a(hls $$0, czb $$1) {
      while ($$0 != null) {
         grr $$2 = $$0.e();
         if ($$2 != null) {
            grq $$3 = $$2.a($$1);
            if ($$3 != grq.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return grq.a;
   }

   static grr c(hls $$0) {
      grq $$1 = a($$0, czb.b);
      grq $$2 = a($$0, czb.c);
      grq $$3 = a($$0, czb.d);
      grq $$4 = a($$0, czb.e);
      grq $$5 = a($$0, czb.f);
      grq $$6 = a($$0, czb.g);
      grq $$7 = a($$0, czb.h);
      grq $$8 = a($$0, czb.i);
      return new grr($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hls.a a(String $$0) {
         for (hls.a $$1 : values()) {
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
