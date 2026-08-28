public class hbi extends hbh<her, gib> {
   private static final alg a = alg.b("textures/entity/sheep/sheep_fur.png");
   private final ggk<her> b;
   private final ggk<her> c;

   public hbi(gyq<her, gib> $$0, gjk $$1) {
      super($$0);
      this.b = new gia($$1.a(gjn.cQ));
      this.c = new gia($$1.a(gjn.cP));
   }

   public void a(fjy $$0, gqm $$1, int $$2, her $$3, float $$4, float $$5) {
      if (!$$3.c) {
         ggk<her> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               fkc $$7 = $$1.getBuffer(gqx.s(a));
               $$6.a($$0, $$7, $$2, gxu.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = azm.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cyi.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azm.i($$3.u)) / 25.0F;
               int $$15 = cly.a(cyi.a($$12));
               int $$16 = cly.a(cyi.a($$13));
               $$17 = axw.a($$14, $$15, $$16);
            } else {
               $$17 = cly.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
