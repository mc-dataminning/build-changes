public class gcg {
   public static final gcg a = new gcg(0.0F);
   final float b;
   final float c;
   final float d;

   public gcg(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gcg(float $$0) {
      this($$0, $$0, $$0);
   }

   public gcg a(float $$0) {
      return new gcg(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gcg a(float $$0, float $$1, float $$2) {
      return new gcg(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
