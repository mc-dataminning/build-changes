public class gvr extends gxn<cjd, hdn, gfk> {
   private static final alg a = alg.b("textures/entity/fish/cod.png");

   public gvr(gwh.a $$0) {
      super($$0, new gfk($$0.a(gjb.ab)), 0.3F);
   }

   @Override
   public alg b(hdn $$0) {
      return a;
   }

   public hdn a() {
      return new hdn();
   }

   @Override
   protected void a(hdn $$0, fjj $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
