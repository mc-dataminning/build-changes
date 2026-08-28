public class gtf extends gsg<coj, gze, gcn> {
   private static final alz b = alz.b("textures/entity/piglin/piglin.png");
   private static final alz k = alz.b("textures/entity/piglin/piglin_brute.png");
   public static final gvi.a a = new gvi.a(0.0F, 0.0F, 1.0019531F);

   public gtf(grp.a $$0, gel $$1, gel $$2, gel $$3, gel $$4, gel $$5, gel $$6) {
      super($$0, new gcn($$0.a($$1)), new gcn($$0.a($$2)), 0.5F, a);
      this.a(new gvt<>(this, new gbx($$0.a($$3)), new gbx($$0.a($$4)), new gbx($$0.a($$5)), new gbx($$0.a($$6)), $$0.h()));
   }

   public alz a(gze $$0) {
      return $$0.a ? k : b;
   }

   public gze b() {
      return new gze();
   }

   public void a(coj $$0, gze $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bvq.aT;
      $$1.d = $$0.gp();
      $$1.c = (float)cwf.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gze $$0) {
      return super.a($$0) || $$0.b;
   }
}
