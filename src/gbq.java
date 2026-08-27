public class gbq extends gau<ceu, fna<ceu>> {
   private static final ajc a = new ajc("textures/entity/zombie/drowned.png");

   public gbq(gby.a $$0) {
      super($$0, new fna<>($$0.a(fqe.N)), new fna<>($$0.a(fqe.O)), new fna<>($$0.a(fqe.P)));
      this.a(new gfr<>(this, $$0.f()));
   }

   @Override
   public ajc a(cfz $$0) {
      return a;
   }

   protected void a(ceu $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dB();
         float $$8 = awm.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.de() / 2.0F / $$5, 0.0F);
      }
   }
}
