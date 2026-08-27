public class gfk extends gcx<cjx> {
   public static final ajh a = new ajh("textures/entity/trident.png");
   private final fqi f;

   public gfk(gcy.a $$0) {
      super($$0);
      this.f = new fqi($$0.a(frc.bE));
   }

   public void a(cjx $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aww.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aww.i($$2, $$0.O, $$0.dE()) + 90.0F));
      eud $$6 = gdw.c($$4, this.f.a(this.a($$0)), false, $$0.G());
      this.f.a($$3, $$6, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cjx $$0) {
      return a;
   }
}
