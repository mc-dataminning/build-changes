public class gfa extends gee<cgh, fqb<cgh>> {
   private static final ajh a = new ajh("textures/entity/slime/slime.png");

   public gfa(gcy.a $$0) {
      super($$0, new fqb<>($$0.a(frc.bo)), 0.25F);
      this.a(new ghn<>(this, $$0.f()));
   }

   public void a(cgh $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cgh $$0, etz $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.go();
      float $$5 = aww.i($$2, $$0.bW, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public ajh a(cgh $$0) {
      return a;
   }
}
