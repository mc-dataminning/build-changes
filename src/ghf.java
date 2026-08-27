public class ghf extends giz<cek, fsm<cek>> {
   private static final akm a = new akm("textures/entity/fish/cod.png");

   public ghf(ght.a $$0) {
      super($$0, new fsm<>($$0.a(fvv.A)), 0.3F);
   }

   public akm a(cek $$0) {
      return a;
   }

   protected void a(cek $$0, eys $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayd.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
