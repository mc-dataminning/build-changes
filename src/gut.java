public class gut extends gtu<coe, hau, gec> {
   private static final aku b = aku.b("textures/entity/piglin/piglin.png");
   private static final aku k = aku.b("textures/entity/piglin/piglin_brute.png");
   public static final gww.a a = new gww.a(0.0F, 0.0F, 1.0019531F);

   public gut(gtd.a $$0, gga $$1, gga $$2, gga $$3, gga $$4, gga $$5, gga $$6) {
      super($$0, new gec($$0.a($$1)), new gec($$0.a($$2)), 0.5F, a);
      this.a(new gxh<>(this, new gdm($$0.a($$3)), new gdm($$0.a($$4)), new gdm($$0.a($$5)), new gdm($$0.a($$6)), $$0.h()));
   }

   public aku a(hau $$0) {
      return $$0.a ? k : b;
   }

   public hau b() {
      return new hau();
   }

   public void a(coe $$0, hau $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bvi.aS;
      $$1.d = $$0.x();
      $$1.c = (float)cvz.b($$0.fD(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hau $$0) {
      return super.a($$0) || $$0.b;
   }
}
