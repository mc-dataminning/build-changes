public enum jg {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jo.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jo.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jo.a a(jo.a $$0) {
         return $$0;
      }

      @Override
      public jg a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jo.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jo.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jo.a a(jo.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public jg a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jo.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jo.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jo.a a(jo.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public jg a() {
         return b;
      }
   };

   public static final jo.a[] d = jo.a.values();
   public static final jg[] e = values();

   public abstract int a(int var1, int var2, int var3, jo.a var4);

   public abstract double a(double var1, double var3, double var5, jo.a var7);

   public abstract jo.a a(jo.a var1);

   public abstract jg a();

   public static jg a(jo.a $$0, jo.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
