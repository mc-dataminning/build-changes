public class gdc extends gbz<cfa, foe<cfa>> {
   private static final aiy a = new aiy("textures/entity/strider/strider.png");
   private static final aiy i = new aiy("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gdc(gat.a $$0) {
      super($$0, new foe<>($$0.a(fpb.bz)), 0.5F);
      this.a(new gff<>(this, new foe<>($$0.a(fpb.bA)), new aiy("textures/entity/strider/strider_saddle.png")));
   }

   public aiy a(cfa $$0) {
      return $$0.u() ? i : a;
   }

   protected float b(cfa $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cfa $$0, esa $$1, float $$2) {
      float $$3 = $$0.dZ();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cfa $$0) {
      return super.a($$0) || $$0.u();
   }
}
