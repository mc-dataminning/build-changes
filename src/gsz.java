public class gsz extends gsr<cmq, gyy, gcg> {
   private static final alp a = alp.b("textures/entity/phantom.png");

   public gsz(grl.a $$0) {
      super($$0, new gcg($$0.a(gei.bO)), 0.75F);
      this.a(new gvy(this));
   }

   public alp a(gyy $$0) {
      return a;
   }

   public gyy b() {
      return new gyy();
   }

   public void a(cmq $$0, gyy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.p;
      $$1.b = $$0.m();
   }

   protected void a(gyy $$0, fgl $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gyy $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
