public class geb extends gcx<cjj> {
   private static final ajh a = new ajh("textures/entity/llama/spit.png");
   private final fox<cjj> f;

   public geb(gcy.a $$0) {
      super($$0);
      this.f = new fox<>($$0.a(frc.av));
   }

   public void a(cjj $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aww.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aww.i($$2, $$0.O, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eud $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cjj $$0) {
      return a;
   }
}
