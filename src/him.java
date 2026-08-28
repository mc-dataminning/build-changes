import javax.annotation.Nullable;

public interface him extends hij {
   boolean c = true;
   him.a d = him.a.b;

   hhr a(goq var1, hia var2, hih var3, boolean var4, boolean var5, goo var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default him.a b() {
      return null;
   }

   @Nullable
   default goo e() {
      return null;
   }

   default goq.a d() {
      return goq.a.a;
   }

   @Nullable
   default him c() {
      return null;
   }

   static hhr a(him $$0, hia $$1, hih $$2) {
      goq $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      goo $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static goq a(him $$0, hic $$1) {
      goq.c $$2 = new goq.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(him $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static him.a b(him $$0) {
      while ($$0 != null) {
         him.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gon a(him $$0, cxf $$1) {
      while ($$0 != null) {
         goo $$2 = $$0.e();
         if ($$2 != null) {
            gon $$3 = $$2.a($$1);
            if ($$3 != gon.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gon.a;
   }

   static goo c(him $$0) {
      gon $$1 = a($$0, cxf.b);
      gon $$2 = a($$0, cxf.c);
      gon $$3 = a($$0, cxf.d);
      gon $$4 = a($$0, cxf.e);
      gon $$5 = a($$0, cxf.f);
      gon $$6 = a($$0, cxf.g);
      gon $$7 = a($$0, cxf.h);
      gon $$8 = a($$0, cxf.i);
      return new goo($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static him.a a(String $$0) {
         for (him.a $$1 : values()) {
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
