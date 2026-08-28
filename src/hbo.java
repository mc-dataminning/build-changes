public class hbo extends hbm<hex, gig> {
   private static final alg a = alg.b("textures/entity/sheep/sheep_wool_undercoat.png");
   private final ggp<hex> b;
   private final ggp<hex> c;

   public hbo(gyv<hex, gig> $$0, gjp $$1) {
      super($$0);
      this.b = new gif($$1.a(gjs.cR));
      this.c = new gif($$1.a(gjs.cS));
   }

   public void a(fkd $$0, gqr $$1, int $$2, hex $$3, float $$4, float $$5) {
      if (!$$3.z && ($$3.b() || $$3.d != cyl.a)) {
         ggp<hex> $$6 = $$3.aj ? this.c : this.b;
         a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
      }
   }
}
