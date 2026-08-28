public class fxe {
   public static final fxe a = new fxe(0.0F);
   final float b;
   final float c;
   final float d;

   public fxe(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fxe(float $$0) {
      this($$0, $$0, $$0);
   }

   public fxe a(float $$0) {
      return new fxe(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fxe a(float $$0, float $$1, float $$2) {
      return new fxe(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
