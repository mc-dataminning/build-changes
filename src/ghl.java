public class ghl extends ghj<cbz, fpt<cbz>> {
   private static final ajh a = new ajh("textures/entity/sheep/sheep_fur.png");
   private final fps<cbz> b;

   public ghl(get<cbz, fpt<cbz>> $$0, fqz $$1) {
      super($$0);
      this.b = new fps<>($$1.a(frc.be));
   }

   public void a(etz $$0, fxq $$1, int $$2, cbz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.ce()) {
            ezg $$10 = ezg.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               eud $$12 = $$1.getBuffer(fxy.r(a));
               this.b.a($$0, $$12, $$2, gdz.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ae() && "jeb_".equals($$3.ad().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.aj();
               int $$15 = cpb.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = cbz.a(cpb.a($$16));
               float[] $$20 = cbz.a(cpb.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cbz.a($$3.s());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
