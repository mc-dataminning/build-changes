public class gbu extends gag<cfd, fmu<cfd>> {
   private static final ahh a = new ahh("textures/entity/villager/villager.png");

   public gbu(fza.a $$0) {
      super($$0, new fmu<>($$0.a(fni.bL)), 0.5F);
      this.a(new gcq<>(this, $$0.f(), $$0.d()));
      this.a(new gdw<>(this, $$0.e(), "villager"));
      this.a(new gcp<>(this, $$0.d()));
   }

   public ahh a(cfd $$0) {
      return a;
   }

   protected void a(cfd $$0, eqk $$1, float $$2) {
      float $$3 = 0.9375F * $$0.dY();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cfd $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
