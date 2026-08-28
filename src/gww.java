public class gww extends gwu<hae, gds> {
   private static final akv a = akv.b("textures/entity/sheep/sheep_fur.png");
   private final gcc<hae> b;
   private final gcc<hae> c;

   public gww(guc<hae, gds> $$0, gfa $$1) {
      super($$0);
      this.b = new gdr($$1.a(gfd.cC));
      this.c = new gdr($$1.a(gfd.cB));
   }

   public void a(ffv $$0, glz $$1, int $$2, hae $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gcc<hae> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               ffz $$7 = $$1.getBuffer(gmj.s(a));
               $$6.a($$0, $$7, $$2, gtg.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = ayz.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cvn.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + ayz.i($$3.u)) / 25.0F;
               int $$15 = chv.a(cvn.a($$12));
               int $$16 = chv.a(cvn.a($$13));
               $$17 = axk.a($$14, $$15, $$16);
            } else {
               $$17 = chv.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
