public class gfh {
   public static final gfh a = new gfh(0.0F);
   final float b;
   final float c;
   final float d;

   public gfh(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gfh(float $$0) {
      this($$0, $$0, $$0);
   }

   public gfh a(float $$0) {
      return new gfh(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gfh a(float $$0, float $$1, float $$2) {
      return new gfh(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
