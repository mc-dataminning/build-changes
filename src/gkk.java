public class gkk extends giz<cfg, fso<cfg>> {
   private final fso<cfg> a = this.a();
   private final fso<cfg> i;
   private static final akn j = new akn("textures/entity/fish/tropical_a.png");
   private static final akn k = new akn("textures/entity/fish/tropical_b.png");

   public gkk(ght.a $$0) {
      super($$0, new fvc<>($$0.a(fvv.bL)), 0.15F);
      this.i = new fvd<>($$0.a(fvv.bJ));
      this.a(new gmp(this, $$0.f()));
   }

   public akn a(cfg $$0) {
      return switch ($$0.gA().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cfg $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      fso<cfg> $$6 = switch ($$0.gA().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gy().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cfg $$0, eyu $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayf.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
