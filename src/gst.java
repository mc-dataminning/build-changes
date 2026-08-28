public class gst extends gsv<cmv, gzq, gcb> {
   private static final alz a = alz.b("textures/entity/slime/magmacube.png");

   public gst(grp.a $$0) {
      super($$0, new gcb($$0.a(gem.bu)), 0.25F);
   }

   protected int a(cmv $$0, jh $$1) {
      return 15;
   }

   public alz a(gzq $$0) {
      return a;
   }

   public gzq b() {
      return new gzq();
   }

   public void a(cmv $$0, gzq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.go();
   }

   public void a(gzq $$0, fgr $$1, glk $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gzq $$0, fgr $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
