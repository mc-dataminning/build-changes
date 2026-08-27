public enum ik {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, is.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, is.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public is.a a(is.a $$0) {
         return $$0;
      }

      @Override
      public ik a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, is.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, is.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public is.a a(is.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public ik a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, is.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, is.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public is.a a(is.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public ik a() {
         return b;
      }
   };

   public static final is.a[] d = is.a.values();
   public static final ik[] e = values();

   public abstract int a(int var1, int var2, int var3, is.a var4);

   public abstract double a(double var1, double var3, double var5, is.a var7);

   public abstract is.a a(is.a var1);

   public abstract ik a();

   public static ik a(is.a $$0, is.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
