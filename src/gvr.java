public class gvr extends gus<cnn, hev, gfl> {
   private static final alg a = alg.b("textures/entity/zombie/drowned.png");

   public gvr(gvz.a $$0) {
      super($$0, new gfl($$0.a(git.aE)), new gfl($$0.a(git.aF)), new gfl($$0.a(git.aJ)), new gfl($$0.a(git.aK)), new gfl($$0.a(git.aG)), new gfl($$0.a(git.aH)));
      this.a(new gzv(this, $$0.f()));
   }

   public hev a() {
      return new hev();
   }

   @Override
   public alg a(hev $$0) {
      return a;
   }

   protected void a(hev $$0, fjc $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azm.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gge.a a(cnn $$0, bwv $$1) {
      cyy $$2 = $$0.a($$1);
      return $$0.fx() == $$1 && $$0.gh() && $$2.a(czc.wY) ? gge.a.e : gge.a.a;
   }
}
