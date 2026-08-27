public enum hz {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, ih.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ih.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public ih.a a(ih.a $$0) {
         return $$0;
      }

      @Override
      public hz a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, ih.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ih.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public ih.a a(ih.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public hz a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, ih.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, ih.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public ih.a a(ih.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public hz a() {
         return b;
      }
   };

   public static final ih.a[] d = ih.a.values();
   public static final hz[] e = values();

   public abstract int a(int var1, int var2, int var3, ih.a var4);

   public abstract double a(double var1, double var3, double var5, ih.a var7);

   public abstract ih.a a(ih.a var1);

   public abstract hz a();

   public static hz a(ih.a $$0, ih.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
