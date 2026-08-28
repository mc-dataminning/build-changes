public class fxd {
   public static final fxd a = new fxd(0.0F);
   final float b;
   final float c;
   final float d;

   public fxd(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fxd(float $$0) {
      this($$0, $$0, $$0);
   }

   public fxd a(float $$0) {
      return new fxd(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fxd a(float $$0, float $$1, float $$2) {
      return new fxd(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
