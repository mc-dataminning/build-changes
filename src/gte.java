public class gte extends gsf<coj, gzd, gcm> {
   private static final alz b = alz.b("textures/entity/piglin/piglin.png");
   private static final alz k = alz.b("textures/entity/piglin/piglin_brute.png");
   public static final gvh.a a = new gvh.a(0.0F, 0.0F, 1.0019531F);

   public gte(gro.a $$0, gek $$1, gek $$2, gek $$3, gek $$4, gek $$5, gek $$6) {
      super($$0, new gcm($$0.a($$1)), new gcm($$0.a($$2)), 0.5F, a);
      this.a(new gvs<>(this, new gbw($$0.a($$3)), new gbw($$0.a($$4)), new gbw($$0.a($$5)), new gbw($$0.a($$6)), $$0.h()));
   }

   public alz a(gzd $$0) {
      return $$0.a ? k : b;
   }

   public gzd b() {
      return new gzd();
   }

   public void a(coj $$0, gzd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bvq.aT;
      $$1.d = $$0.gn();
      $$1.c = (float)cwf.b($$0.fz(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gzd $$0) {
      return super.a($$0) || $$0.b;
   }
}
