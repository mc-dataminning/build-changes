public class gqr extends gmu<chn, gwi, gai> {
   private static final alh a = alh.b("textures/entity/turtle/big_sea_turtle.png");

   public gqr(gnz.a $$0) {
      super($$0, new gai($$0.a(gba.cQ)), new gai($$0.a(gba.cR)), 0.7F);
   }

   protected float a(gwi $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gwi c() {
      return new gwi();
   }

   public void a(chn $$0, gwi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bk() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.p_() && $$0.q();
   }

   public alh b(gwi $$0) {
      return a;
   }
}
