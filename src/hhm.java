import javax.annotation.Nullable;

public interface hhm extends hhj {
   boolean c = true;
   hhm.a d = hhm.a.b;

   hgr a(gnq var1, hha var2, hhh var3, boolean var4, boolean var5, gno var6);

   @Nullable
   default Boolean a() {
      return null;
   }

   @Nullable
   default hhm.a b() {
      return null;
   }

   @Nullable
   default gno e() {
      return null;
   }

   default gnq.a d() {
      return gnq.a.a;
   }

   @Nullable
   default hhm c() {
      return null;
   }

   static hgr a(hhm $$0, hha $$1, hhh $$2) {
      gnq $$3 = a($$0, $$1.b());
      boolean $$4 = a($$0);
      boolean $$5 = b($$0).a();
      gno $$6 = c($$0);
      return $$0.a($$3, $$1, $$2, $$4, $$5, $$6);
   }

   static gnq a(hhm $$0, hhc $$1) {
      gnq.c $$2 = new gnq.c();

      while ($$0 != null) {
         $$2.a($$0.d());
         $$0 = $$0.c();
      }

      return $$2.a($$1);
   }

   static boolean a(hhm $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return true;
   }

   static hhm.a b(hhm $$0) {
      while ($$0 != null) {
         hhm.a $$1 = $$0.b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.c();
      }

      return d;
   }

   static gnn a(hhm $$0, cwm $$1) {
      while ($$0 != null) {
         gno $$2 = $$0.e();
         if ($$2 != null) {
            gnn $$3 = $$2.a($$1);
            if ($$3 != gnn.a) {
               return $$3;
            }
         }

         $$0 = $$0.c();
      }

      return gnn.a;
   }

   static gno c(hhm $$0) {
      gnn $$1 = a($$0, cwm.b);
      gnn $$2 = a($$0, cwm.c);
      gnn $$3 = a($$0, cwm.d);
      gnn $$4 = a($$0, cwm.e);
      gnn $$5 = a($$0, cwm.f);
      gnn $$6 = a($$0, cwm.g);
      gnn $$7 = a($$0, cwm.h);
      gnn $$8 = a($$0, cwm.i);
      return new gno($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hhm.a a(String $$0) {
         for (hhm.a $$1 : values()) {
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
