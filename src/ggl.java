public class ggl extends ggj<cbi, fov<cbi>> {
   private static final ajc a = new ajc("textures/entity/sheep/sheep_fur.png");
   private final fou<cbi> b;

   public ggl(gdt<cbi, fov<cbi>> $$0, fqb $$1) {
      super($$0);
      this.b = new fou<>($$1.a(fqe.be));
   }

   public void a(etd $$0, fwq $$1, int $$2, cbi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.A()) {
         if ($$3.cb()) {
            eyk $$10 = eyk.P();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               eth $$12 = $$1.getBuffer(fwy.r(a));
               this.b.a($$0, $$12, $$2, gcz.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ae() && "jeb_".equals($$3.ad().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ag / 25 + $$3.aj();
               int $$15 = cog.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ag % 25) + $$6) / 25.0F;
               float[] $$19 = cbi.a(cog.a($$16));
               float[] $$20 = cbi.a(cog.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cbi.a($$3.w());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
