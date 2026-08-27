public class fyw extends fxi<cdm, fkf<cdm>> {
   private static final agm a = new agm("textures/entity/villager/villager.png");

   public fyw(fwc.a $$0) {
      super($$0, new fkf<>($$0.a(fks.bJ)), 0.5F);
      this.a(new fzp<>(this, $$0.f(), $$0.d()));
      this.a(new gav<>(this, $$0.e(), "villager"));
      this.a(new fzo<>(this, $$0.d()));
   }

   public agm a(cdm $$0) {
      return a;
   }

   protected void a(cdm $$0, eob $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.o_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
