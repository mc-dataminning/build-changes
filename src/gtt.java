public class gtt extends gsv<cnf, gzq, gdj> {
   public static final alz a = alz.b("textures/entity/slime/slime.png");

   public gtt(grp.a $$0) {
      super($$0, new gdj($$0.a(gem.cL)), 0.25F);
      this.a(new gwi(this, $$0.f()));
   }

   public void a(gzq $$0, fgr $$1, glk $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gzq $$0, fgr $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alz a(gzq $$0) {
      return a;
   }

   public gzq b() {
      return new gzq();
   }

   public void a(cnf $$0, gzq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.go();
   }
}
