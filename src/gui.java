public class gui extends gtk<cmh, hah, gdz> {
   public static final akv a = akv.b("textures/entity/slime/slime.png");

   public gui(gse.a $$0) {
      super($$0, new gdz($$0.a(gfc.cO)), 0.25F);
      this.a(new gwx(this, $$0.f()));
   }

   protected float a(hah $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hah $$0, ffu $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public akv b(hah $$0) {
      return a;
   }

   public hah b() {
      return new hah();
   }

   public void a(cmh $$0, hah $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gs();
   }
}
