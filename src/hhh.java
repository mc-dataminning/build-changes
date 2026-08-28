import javax.annotation.Nullable;

public interface hhh extends hhe {
   boolean c = true;
   hhh.a d = hhh.a.b;

   hgm a(gno var1, hgv var2, hhc var3, boolean var4, boolean var5, gnm var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hhh.a b() {
      return null;
   }

   @Nullable
   default gnm e() {
      return null;
   }

   default gno.a d() {
      return gno.a.a;
   }

   @Nullable
   default hhh c() {
      return null;
   }

   static hgm a(hhh $$0, hgv $$1, hhc $$2) {
      gno $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      gnm $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static gno a(hhh $$0, hgx $$1) {
      gno.c $$2 = new gno.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hhh $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hhh.a b(hhh $$0) {
      while ($$0 != null) {
         hhh.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gnl a(hhh $$0, cwl $$1) {
      while ($$0 != null) {
         gnm $$2 = $$0.e();
         if ($$2 != null) {
            gnl $$3 = $$2.a($$1);
            if ($$3 != gnl.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gnl.a;
   }

   static gnm c(hhh $$0) {
      gnl $$1 = a($$0, cwl.b);
      gnl $$2 = a($$0, cwl.c);
      gnl $$3 = a($$0, cwl.d);
      gnl $$4 = a($$0, cwl.e);
      gnl $$5 = a($$0, cwl.f);
      gnl $$6 = a($$0, cwl.g);
      gnl $$7 = a($$0, cwl.h);
      gnl $$8 = a($$0, cwl.i);
      return new gnm($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hhh.a a(String $$0) {
         for (hhh.a $$1 : values()) {
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
