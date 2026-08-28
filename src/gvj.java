public class gvj extends gxf<ciz, hdf, gfd> {
   private static final alg a = alg.b("textures/entity/fish/cod.png");

   public gvj(gvz.a $$0) {
      super($$0, new gfd($$0.a(git.ab)), 0.3F);
   }

   @Override
   public alg b(hdf $$0) {
      return a;
   }

   public hdf a() {
      return new hdf();
   }

   @Override
   protected void a(hdf $$0, fjc $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
