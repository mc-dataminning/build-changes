public class gxu extends gxs<hbc, geq> {
   private static final aku a = aku.b("textures/entity/sheep/sheep_fur.png");
   private final gda<hbc> b;
   private final gda<hbc> c;

   public gxu(gva<hbc, geq> $$0, gfy $$1) {
      super($$0);
      this.b = new gep($$1.a(ggb.cE));
      this.c = new gep($$1.a(ggb.cD));
   }

   public void a(fgr $$0, gmx $$1, int $$2, hbc $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gda<hbc> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               fgv $$7 = $$1.getBuffer(gnh.s(a));
               $$6.a($$0, $$7, $$2, gue.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = ayz.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cwe.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + ayz.i($$3.u)) / 25.0F;
               int $$15 = cin.a(cwe.a($$12));
               int $$16 = cin.a(cwe.a($$13));
               $$17 = axk.a($$14, $$15, $$16);
            } else {
               $$17 = cin.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
