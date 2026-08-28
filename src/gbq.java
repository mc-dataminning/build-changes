public class gbq {
   public static final gbq a = new gbq(0.0F);
   final float b;
   final float c;
   final float d;

   public gbq(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gbq(float $$0) {
      this($$0, $$0, $$0);
   }

   public gbq a(float $$0) {
      return new gbq(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gbq a(float $$0, float $$1, float $$2) {
      return new gbq(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
