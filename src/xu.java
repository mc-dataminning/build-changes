public class xu implements uo<ur> {
   private final gu a;
   private final float b;

   public xu(gu $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xu(sf $$0) {
      this.a = $$0.f();
      this.b = $$0.readFloat();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.writeFloat(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public float c() {
      return this.b;
   }
}
