public class gmd extends gny<cgb, gts, fwq> {
   private static final alb a = alb.b("textures/entity/fish/cod.png");

   public gmd(gms.a $$0) {
      super($$0, new fwq($$0.a(gaa.O)), 0.3F);
   }

   public alb b(gts $$0) {
      return a;
   }

   public gts a() {
      return new gts();
   }

   @Override
   protected void a(gts $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azc.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
