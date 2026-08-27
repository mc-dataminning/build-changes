public enum ij {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ir.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ir.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ir.a a(ir.a $$0) {
         return $$0;
      }

      @Override
      public ij a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ir.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ir.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ir.a a(ir.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public ij a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ir.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ir.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ir.a a(ir.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public ij a() {
         return b;
      }
   };

   public static final ir.a[] d = ir.a.values();
   public static final ij[] e = values();

   public abstract int a(int var1, int var2, int var3, ir.a var4);

   public abstract double a(double var1, double var3, double var5, ir.a var7);

   public abstract ir.a a(ir.a var1);

   public abstract ij a();

   public static ij a(ir.a $$0, ir.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
