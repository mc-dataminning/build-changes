public class gqv extends gsr<chu, gyo, gaw> {
   private static final alp a = alp.b("textures/entity/fish/cod.png");

   public gqv(grl.a $$0) {
      super($$0, new gaw($$0.a(gei.Z)), 0.3F);
   }

   @Override
   public alp b(gyo $$0) {
      return a;
   }

   public gyo a() {
      return new gyo();
   }

   @Override
   protected void a(gyo $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azu.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
