public class fxg {
   public static final fxg a = new fxg(0.0F);
   final float b;
   final float c;
   final float d;

   public fxg(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fxg(float $$0) {
      this($$0, $$0, $$0);
   }

   public fxg a(float $$0) {
      return new fxg(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fxg a(float $$0, float $$1, float $$2) {
      return new fxg(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
