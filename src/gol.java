public class gol extends gqg<chb, gwb, fyq> {
   private static final all a = all.b("textures/entity/fish/cod.png");

   public gol(gpa.a $$0) {
      super($$0, new fyq($$0.a(gcb.O)), 0.3F);
   }

   @Override
   public all b(gwb $$0) {
      return a;
   }

   public gwb a() {
      return new gwb();
   }

   @Override
   protected void a(gwb $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azn.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
