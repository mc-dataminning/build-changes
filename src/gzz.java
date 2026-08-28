public class gzz extends gzy<hdh, ggu> {
   private static final ale a = ale.b("textures/entity/sheep/sheep_fur.png");
   private final gfd<hdh> b;
   private final gfd<hdh> c;

   public gzz(gxh<hdh, ggu> $$0, gic $$1) {
      super($$0);
      this.b = new ggt($$1.a(gif.cM));
      this.c = new ggt($$1.a(gif.cL));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hdh $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gfd<hdh> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               fiu $$7 = $$1.getBuffer(gpn.s(a));
               $$6.a($$0, $$7, $$2, gwl.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = azk.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cxq.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azk.i($$3.u)) / 25.0F;
               int $$15 = cjm.a(cxq.a($$12));
               int $$16 = cjm.a(cxq.a($$13));
               $$17 = axu.a($$14, $$15, $$16);
            } else {
               $$17 = cjm.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
