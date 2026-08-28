public class gne extends glp<cmk, fxv<cmk>> {
   private static final akr a = akr.b("textures/entity/villager/villager.png");

   public gne(gkj.a $$0) {
      super($$0, new fxv<>($$0.a(fyj.bQ)), 0.5F);
      this.a(new goa<>(this, $$0.f(), $$0.d()));
      this.a(new gpg<>(this, $$0.e(), "villager"));
      this.a(new gnz<>(this, $$0.d()));
   }

   public akr a(cmk $$0) {
      return a;
   }

   protected void a(cmk $$0, fbi $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmk $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
