public enum it {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jc.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jc.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jc.a a(jc.a $$0) {
         return $$0;
      }

      @Override
      public it a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jc.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jc.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jc.a a(jc.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public it a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jc.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jc.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jc.a a(jc.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public it a() {
         return b;
      }
   };

   public static final jc.a[] d = jc.a.values();
   public static final it[] e = values();

   public abstract int a(int var1, int var2, int var3, jc.a var4);

   public abstract double a(double var1, double var3, double var5, jc.a var7);

   public abstract jc.a a(jc.a var1);

   public abstract it a();

   public static it a(jc.a $$0, jc.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
