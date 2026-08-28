public class gsk extends grk<clm, gxq> {
   private static final alp a = alp.b("textures/entity/lead_knot.png");
   private final gby b;

   public gsk(grl.a $$0) {
      super($$0);
      this.b = new gby($$0.a(gei.br));
   }

   @Override
   public void a(gxq $$0, fgl $$1, glg $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fgp $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hax.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gxq d() {
      return new gxq();
   }
}
