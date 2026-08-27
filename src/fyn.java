public class fyn extends fxd<bxr, fhh<bxr>> {
   private final fhh<bxr> a = this.a();
   private final fhh<bxr> i;
   private static final agi j = new agi("textures/entity/fish/tropical_a.png");
   private static final agi k = new agi("textures/entity/fish/tropical_b.png");

   public fyn(fvx.a $$0) {
      super($$0, new fjv<>($$0.a(fkn.bF)), 0.15F);
      this.i = new fjw<>($$0.a(fkn.bD));
      this.a(new gap(this, $$0.f()));
   }

   public agi a(bxr $$0) {
      return switch ($$0.gq().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bxr $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      fhh<bxr> $$6 = switch ($$0.gq().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.go().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bxr $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * atm.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
