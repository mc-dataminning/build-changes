public class gtt extends gsu<cnj, gzu, gdc> {
   private static final akv b = akv.b("textures/entity/piglin/piglin.png");
   private static final akv k = akv.b("textures/entity/piglin/piglin_brute.png");
   public static final gvw.a a = new gvw.a(0.0F, 0.0F, 1.0019531F);

   public gtt(gsd.a $$0, gfa $$1, gfa $$2, gfa $$3, gfa $$4, gfa $$5, gfa $$6) {
      super($$0, new gdc($$0.a($$1)), new gdc($$0.a($$2)), 0.5F, a);
      this.a(new gwh<>(this, new gcm($$0.a($$3)), new gcm($$0.a($$4)), new gcm($$0.a($$5)), new gcm($$0.a($$6)), $$0.h()));
   }

   public akv a(gzu $$0) {
      return $$0.a ? k : b;
   }

   public gzu b() {
      return new gzu();
   }

   public void a(cnj $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bur.aS;
      $$1.d = $$0.gt();
      $$1.c = (float)cvf.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gzu $$0) {
      return super.a($$0) || $$0.b;
   }
}
