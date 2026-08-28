public class haw extends hav<hef, ghp> {
   private static final alg a = alg.b("textures/entity/sheep/sheep_fur.png");
   private final gfy<hef> b;
   private final gfy<hef> c;

   public haw(gye<hef, ghp> $$0, giy $$1) {
      super($$0);
      this.b = new gho($$1.a(gjb.cQ));
      this.c = new gho($$1.a(gjb.cP));
   }

   public void a(fjj $$0, gqa $$1, int $$2, hef $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gfy<hef> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               fjn $$7 = $$1.getBuffer(gqk.s(a));
               $$6.a($$0, $$7, $$2, gxi.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = azm.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cyb.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azm.i($$3.u)) / 25.0F;
               int $$15 = cjw.a(cyb.a($$12));
               int $$16 = cjw.a(cyb.a($$13));
               $$17 = axw.a($$14, $$15, $$16);
            } else {
               $$17 = cjw.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
