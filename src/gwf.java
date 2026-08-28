public class gwf extends gwd<gzl, gda> {
   private static final alz a = alz.b("textures/entity/sheep/sheep_fur.png");
   private final gbk<gzl> b;
   private final gbk<gzl> c;

   public gwf(gtl<gzl, gda> $$0, gei $$1) {
      super($$0);
      this.b = new gcz($$1.a(gel.cz));
      this.c = new gcz($$1.a(gel.cy));
   }

   public void a(fgq $$0, glj $$1, int $$2, gzl $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gbk<gzl> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fgu $$7 = $$1.getBuffer(glt.r(a));
               $$6.a($$0, $$7, $$2, gsp.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = bae.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cwl.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + bae.i($$3.p)) / 25.0F;
               int $$15 = cis.a(cwl.a($$12));
               int $$16 = cis.a(cwl.a($$13));
               $$17 = ayp.a($$14, $$15, $$16);
            } else {
               $$17 = cis.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
