public enum io {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, iw.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, iw.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public iw.a a(iw.a $$0) {
         return $$0;
      }

      @Override
      public io a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, iw.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, iw.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public iw.a a(iw.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public io a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, iw.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, iw.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public iw.a a(iw.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public io a() {
         return b;
      }
   };

   public static final iw.a[] d = iw.a.values();
   public static final io[] e = values();

   public abstract int a(int var1, int var2, int var3, iw.a var4);

   public abstract double a(double var1, double var3, double var5, iw.a var7);

   public abstract iw.a a(iw.a var1);

   public abstract io a();

   public static io a(iw.a $$0, iw.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
