public class gff extends gfd<cap, fnr<cap>> {
   private static final aiy a = new aiy("textures/entity/sheep/sheep_fur.png");
   private final fnq<cap> b;

   public gff(gcn<cap, fnr<cap>> $$0, foy $$1) {
      super($$0);
      this.b = new fnq<>($$1.a(fpb.be));
   }

   public void a(esa $$0, fvl $$1, int $$2, cap $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.A()) {
         if ($$3.ce()) {
            exh $$10 = exh.O();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               ese $$12 = $$1.getBuffer(fvt.r(a));
               this.b.a($$0, $$12, $$2, gbt.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ae() && "jeb_".equals($$3.ad().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ag / 25 + $$3.aj();
               int $$15 = cnn.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ag % 25) + $$6) / 25.0F;
               float[] $$19 = cap.a(cnn.a($$16));
               float[] $$20 = cap.a(cnn.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cap.a($$3.w());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
