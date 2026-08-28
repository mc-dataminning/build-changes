public enum jb {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jj.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jj.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jj.a a(jj.a $$0) {
         return $$0;
      }

      @Override
      public jb a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jj.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jj.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jj.a a(jj.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public jb a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jj.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jj.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jj.a a(jj.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public jb a() {
         return b;
      }
   };

   public static final jj.a[] d = jj.a.values();
   public static final jb[] e = values();

   public abstract int a(int var1, int var2, int var3, jj.a var4);

   public abstract double a(double var1, double var3, double var5, jj.a var7);

   public abstract jj.a a(jj.a var1);

   public abstract jb a();

   public static jb a(jj.a $$0, jj.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
