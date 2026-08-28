public class fxm {
   public static final fxm a = new fxm(0.0F);
   final float b;
   final float c;
   final float d;

   public fxm(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fxm(float $$0) {
      this($$0, $$0, $$0);
   }

   public fxm a(float $$0) {
      return new fxm(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fxm a(float $$0, float $$1, float $$2) {
      return new fxm(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
