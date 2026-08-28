public class gng extends gne<cfw, fvl<cfw>> {
   private static final alb a = new alb("textures/entity/sheep/sheep_fur.png");
   private final fvk<cfw> b;

   public gng(gko<cfw, fvl<cfw>> $$0, fwr $$1) {
      super($$0);
      this.b = new fvk<>($$1.a(fwu.bi));
   }

   public void a(ezt $$0, gdj $$1, int $$2, cfw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.ch()) {
            ffa $$10 = ffa.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               ezx $$12 = $$1.getBuffer(gdr.r(a));
               this.b.a($$0, $$12, $$2, gjt.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ag() && "jeb_".equals($$3.af().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.al();
               int $$15 = ctd.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               float[] $$19 = cfw.a(ctd.a($$16));
               float[] $$20 = cfw.a(ctd.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cfw.a($$3.u());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
