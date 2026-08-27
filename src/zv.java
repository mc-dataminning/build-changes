public class zv implements vd<ww> {
   private final gw a;
   private final float b;

   public zv(gw $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public zv(so $$0) {
      this.a = $$0.e();
      this.b = $$0.readFloat();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public float d() {
      return this.b;
   }
}
