public enum hv {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ic.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ic.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ic.a a(ic.a $$0) {
         return $$0;
      }

      @Override
      public hv a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ic.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ic.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ic.a a(ic.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public hv a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ic.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ic.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ic.a a(ic.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public hv a() {
         return b;
      }
   };

   public static final ic.a[] d = ic.a.values();
   public static final hv[] e = values();

   public abstract int a(int var1, int var2, int var3, ic.a var4);

   public abstract double a(double var1, double var3, double var5, ic.a var7);

   public abstract ic.a a(ic.a var1);

   public abstract hv a();

   public static hv a(ic.a $$0, ic.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
