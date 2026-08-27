public class ym implements ux<wp> {
   private final gu a;
   private final boolean b;

   public ym(gu $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ym(si $$0) {
      this.a = $$0.e();
      this.b = $$0.readBoolean();
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

   public boolean d() {
      return this.b;
   }
}
