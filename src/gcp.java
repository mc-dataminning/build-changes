public class gcp extends geh<cfm, fny<cfm>> {
   private static final ajh a = new ajh("textures/entity/creeper/creeper.png");

   public gcp(gdb.a $$0) {
      super($$0, new fny<>($$0.a(fre.H)), 0.5F);
      this.a(new ggp(this, $$0.f()));
   }

   protected void a(cfm $$0, eub $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + aww.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = aww.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cfm $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : aww.a($$2, 0.5F, 1.0F);
   }

   public ajh a(cfm $$0) {
      return a;
   }
}
