public class wp implements uo<ur> {
   private final gu a;
   private final boolean b;

   public wp(gu $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public wp(sf $$0) {
      this.a = $$0.f();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.writeBoolean(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
