public class iw {
   protected final float a;
   protected final float b;
   protected final float c;

   public iw(float $$0, float $$1, float $$2) {
      this.a = !Float.isInfinite($$0) && !Float.isNaN($$0) ? $$0 % 360.0F : 0.0F;
      this.b = !Float.isInfinite($$1) && !Float.isNaN($$1) ? $$1 % 360.0F : 0.0F;
      this.c = !Float.isInfinite($$2) && !Float.isNaN($$2) ? $$2 % 360.0F : 0.0F;
   }

   public iw(sp $$0) {
      this($$0.i(0), $$0.i(1), $$0.i(2));
   }

   public sp a() {
      sp $$0 = new sp();
      $$0.add(sm.a(this.a));
      $$0.add(sm.a(this.b));
      $$0.add(sm.a(this.c));
      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof iw $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
   }

   public float b() {
      return this.a;
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }

   public float e() {
      return aty.g(this.a);
   }

   public float f() {
      return aty.g(this.b);
   }

   public float g() {
      return aty.g(this.c);
   }
}
