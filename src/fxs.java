public class fxs {
   public static final fxs a = new fxs(0.0F);
   final float b;
   final float c;
   final float d;

   public fxs(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fxs(float $$0) {
      this($$0, $$0, $$0);
   }

   public fxs a(float $$0) {
      return new fxs(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fxs a(float $$0, float $$1, float $$2) {
      return new fxs(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
