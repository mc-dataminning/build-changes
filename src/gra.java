public class gra extends gsw<cid, gyt, gbb> {
   private static final alz a = alz.b("textures/entity/fish/cod.png");

   public gra(grq.a $$0) {
      super($$0, new gbb($$0.a(gen.W)), 0.3F);
   }

   @Override
   public alz b(gyt $$0) {
      return a;
   }

   public gyt a() {
      return new gyt();
   }

   @Override
   protected void a(gyt $$0, fgs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bae.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
