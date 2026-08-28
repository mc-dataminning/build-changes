public class glp extends gke<cgg, ftt<cgg>> {
   private final ftt<cgg> a = this.a();
   private final ftt<cgg> i;
   private static final alf j = new alf("textures/entity/fish/tropical_a.png");
   private static final alf k = new alf("textures/entity/fish/tropical_b.png");

   public glp(giy.a $$0) {
      super($$0, new fwh<>($$0.a(fxa.bL)), 0.15F);
      this.i = new fwi<>($$0.a(fxa.bJ));
      this.a(new gnu(this, $$0.f()));
   }

   public alf a(cgg $$0) {
      return switch ($$0.gB().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cgg $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      ftt<cgg> $$6 = switch ($$0.gB().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gz().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cgg $$0, ezz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayz.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
