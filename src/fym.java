public class fym {
   public static final fym a = new fym(0.0F);
   final float b;
   final float c;
   final float d;

   public fym(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fym(float $$0) {
      this($$0, $$0, $$0);
   }

   public fym a(float $$0) {
      return new fym(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fym a(float $$0, float $$1, float $$2) {
      return new fym(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
