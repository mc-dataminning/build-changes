public class gnc extends gln<cmk, fxt<cmk>> {
   private static final akr a = akr.b("textures/entity/villager/villager.png");

   public gnc(gkh.a $$0) {
      super($$0, new fxt<>($$0.a(fyh.bQ)), 0.5F);
      this.a(new gny<>(this, $$0.f(), $$0.d()));
      this.a(new gpe<>(this, $$0.e(), "villager"));
      this.a(new gnx<>(this, $$0.d()));
   }

   public akr a(cmk $$0) {
      return a;
   }

   protected void a(cmk $$0, fbg $$1, float $$2) {
      float $$3 = 0.9375F * $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmk $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
