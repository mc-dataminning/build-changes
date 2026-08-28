public class gwh extends gwf<gzn, gdc> {
   private static final alz a = alz.b("textures/entity/sheep/sheep_fur.png");
   private final gbm<gzn> b;
   private final gbm<gzn> c;

   public gwh(gtn<gzn, gdc> $$0, gek $$1) {
      super($$0);
      this.b = new gdb($$1.a(gen.cz));
      this.c = new gdb($$1.a(gen.cy));
   }

   public void a(fgs $$0, gll $$1, int $$2, gzn $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gbm<gzn> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fgw $$7 = $$1.getBuffer(glv.s(a));
               $$6.a($$0, $$7, $$2, gsr.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = bae.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cwm.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + bae.i($$3.p)) / 25.0F;
               int $$15 = cit.a(cwm.a($$12));
               int $$16 = cit.a(cwm.a($$13));
               $$17 = ayp.a($$14, $$15, $$16);
            } else {
               $$17 = cit.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
