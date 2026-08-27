public enum ht {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ia.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ia.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ia.a a(ia.a $$0) {
         return $$0;
      }

      @Override
      public ht a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ia.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ia.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ia.a a(ia.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public ht a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ia.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ia.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ia.a a(ia.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public ht a() {
         return b;
      }
   };

   public static final ia.a[] d = ia.a.values();
   public static final ht[] e = values();

   public abstract int a(int var1, int var2, int var3, ia.a var4);

   public abstract double a(double var1, double var3, double var5, ia.a var7);

   public abstract ia.a a(ia.a var1);

   public abstract ht a();

   public static ht a(ia.a $$0, ia.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
