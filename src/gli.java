public record gli(float b, float c, float d, float e, float f, float g, float h, float i, float j) {
   public static final gli a = a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);

   public static gli a(float $$0, float $$1, float $$2) {
      return a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F);
   }

   public static gli b(float $$0, float $$1, float $$2) {
      return a(0.0F, 0.0F, 0.0F, $$0, $$1, $$2);
   }

   public static gli a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new gli($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F, 1.0F);
   }

   public gli c(float $$0, float $$1, float $$2) {
      return new gli(this.b + $$0, this.c + $$1, this.d + $$2, this.e, this.f, this.g, this.h, this.i, this.j);
   }

   public gli a(float $$0) {
      return new gli(this.b, this.c, this.d, this.e, this.f, this.g, $$0, $$0, $$0);
   }

   public gli b(float $$0) {
      return $$0 == 1.0F ? this : this.d($$0, $$0, $$0);
   }

   public gli d(float $$0, float $$1, float $$2) {
      return new gli(this.b * $$0, this.c * $$1, this.d * $$2, this.e, this.f, this.g, this.h * $$0, this.i * $$1, this.j * $$2);
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
