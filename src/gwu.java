public class gwu extends gws<hac, gdq> {
   private static final akv a = akv.b("textures/entity/sheep/sheep_fur.png");
   private final gca<hac> b;
   private final gca<hac> c;

   public gwu(gua<hac, gdq> $$0, gey $$1) {
      super($$0);
      this.b = new gdp($$1.a(gfb.cC));
      this.c = new gdp($$1.a(gfb.cB));
   }

   public void a(fft $$0, glx $$1, int $$2, hac $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gca<hac> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               ffx $$7 = $$1.getBuffer(gmh.s(a));
               $$6.a($$0, $$7, $$2, gte.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = ayz.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cvl.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + ayz.i($$3.u)) / 25.0F;
               int $$15 = cht.a(cvl.a($$12));
               int $$16 = cht.a(cvl.a($$13));
               $$17 = axk.a($$14, $$15, $$16);
            } else {
               $$17 = cht.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
