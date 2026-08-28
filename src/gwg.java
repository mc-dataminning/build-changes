public class gwg extends gxz<cnw, hcs, ggc> {
   private static final alg a = alg.b("textures/entity/creeper/creeper.png");

   public gwg(gwt.a $$0) {
      super($$0, new ggc($$0.a(gjn.aq)), 0.5F);
      this.a(new hak(this, $$0.f()));
   }

   protected void a(hcs $$0, fjy $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azm.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azm.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(hcs $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azm.a($$1, 0.5F, 1.0F);
   }

   public alg b(hcs $$0) {
      return a;
   }

   public hcs a() {
      return new hcs();
   }

   public void a(cnw $$0, hcs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.m();
   }
}
