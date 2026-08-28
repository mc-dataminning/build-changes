public class gov extends got<cga, fwy<cga>> {
   private static final akr a = akr.b("textures/entity/sheep/sheep_fur.png");
   private final fwx<cga> b;

   public gov(gmd<cga, fwy<cga>> $$0, fye $$1) {
      super($$0);
      this.b = new fwx<>($$1.a(fyh.bj));
   }

   public void a(fbg $$0, gex $$1, int $$2, cga $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.x()) {
         if ($$3.ci()) {
            fgm $$10 = fgm.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               fbk $$12 = $$1.getBuffer(gff.r(a));
               this.b.a($$0, $$12, $$2, gli.c($$3, 0.0F), -16777216);
            }
         } else {
            int $$21;
            if ($$3.ai() && "jeb_".equals($$3.ah().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.an();
               int $$15 = cti.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               int $$19 = cga.a(cti.a($$16));
               int $$20 = cga.a(cti.a($$17));
               $$21 = axy.b.a($$18, $$19, $$20);
            } else {
               $$21 = cga.a($$3.t());
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21);
         }
      }
   }
}
