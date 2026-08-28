public class fyo {
   public static final fyo a = new fyo(0.0F);
   final float b;
   final float c;
   final float d;

   public fyo(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fyo(float $$0) {
      this($$0, $$0, $$0);
   }

   public fyo a(float $$0) {
      return new fyo(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fyo a(float $$0, float $$1, float $$2) {
      return new fyo(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
