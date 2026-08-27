public class fuv {
   public static final fuv a = new fuv(0.0F);
   final float b;
   final float c;
   final float d;

   public fuv(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fuv(float $$0) {
      this($$0, $$0, $$0);
   }

   public fuv a(float $$0) {
      return new fuv(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fuv a(float $$0, float $$1, float $$2) {
      return new fuv(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
