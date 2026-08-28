public class fxf {
   public static final fxf a = new fxf(0.0F);
   final float b;
   final float c;
   final float d;

   public fxf(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fxf(float $$0) {
      this($$0, $$0, $$0);
   }

   public fxf a(float $$0) {
      return new fxf(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fxf a(float $$0, float $$1, float $$2) {
      return new fxf(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
