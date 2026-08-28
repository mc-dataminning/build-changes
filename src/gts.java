public class gts extends gsu<cnf, gzp, gdi> {
   public static final alz a = alz.b("textures/entity/slime/slime.png");

   public gts(gro.a $$0) {
      super($$0, new gdi($$0.a(gel.cL)), 0.25F);
      this.a(new gwh(this, $$0.f()));
   }

   public void a(gzp $$0, fgq $$1, glj $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gzp $$0, fgq $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alz a(gzp $$0) {
      return a;
   }

   public gzp b() {
      return new gzp();
   }

   public void a(cnf $$0, gzp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.gm();
   }
}
