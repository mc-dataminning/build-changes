public enum iw {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, je.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, je.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public je.a a(je.a $$0) {
         return $$0;
      }

      @Override
      public iw a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, je.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, je.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public je.a a(je.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public iw a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, je.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, je.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public je.a a(je.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public iw a() {
         return b;
      }
   };

   public static final je.a[] d = je.a.values();
   public static final iw[] e = values();

   public abstract int a(int var1, int var2, int var3, je.a var4);

   public abstract double a(double var1, double var3, double var5, je.a var7);

   public abstract je.a a(je.a var1);

   public abstract iw a();

   public static iw a(je.a $$0, je.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
