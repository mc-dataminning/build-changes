public class gwv extends gwt<had, gdr> {
   private static final akv a = akv.b("textures/entity/sheep/sheep_fur.png");
   private final gcb<had> b;
   private final gcb<had> c;

   public gwv(gub<had, gdr> $$0, gez $$1) {
      super($$0);
      this.b = new gdq($$1.a(gfc.cC));
      this.c = new gdq($$1.a(gfc.cB));
   }

   public void a(ffu $$0, gly $$1, int $$2, had $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gcb<had> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               ffy $$7 = $$1.getBuffer(gmi.s(a));
               $$6.a($$0, $$7, $$2, gtf.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = ayz.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cvm.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + ayz.i($$3.u)) / 25.0F;
               int $$15 = chu.a(cvm.a($$12));
               int $$16 = chu.a(cvm.a($$13));
               $$17 = axk.a($$14, $$15, $$16);
            } else {
               $$17 = chu.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
