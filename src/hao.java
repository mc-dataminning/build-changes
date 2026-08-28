public class hao extends han<hdx, ghh> {
   private static final alg a = alg.b("textures/entity/sheep/sheep_fur.png");
   private final gfq<hdx> b;
   private final gfq<hdx> c;

   public hao(gxw<hdx, ghh> $$0, giq $$1) {
      super($$0);
      this.b = new ghg($$1.a(git.cO));
      this.c = new ghg($$1.a(git.cN));
   }

   public void a(fjc $$0, gps $$1, int $$2, hdx $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gfq<hdx> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               fjg $$7 = $$1.getBuffer(gqc.s(a));
               $$6.a($$0, $$7, $$2, gxa.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = azm.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cxw.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azm.i($$3.u)) / 25.0F;
               int $$15 = cjs.a(cxw.a($$12));
               int $$16 = cjs.a(cxw.a($$13));
               $$17 = axw.a($$14, $$15, $$16);
            } else {
               $$17 = cjs.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
