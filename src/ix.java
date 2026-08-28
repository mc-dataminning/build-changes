public enum ix {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jf.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jf.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jf.a a(jf.a $$0) {
         return $$0;
      }

      @Override
      public ix a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jf.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jf.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jf.a a(jf.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public ix a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jf.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jf.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jf.a a(jf.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public ix a() {
         return b;
      }
   };

   public static final jf.a[] d = jf.a.values();
   public static final ix[] e = values();

   public abstract int a(int var1, int var2, int var3, jf.a var4);

   public abstract double a(double var1, double var3, double var5, jf.a var7);

   public abstract jf.a a(jf.a var1);

   public abstract ix a();

   public static ix a(jf.a $$0, jf.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
