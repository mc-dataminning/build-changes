public enum hr {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, hx.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hx.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public hx.a a(hx.a $$0) {
         return $$0;
      }

      @Override
      public hr a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, hx.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hx.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public hx.a a(hx.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public hr a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, hx.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hx.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public hx.a a(hx.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public hr a() {
         return b;
      }
   };

   public static final hx.a[] d = hx.a.values();
   public static final hr[] e = values();

   public abstract int a(int var1, int var2, int var3, hx.a var4);

   public abstract double a(double var1, double var3, double var5, hx.a var7);

   public abstract hx.a a(hx.a var1);

   public abstract hr a();

   public static hr a(hx.a $$0, hx.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
