public class gaf {
   public static final gaf a = new gaf(0.0F);
   final float b;
   final float c;
   final float d;

   public gaf(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gaf(float $$0) {
      this($$0, $$0, $$0);
   }

   public gaf a(float $$0) {
      return new gaf(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gaf a(float $$0, float $$1, float $$2) {
      return new gaf(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
