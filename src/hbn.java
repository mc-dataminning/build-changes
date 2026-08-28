public class hbn extends hbm<hex, gig> {
   private static final alg a = alg.b("textures/entity/sheep/sheep_wool.png");
   private final ggp<hex> b;
   private final ggp<hex> c;

   public hbn(gyv<hex, gig> $$0, gjp $$1) {
      super($$0);
      this.b = new gif($$1.a(gjs.cQ));
      this.c = new gif($$1.a(gjs.cP));
   }

   public void a(fkd $$0, gqr $$1, int $$2, hex $$3, float $$4, float $$5) {
      if (!$$3.c) {
         ggp<hex> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               fkh $$7 = $$1.getBuffer(grc.s(a));
               $$6.a($$0, $$7, $$2, gxz.a($$3, 0.0F), -16777216);
            }
         } else {
            a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
         }
      }
   }
}
