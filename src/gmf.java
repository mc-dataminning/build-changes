public class gmf extends gku<cfs, fui<cfs>> {
   private final fui<cfs> a = this.a();
   private final fui<cfs> i;
   private static final akk j = new akk("textures/entity/fish/tropical_a.png");
   private static final akk k = new akk("textures/entity/fish/tropical_b.png");

   public gmf(gjo.a $$0) {
      super($$0, new fww<>($$0.a(fxp.bL)), 0.15F);
      this.i = new fwx<>($$0.a(fxp.bJ));
      this.a(new gok(this, $$0.f()));
   }

   public akk a(cfs $$0) {
      return switch ($$0.gy().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cfs $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      fui<cfs> $$6 = switch ($$0.gy().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gw().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cfs $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayg.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bg()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
