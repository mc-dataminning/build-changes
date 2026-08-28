public class glo extends gkd<cgf, fts<cgf>> {
   private final fts<cgf> a = this.a();
   private final fts<cgf> i;
   private static final alf j = new alf("textures/entity/fish/tropical_a.png");
   private static final alf k = new alf("textures/entity/fish/tropical_b.png");

   public glo(gix.a $$0) {
      super($$0, new fwg<>($$0.a(fwz.bL)), 0.15F);
      this.i = new fwh<>($$0.a(fwz.bJ));
      this.a(new gnt(this, $$0.f()));
   }

   public alf a(cgf $$0) {
      return switch ($$0.gB().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cgf $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      fts<cgf> $$6 = switch ($$0.gB().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gz().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cgf $$0, ezy $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayz.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
