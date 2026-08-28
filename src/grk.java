public class grk extends gqg<cmi, gxc, gbe> {
   private static final all a = all.b("textures/entity/strider/strider.png");
   private static final all b = all.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public grk(gpa.a $$0) {
      super($$0, new gbe($$0.a(gcb.cF)), 0.5F);
      this.a(new gto<>(this, new gbe($$0.a(gcb.cG)), all.b("textures/entity/strider/strider_saddle.png")));
   }

   public all a(gxc $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gxc $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gxc c() {
      return new gxc();
   }

   public void a(cmi $$0, gxc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.q();
      $$1.c = $$0.cc();
   }

   protected void a(gxc $$0, fek $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gxc $$0) {
      return super.a($$0) || $$0.b;
   }
}
