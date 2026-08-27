public class zp implements ux<wp> {
   private final gu a;
   private final float b;

   public zp(gu $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public zp(si $$0) {
      this.a = $$0.e();
      this.b = $$0.readFloat();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public float d() {
      return this.b;
   }
}
