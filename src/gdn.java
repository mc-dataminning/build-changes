public class gdn extends gbz<cgu, fom<cgu>> {
   private static final aiy a = new aiy("textures/entity/villager/villager.png");

   public gdn(gat.a $$0) {
      super($$0, new fom<>($$0.a(fpb.bL)), 0.5F);
      this.a(new gej<>(this, $$0.f(), $$0.d()));
      this.a(new gfp<>(this, $$0.e(), "villager"));
      this.a(new gei<>(this, $$0.d()));
   }

   public aiy a(cgu $$0) {
      return a;
   }

   protected void a(cgu $$0, esa $$1, float $$2) {
      float $$3 = 0.9375F * $$0.dZ();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cgu $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
