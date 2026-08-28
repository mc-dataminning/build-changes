public enum je {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jm.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jm.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jm.a a(jm.a $$0) {
         return $$0;
      }

      @Override
      public je a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jm.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jm.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jm.a a(jm.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public je a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jm.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jm.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jm.a a(jm.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public je a() {
         return b;
      }
   };

   public static final jm.a[] d = jm.a.values();
   public static final je[] e = values();

   public abstract int a(int var1, int var2, int var3, jm.a var4);

   public abstract double a(double var1, double var3, double var5, jm.a var7);

   public abstract jm.a a(jm.a var1);

   public abstract je a();

   public static je a(jm.a $$0, jm.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
