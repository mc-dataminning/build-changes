public enum hx {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ie.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ie.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ie.a a(ie.a $$0) {
         return $$0;
      }

      @Override
      public hx a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ie.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ie.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ie.a a(ie.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public hx a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ie.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ie.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ie.a a(ie.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public hx a() {
         return b;
      }
   };

   public static final ie.a[] d = ie.a.values();
   public static final hx[] e = values();

   public abstract int a(int var1, int var2, int var3, ie.a var4);

   public abstract double a(double var1, double var3, double var5, ie.a var7);

   public abstract ie.a a(ie.a var1);

   public abstract hx a();

   public static hx a(ie.a $$0, ie.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
