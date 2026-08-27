public class fye extends fwq<ccz, fjn<ccz>> {
   private static final agg a = new agg("textures/entity/villager/villager.png");

   public fye(fvk.a $$0) {
      super($$0, new fjn<>($$0.a(fka.bJ)), 0.5F);
      this.a(new fyx<>(this, $$0.f(), $$0.d()));
      this.a(new gad<>(this, $$0.e(), "villager"));
      this.a(new fyw<>(this, $$0.d()));
   }

   public agg a(ccz $$0) {
      return a;
   }

   protected void a(ccz $$0, enk $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.n_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
