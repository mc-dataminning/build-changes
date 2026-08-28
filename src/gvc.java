public class gvc extends gud<cnh, hef, gey> {
   private static final ale a = ale.b("textures/entity/zombie/drowned.png");

   public gvc(gvk.a $$0) {
      super($$0, new gey($$0.a(gif.aC)), new gey($$0.a(gif.aD)), new gey($$0.a(gif.aH)), new gey($$0.a(gif.aI)), new gey($$0.a(gif.aE)), new gey($$0.a(gif.aF)));
      this.a(new gzg(this, $$0.f()));
   }

   public hef a() {
      return new hef();
   }

   @Override
   public ale a(hef $$0) {
      return a;
   }

   protected void a(hef $$0, fiq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azk.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gfr.a a(cnh $$0, bws $$1) {
      cys $$2 = $$0.a($$1);
      return $$0.fx() == $$1 && $$0.gh() && $$2.a(cyw.wW) ? gfr.a.e : gfr.a.a;
   }
}
