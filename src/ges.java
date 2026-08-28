public class ges {
   public static final ges a = new ges(0.0F);
   final float b;
   final float c;
   final float d;

   public ges(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ges(float $$0) {
      this($$0, $$0, $$0);
   }

   public ges a(float $$0) {
      return new ges(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public ges a(float $$0, float $$1, float $$2) {
      return new ges(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
