public enum jc {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jk.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jk.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jk.a a(jk.a $$0) {
         return $$0;
      }

      @Override
      public jc a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jk.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jk.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jk.a a(jk.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public jc a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jk.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jk.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jk.a a(jk.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public jc a() {
         return b;
      }
   };

   public static final jk.a[] d = jk.a.values();
   public static final jc[] e = values();

   public abstract int a(int var1, int var2, int var3, jk.a var4);

   public abstract double a(double var1, double var3, double var5, jk.a var7);

   public abstract jk.a a(jk.a var1);

   public abstract jc a();

   public static jc a(jk.a $$0, jk.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
