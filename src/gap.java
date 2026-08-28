public class gap {
   public static final gap a = new gap(0.0F);
   final float b;
   final float c;
   final float d;

   public gap(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gap(float $$0) {
      this($$0, $$0, $$0);
   }

   public gap a(float $$0) {
      return new gap(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gap a(float $$0, float $$1, float $$2) {
      return new gap(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
