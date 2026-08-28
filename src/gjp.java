public class gjp extends glj<cfi, fuu<cfi>> {
   private static final akq a = akq.b("textures/entity/fish/cod.png");

   public gjp(gkd.a $$0) {
      super($$0, new fuu<>($$0.a(fyd.B)), 0.3F);
   }

   public akq a(cfi $$0) {
      return a;
   }

   protected void a(cfi $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayn.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bf()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
