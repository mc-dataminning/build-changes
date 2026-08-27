public enum gt {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, hb.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hb.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public hb.a a(hb.a $$0) {
         return $$0;
      }

      @Override
      public gt a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, hb.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hb.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public hb.a a(hb.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public gt a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, hb.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hb.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public hb.a a(hb.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public gt a() {
         return b;
      }
   };

   public static final hb.a[] d = hb.a.values();
   public static final gt[] e = values();

   public abstract int a(int var1, int var2, int var3, hb.a var4);

   public abstract double a(double var1, double var3, double var5, hb.a var7);

   public abstract hb.a a(hb.a var1);

   public abstract gt a();

   public static gt a(hb.a $$0, hb.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
