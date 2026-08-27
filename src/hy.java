public class hy {
   protected final float a;
   protected final float b;
   protected final float c;

   public hy(float $$0, float $$1, float $$2) {
      this.a = !Float.isInfinite($$0) && !Float.isNaN($$0) ? $$0 % 360.0F : 0.0F;
      this.b = !Float.isInfinite($$1) && !Float.isNaN($$1) ? $$1 % 360.0F : 0.0F;
      this.c = !Float.isInfinite($$2) && !Float.isNaN($$2) ? $$2 % 360.0F : 0.0F;
   }

   public hy(rd $$0) {
      this($$0.i(0), $$0.i(1), $$0.i(2));
   }

   public rd a() {
      rd $$0 = new rd();
      $$0.add(ra.a(this.a));
      $$0.add(ra.a(this.b));
      $$0.add(ra.a(this.c));
      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof hy $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
      return arx.g(this.a);
   }

   public float f() {
      return arx.g(this.b);
   }

   public float g() {
      return arx.g(this.c);
   }
}
