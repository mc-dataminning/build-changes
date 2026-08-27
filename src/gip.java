public class gip extends ght<cia, ftp<cia>> {
   private static final akf a = new akf("textures/entity/slime/slime.png");

   public gip(ggn.a $$0) {
      super($$0, new ftp<>($$0.a(fuq.bs)), 0.25F);
      this.a(new gld<>(this, $$0.f()));
   }

   public void a(cia $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cia $$0, exn $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gq();
      float $$5 = axw.i($$2, $$0.bX, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public akf a(cia $$0) {
      return a;
   }
}
