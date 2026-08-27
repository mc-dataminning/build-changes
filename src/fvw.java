public class fvw extends fui<cbc, fhj<cbc>> {
   private static final aeu a = new aeu("textures/entity/villager/villager.png");

   public fvw(ftc.a $$0) {
      super($$0, new fhj<>($$0.a(fhw.bJ)), 0.5F);
      this.a(new fwp<>(this, $$0.f(), $$0.d()));
      this.a(new fxv<>(this, $$0.e(), "villager"));
      this.a(new fwo<>(this, $$0.d()));
   }

   public aeu a(cbc $$0) {
      return a;
   }

   protected void a(cbc $$0, elk $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.i_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
