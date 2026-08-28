public class gkv {
   public static final gkv a = new gkv(0.0F);
   final float b;
   final float c;
   final float d;

   public gkv(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gkv(float $$0) {
      this($$0, $$0, $$0);
   }

   public gkv a(float $$0) {
      return new gkv(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gkv a(float $$0, float $$1, float $$2) {
      return new gkv(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
