public class gsq extends gtl<clu, hbc, gcp<hbc>> {
   private static final akv a = akv.b("textures/entity/zombie/zombie.png");

   public gsq(gsf.a $$0, float $$1) {
      super($$0, new gci($$0.a(gfd.aS)), 0.5F * $$1);
      this.a(new gwm<>(this));
      this.a(new gwj<>(this, new gci($$0.a(gfd.aT)), new gci($$0.a(gfd.aU)), $$0.h()));
   }

   public akv a(hbc $$0) {
      return a;
   }

   public hbc b() {
      return new hbc();
   }

   public void a(clu $$0, hbc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsw.a($$0, $$1, $$2, this.i);
   }
}
