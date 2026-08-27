public class fvf {
   public static final fvf a = new fvf(0.0F);
   final float b;
   final float c;
   final float d;

   public fvf(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fvf(float $$0) {
      this($$0, $$0, $$0);
   }

   public fvf a(float $$0) {
      return new fvf(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fvf a(float $$0, float $$1, float $$2) {
      return new fvf(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
