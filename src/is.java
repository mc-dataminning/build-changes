public enum is {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jb.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jb.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jb.a a(jb.a $$0) {
         return $$0;
      }

      @Override
      public is a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jb.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jb.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jb.a a(jb.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public is a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jb.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jb.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jb.a a(jb.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public is a() {
         return b;
      }
   };

   public static final jb.a[] d = jb.a.values();
   public static final is[] e = values();

   public abstract int a(int var1, int var2, int var3, jb.a var4);

   public abstract double a(double var1, double var3, double var5, jb.a var7);

   public abstract jb.a a(jb.a var1);

   public abstract is a();

   public static is a(jb.a $$0, jb.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
