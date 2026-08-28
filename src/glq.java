public class glq extends gkm<cka, fwl<cka>> {
   private static final akk a = new akk("textures/entity/strider/strider.png");
   private static final akk i = new akk("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public glq(gjg.a $$0) {
      super($$0, new fwl<>($$0.a(fxh.bD)), 0.5F);
      this.a(new gnt<>(this, new fwl<>($$0.a(fxh.bE)), new akk("textures/entity/strider/strider_saddle.png")));
   }

   public akk a(cka $$0) {
      return $$0.s() ? i : a;
   }

   protected float b(cka $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cka $$0, fag $$1, float $$2) {
      float $$3 = $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cka $$0) {
      return super.a($$0) || $$0.s();
   }
}
