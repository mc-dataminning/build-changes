public class gtp extends gvl<cim, hbk, gdo> {
   private static final ald a = ald.b("textures/entity/fish/cod.png");

   public gtp(guf.a $$0) {
      super($$0, new gdo($$0.a(ghc.ab)), 0.3F);
   }

   @Override
   public ald b(hbk $$0) {
      return a;
   }

   public hbk a() {
      return new hbk();
   }

   @Override
   protected void a(hbk $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azk.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
