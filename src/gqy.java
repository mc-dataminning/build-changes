public class gqy extends gsr<cma, gxj, gaz> {
   private static final alp a = alp.b("textures/entity/creeper/creeper.png");

   public gqy(grl.a $$0) {
      super($$0, new gaz($$0.a(gei.ai)), 0.5F);
      this.a(new gvc(this, $$0.f()));
   }

   protected void a(gxj $$0, fgl $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azu.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azu.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gxj $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azu.a($$1, 0.5F, 1.0F);
   }

   public alp b(gxj $$0) {
      return a;
   }

   public gxj a() {
      return new gxj();
   }

   public void a(cma $$0, gxj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
