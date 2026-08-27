public class gjn extends gid<cep, frt<cep>> {
   private final frt<cep> a = this.a();
   private final frt<cep> i;
   private static final akh j = new akh("textures/entity/fish/tropical_a.png");
   private static final akh k = new akh("textures/entity/fish/tropical_b.png");

   public gjn(ggx.a $$0) {
      super($$0, new fuh<>($$0.a(fva.bL)), 0.15F);
      this.i = new fui<>($$0.a(fva.bJ));
      this.a(new gls(this, $$0.f()));
   }

   public akh a(cep $$0) {
      return switch ($$0.gA().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cep $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      frt<cep> $$6 = switch ($$0.gA().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gy().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cep $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axz.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
