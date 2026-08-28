public class gbf {
   public static final gbf a = new gbf(0.0F);
   final float b;
   final float c;
   final float d;

   public gbf(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gbf(float $$0) {
      this($$0, $$0, $$0);
   }

   public gbf a(float $$0) {
      return new gbf(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gbf a(float $$0, float $$1, float $$2) {
      return new gbf(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
