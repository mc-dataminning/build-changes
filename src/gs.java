public enum gs {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ha.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ha.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ha.a a(ha.a $$0) {
         return $$0;
      }

      @Override
      public gs a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ha.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ha.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ha.a a(ha.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public gs a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ha.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ha.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ha.a a(ha.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public gs a() {
         return b;
      }
   };

   public static final ha.a[] d = ha.a.values();
   public static final gs[] e = values();

   public abstract int a(int var1, int var2, int var3, ha.a var4);

   public abstract double a(double var1, double var3, double var5, ha.a var7);

   public abstract ha.a a(ha.a var1);

   public abstract gs a();

   public static gs a(ha.a $$0, ha.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
