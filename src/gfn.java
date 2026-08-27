public class gfn extends gfl<cat, fny<cat>> {
   private static final aiy a = new aiy("textures/entity/sheep/sheep_fur.png");
   private final fnx<cat> b;

   public gfn(gcv<cat, fny<cat>> $$0, fpf $$1) {
      super($$0);
      this.b = new fnx<>($$1.a(fpi.be));
   }

   public void a(esh $$0, fvt $$1, int $$2, cat $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.A()) {
         if ($$3.ce()) {
            exo $$10 = exo.P();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               esl $$12 = $$1.getBuffer(fwb.r(a));
               this.b.a($$0, $$12, $$2, gcb.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ae() && "jeb_".equals($$3.ad().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ag / 25 + $$3.aj();
               int $$15 = cnr.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ag % 25) + $$6) / 25.0F;
               float[] $$19 = cat.a(cnr.a($$16));
               float[] $$20 = cat.a(cnr.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cat.a($$3.w());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
