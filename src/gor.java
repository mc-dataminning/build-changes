public class gor extends gop<cfy, fwu<cfy>> {
   private static final akq a = akq.b("textures/entity/sheep/sheep_fur.png");
   private final fwt<cfy> b;

   public gor(glz<cfy, fwu<cfy>> $$0, fya $$1) {
      super($$0);
      this.b = new fwt<>($$1.a(fyd.bj));
   }

   public void a(fbc $$0, get $$1, int $$2, cfy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.x()) {
         if ($$3.ci()) {
            fgi $$10 = fgi.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               fbg $$12 = $$1.getBuffer(gfb.r(a));
               this.b.a($$0, $$12, $$2, gle.c($$3, 0.0F), -16777216);
            }
         } else {
            int $$21;
            if ($$3.ai() && "jeb_".equals($$3.ah().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.an();
               int $$15 = ctg.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               int $$19 = cfy.a(ctg.a($$16));
               int $$20 = cfy.a(ctg.a($$17));
               $$21 = axx.b.a($$18, $$19, $$20);
            } else {
               $$21 = cfy.a($$3.t());
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21);
         }
      }
   }
}
