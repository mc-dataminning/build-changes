public class glq extends gkf<cgh, ftu<cgh>> {
   private final ftu<cgh> a = this.a();
   private final ftu<cgh> i;
   private static final alf j = new alf("textures/entity/fish/tropical_a.png");
   private static final alf k = new alf("textures/entity/fish/tropical_b.png");

   public glq(giz.a $$0) {
      super($$0, new fwi<>($$0.a(fxb.bL)), 0.15F);
      this.i = new fwj<>($$0.a(fxb.bJ));
      this.a(new gnv(this, $$0.f()));
   }

   public alf a(cgh $$0) {
      return switch ($$0.gB().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cgh $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      ftu<cgh> $$6 = switch ($$0.gB().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gz().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cgh $$0, faa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayz.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
