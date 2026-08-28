public class gvm extends gsu<cms, hbc, geu> {
   private static final akv a = akv.b("textures/entity/piglin/zombified_piglin.png");

   public gvm(gsd.a $$0, gfa $$1, gfa $$2, gfa $$3, gfa $$4, gfa $$5, gfa $$6) {
      super($$0, new geu($$0.a($$1)), new geu($$0.a($$2)), 0.5F, gtt.a);
      this.a(new gwh<>(this, new gcm($$0.a($$3)), new gcm($$0.a($$4)), new gcm($$0.a($$5)), new gcm($$0.a($$5)), $$0.h()));
   }

   public akv a(hbc $$0) {
      return a;
   }

   public hbc b() {
      return new hbc();
   }

   public void a(cms $$0, hbc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gh();
   }
}
