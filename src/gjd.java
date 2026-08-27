public class gjd extends ght<cdt, frj<cdt>> {
   private final frj<cdt> a = this.a();
   private final frj<cdt> i;
   private static final akf j = new akf("textures/entity/fish/tropical_a.png");
   private static final akf k = new akf("textures/entity/fish/tropical_b.png");

   public gjd(ggn.a $$0) {
      super($$0, new ftx<>($$0.a(fuq.bL)), 0.15F);
      this.i = new fty<>($$0.a(fuq.bJ));
      this.a(new gli(this, $$0.f()));
   }

   public akf a(cdt $$0) {
      return switch ($$0.gA().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cdt $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      frj<cdt> $$6 = switch ($$0.gA().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gy().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cdt $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axw.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
