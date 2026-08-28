public class fyi {
   public static final fyi a = new fyi(0.0F);
   final float b;
   final float c;
   final float d;

   public fyi(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fyi(float $$0) {
      this($$0, $$0, $$0);
   }

   public fyi a(float $$0) {
      return new fyi(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fyi a(float $$0, float $$1, float $$2) {
      return new fyi(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
