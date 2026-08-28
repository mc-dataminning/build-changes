public enum jd {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jl.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jl.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jl.a a(jl.a $$0) {
         return $$0;
      }

      @Override
      public jd a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jl.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jl.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jl.a a(jl.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public jd a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jl.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jl.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jl.a a(jl.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public jd a() {
         return b;
      }
   };

   public static final jl.a[] d = jl.a.values();
   public static final jd[] e = values();

   public abstract int a(int var1, int var2, int var3, jl.a var4);

   public abstract double a(double var1, double var3, double var5, jl.a var7);

   public abstract jl.a a(jl.a var1);

   public abstract jd a();

   public static jd a(jl.a $$0, jl.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
