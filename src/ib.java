public enum ib {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ij.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ij.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ij.a a(ij.a $$0) {
         return $$0;
      }

      @Override
      public ib a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ij.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ij.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ij.a a(ij.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public ib a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ij.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ij.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ij.a a(ij.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public ib a() {
         return b;
      }
   };

   public static final ij.a[] d = ij.a.values();
   public static final ib[] e = values();

   public abstract int a(int var1, int var2, int var3, ij.a var4);

   public abstract double a(double var1, double var3, double var5, ij.a var7);

   public abstract ij.a a(ij.a var1);

   public abstract ib a();

   public static ib a(ij.a $$0, ij.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
