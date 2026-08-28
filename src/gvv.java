public class gvv extends guw<cow, hbv, gfd> {
   private static final ald j = ald.b("textures/entity/piglin/piglin.png");
   private static final ald k = ald.b("textures/entity/piglin/piglin_brute.png");
   public static final gxy.a a = new gxy.a(0.0F, 0.0F, 1.0019531F);

   public gvv(guf.a $$0, ghb $$1, ghb $$2, ghb $$3, ghb $$4, ghb $$5, ghb $$6) {
      super($$0, new gfd($$0.a($$1)), new gfd($$0.a($$2)), 0.5F, a);
      this.a(new gyi<>(this, new gen($$0.a($$3)), new gen($$0.a($$4)), new gen($$0.a($$5)), new gen($$0.a($$6)), $$0.h()));
   }

   public ald a(hbv $$0) {
      return $$0.a ? k : j;
   }

   public hbv b() {
      return new hbv();
   }

   public void a(cow $$0, hbv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bwb.aS;
      $$1.d = $$0.x();
      $$1.c = (float)cwq.b($$0.fA(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hbv $$0) {
      return super.a($$0) || $$0.b;
   }
}
