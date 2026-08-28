public class gqn extends gpq<cma, gwj, gai> {
   public static final ali a = ali.b("textures/entity/slime/slime.png");

   public gqn(gok.a $$0) {
      super($$0, new gai($$0.a(gbl.cs)), 0.25F);
      this.a(new gtb(this, $$0.f()));
   }

   public void a(gwj $$0, feb $$1, gih $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gwj $$0, feb $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public ali a(gwj $$0) {
      return a;
   }

   public gwj c() {
      return new gwj();
   }

   public void a(cma $$0, gwj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gv();
   }
}
