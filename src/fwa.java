public class fwa {
   public static final fwa a = new fwa(0.0F);
   final float b;
   final float c;
   final float d;

   public fwa(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fwa(float $$0) {
      this($$0, $$0, $$0);
   }

   public fwa a(float $$0) {
      return new fwa(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fwa a(float $$0, float $$1, float $$2) {
      return new fwa(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
