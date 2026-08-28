public class gfg {
   public static final gfg a = new gfg(0.0F);
   final float b;
   final float c;
   final float d;

   public gfg(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gfg(float $$0) {
      this($$0, $$0, $$0);
   }

   public gfg a(float $$0) {
      return new gfg(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gfg a(float $$0, float $$1, float $$2) {
      return new gfg(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
