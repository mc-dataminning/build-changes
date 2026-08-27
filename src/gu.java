public enum gu {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, hc.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hc.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public hc.a a(hc.a $$0) {
         return $$0;
      }

      @Override
      public gu a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, hc.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hc.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public hc.a a(hc.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public gu a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, hc.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, hc.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public hc.a a(hc.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public gu a() {
         return b;
      }
   };

   public static final hc.a[] d = hc.a.values();
   public static final gu[] e = values();

   public abstract int a(int var1, int var2, int var3, hc.a var4);

   public abstract double a(double var1, double var3, double var5, hc.a var7);

   public abstract hc.a a(hc.a var1);

   public abstract gu a();

   public static gu a(hc.a $$0, hc.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
