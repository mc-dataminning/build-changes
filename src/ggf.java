public class ggf extends gfi<chf, frn<chf>> {
   private static final akf a = new akf("textures/entity/zombie/drowned.png");

   public ggf(ggn.a $$0) {
      super($$0, new frn<>($$0.a(fuq.R)), new frn<>($$0.a(fuq.S)), new frn<>($$0.a(fuq.T)));
      this.a(new gkg<>(this, $$0.f()));
   }

   @Override
   public akf a(cik $$0) {
      return a;
   }

   protected void a(chf $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dF();
         float $$8 = axw.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.di() / 2.0F / $$5, 0.0F);
      }
   }
}
