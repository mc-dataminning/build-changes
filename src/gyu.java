public class gyu extends gxu<coh, hec> {
   private static final alr a = alr.b("textures/entity/lead_knot.png");
   private final gif g;

   public gyu(gxv.a $$0) {
      super($$0);
      this.g = new gif($$0.a(gkq.bD));
   }

   @Override
   public void a(hec $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      flg $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hkg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hec d() {
      return new hec();
   }
}
