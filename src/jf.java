public enum jf {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jn.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jn.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jn.a a(jn.a $$0) {
         return $$0;
      }

      @Override
      public jf a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jn.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jn.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jn.a a(jn.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public jf a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jn.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jn.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jn.a a(jn.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public jf a() {
         return b;
      }
   };

   public static final jn.a[] d = jn.a.values();
   public static final jf[] e = values();

   public abstract int a(int var1, int var2, int var3, jn.a var4);

   public abstract double a(double var1, double var3, double var5, jn.a var7);

   public abstract jn.a a(jn.a var1);

   public abstract jf a();

   public static jf a(jn.a $$0, jn.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
