public record gbo(float b, float c, float d, float e, float f, float g, float h, float i, float j) {
   public static final gbo a = a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);

   public static gbo a(float $$0, float $$1, float $$2) {
      return a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F);
   }

   public static gbo b(float $$0, float $$1, float $$2) {
      return a(0.0F, 0.0F, 0.0F, $$0, $$1, $$2);
   }

   public static gbo a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new gbo($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F, 1.0F);
   }

   public gbo c(float $$0, float $$1, float $$2) {
      return new gbo(this.b + $$0, this.c + $$1, this.d + $$2, this.e, this.f, this.g, this.h, this.i, this.j);
   }

   public gbo a(float $$0) {
      return new gbo(this.b, this.c, this.d, this.e, this.f, this.g, $$0, $$0, $$0);
   }

   public gbo b(float $$0) {
      return $$0 == 1.0F ? this : this.d($$0, $$0, $$0);
   }

   public gbo d(float $$0, float $$1, float $$2) {
      return new gbo(this.b * $$0, this.c * $$1, this.d * $$2, this.e, this.f, this.g, this.h * $$0, this.i * $$1, this.j * $$2);
   }

   public float a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public float h() {
      return this.i;
   }

   public float i() {
      return this.j;
   }
}
