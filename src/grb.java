public class grb extends gqc<cmg, had, gba> {
   private static final alz a = alz.b("textures/entity/zombie/drowned.png");

   public grb(grj.a $$0) {
      super($$0, new gba($$0.a(geg.at)), new gba($$0.a(geg.au)), new gba($$0.a(geg.ay)), new gba($$0.a(geg.az)), new gba($$0.a(geg.av)), new gba($$0.a(geg.aw)));
      this.a(new gvf(this, $$0.f()));
   }

   public had a() {
      return new had();
   }

   @Override
   public alz a(had $$0) {
      return a;
   }

   protected void a(had $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = bae.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
