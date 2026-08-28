public class gte extends gsw<cmz, gzd, gcl> {
   private static final alz a = alz.b("textures/entity/phantom.png");

   public gte(grq.a $$0) {
      super($$0, new gcl($$0.a(gen.bL)), 0.75F);
      this.a(new gwd(this));
   }

   public alz a(gzd $$0) {
      return a;
   }

   public gzd b() {
      return new gzd();
   }

   public void a(cmz $$0, gzd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.p() + $$1.p;
      $$1.b = $$0.m();
   }

   protected void a(gzd $$0, fgs $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gzd $$0, fgs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
