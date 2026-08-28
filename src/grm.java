public class grm extends gti<chd, gzi, gbp> {
   private static final aku a = aku.b("textures/entity/fish/cod.png");

   public grm(gsc.a $$0) {
      super($$0, new gbp($$0.a(gfb.Z)), 0.3F);
   }

   @Override
   public aku b(gzi $$0) {
      return a;
   }

   public gzi a() {
      return new gzi();
   }

   @Override
   protected void a(gzi $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
