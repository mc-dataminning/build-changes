public class gya extends gxb<com, hhf, ghv> {
   private static final ali a = ali.b("textures/entity/zombie/drowned.png");

   public gya(gyi.a $$0) {
      super($$0, new ghv($$0.a(gld.aG)), new ghv($$0.a(gld.aH)), new ghv($$0.a(gld.aL)), new ghv($$0.a(gld.aM)), new ghv($$0.a(gld.aI)), new ghv($$0.a(gld.aJ)));
      this.a(new hce(this, $$0.f()));
   }

   public hhf a() {
      return new hhf();
   }

   @Override
   public ali a(hhf $$0) {
      return a;
   }

   protected void a(hhf $$0, flo $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azo.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gio.a a(com $$0, bxl $$1) {
      czy $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.gl() && $$2.a(dac.xd) ? gio.a.e : gio.a.a;
   }
}
