public class fxu {
   public static final fxu a = new fxu(0.0F);
   final float b;
   final float c;
   final float d;

   public fxu(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fxu(float $$0) {
      this($$0, $$0, $$0);
   }

   public fxu a(float $$0) {
      return new fxu(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fxu a(float $$0, float $$1, float $$2) {
      return new fxu(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
