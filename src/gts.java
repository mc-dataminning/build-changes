public class gts extends gst<cnk, gzt, gdc> {
   private static final aku b = aku.b("textures/entity/piglin/piglin.png");
   private static final aku k = aku.b("textures/entity/piglin/piglin_brute.png");
   public static final gvv.a a = new gvv.a(0.0F, 0.0F, 1.0019531F);

   public gts(gsc.a $$0, gfa $$1, gfa $$2, gfa $$3, gfa $$4, gfa $$5, gfa $$6) {
      super($$0, new gdc($$0.a($$1)), new gdc($$0.a($$2)), 0.5F, a);
      this.a(new gwg<>(this, new gcm($$0.a($$3)), new gcm($$0.a($$4)), new gcm($$0.a($$5)), new gcm($$0.a($$6)), $$0.h()));
   }

   public aku a(gzt $$0) {
      return $$0.a ? k : b;
   }

   public gzt b() {
      return new gzt();
   }

   public void a(cnk $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bur.aT;
      $$1.d = $$0.gq();
      $$1.c = (float)cvg.b($$0.fB(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gzt $$0) {
      return super.a($$0) || $$0.b;
   }
}
