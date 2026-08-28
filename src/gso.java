public class gso extends gtj<cls, hba, gcn<hba>> {
   private static final akv a = akv.b("textures/entity/zombie/zombie.png");

   public gso(gsd.a $$0, float $$1) {
      super($$0, new gcg($$0.a(gfb.aS)), 0.5F * $$1);
      this.a(new gwk<>(this));
      this.a(new gwh<>(this, new gcg($$0.a(gfb.aT)), new gcg($$0.a(gfb.aU)), $$0.h()));
   }

   public akv a(hba $$0) {
      return a;
   }

   public hba b() {
      return new hba();
   }

   public void a(cls $$0, hba $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsu.a($$0, $$1, $$2, this.i);
   }
}
