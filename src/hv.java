public enum hv {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ib.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ib.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ib.a a(ib.a $$0) {
         return $$0;
      }

      @Override
      public hv a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ib.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ib.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ib.a a(ib.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public hv a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ib.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ib.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ib.a a(ib.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public hv a() {
         return b;
      }
   };

   public static final ib.a[] d = ib.a.values();
   public static final hv[] e = values();

   public abstract int a(int var1, int var2, int var3, ib.a var4);

   public abstract double a(double var1, double var3, double var5, ib.a var7);

   public abstract ib.a a(ib.a var1);

   public abstract hv a();

   public static hv a(ib.a $$0, ib.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
