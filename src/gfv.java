public class gfv extends geh<cih, fqq<cih>> {
   private static final ajh a = new ajh("textures/entity/villager/villager.png");

   public gfv(gdb.a $$0) {
      super($$0, new fqq<>($$0.a(fre.bP)), 0.5F);
      this.a(new ggr<>(this, $$0.f(), $$0.d()));
      this.a(new ghx<>(this, $$0.e(), "villager"));
      this.a(new ggq<>(this, $$0.d()));
   }

   public ajh a(cih $$0) {
      return a;
   }

   protected void a(cih $$0, eub $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cih $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
