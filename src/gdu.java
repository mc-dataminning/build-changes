public class gdu extends gcg<cgy, fou<cgy>> {
   private static final aiy a = new aiy("textures/entity/villager/villager.png");

   public gdu(gba.a $$0) {
      super($$0, new fou<>($$0.a(fpi.bL)), 0.5F);
      this.a(new geq<>(this, $$0.f(), $$0.d()));
      this.a(new gfw<>(this, $$0.e(), "villager"));
      this.a(new gep<>(this, $$0.d()));
   }

   public aiy a(cgy $$0) {
      return a;
   }

   protected void a(cgy $$0, esh $$1, float $$2) {
      float $$3 = 0.9375F * $$0.dZ();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cgy $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
