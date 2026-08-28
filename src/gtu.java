public class gtu extends gsw<cng, gzr, gdk> {
   public static final alz a = alz.b("textures/entity/slime/slime.png");

   public gtu(grq.a $$0) {
      super($$0, new gdk($$0.a(gen.cL)), 0.25F);
      this.a(new gwj(this, $$0.f()));
   }

   public void a(gzr $$0, fgs $$1, gll $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gzr $$0, fgs $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alz a(gzr $$0) {
      return a;
   }

   public gzr b() {
      return new gzr();
   }

   public void a(cng $$0, gzr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.go();
   }
}
