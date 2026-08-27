public class fwd extends fup<cbj, fhq<cbj>> {
   private static final aey a = new aey("textures/entity/villager/villager.png");

   public fwd(ftj.a $$0) {
      super($$0, new fhq<>($$0.a(fid.bJ)), 0.5F);
      this.a(new fww<>(this, $$0.f(), $$0.d()));
      this.a(new fyc<>(this, $$0.e(), "villager"));
      this.a(new fwv<>(this, $$0.d()));
   }

   public aey a(cbj $$0) {
      return a;
   }

   protected void a(cbj $$0, elr $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.m_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
