public class gua extends gty<gxg, gaz> {
   private static final alj a = alj.b("textures/entity/sheep/sheep_fur.png");
   private final fzj<gxg> b;
   private final fzj<gxg> c;

   public gua(grh<gxg, gaz> $$0, gch $$1) {
      super($$0);
      this.b = new gay($$1.a(gck.cw));
      this.c = new gay($$1.a(gck.cv));
   }

   public void a(fer $$0, gjg $$1, int $$2, gxg $$3, float $$4, float $$5) {
      if (!$$3.c) {
         fzj<gxg> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fev $$7 = $$1.getBuffer(gjq.r(a));
               $$6.a($$0, $$7, $$2, gql.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azm.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cvj.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azm.i($$3.p)) / 25.0F;
               int $$15 = chu.a(cvj.a($$12));
               int $$16 = chu.a(cvj.a($$13));
               $$17 = axx.a($$14, $$15, $$16);
            } else {
               $$17 = chu.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
