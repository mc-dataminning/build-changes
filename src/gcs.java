public class gcs extends gcq<byo, flf<byo>> {
   private static final ahd a = new ahd("textures/entity/sheep/sheep_fur.png");
   private final fle<byo> b;

   public gcs(gaa<byo, flf<byo>> $$0, fml $$1) {
      super($$0);
      this.b = new fle<>($$1.a(fmo.bf));
   }

   public void a(ept $$0, fsz $$1, int $$2, byo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.A()) {
         if ($$3.ce()) {
            eva $$10 = eva.N();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               epx $$12 = $$1.getBuffer(fth.r(a));
               this.b.a($$0, $$12, $$2, fzg.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ae() && "jeb_".equals($$3.ad().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.aj();
               int $$15 = clf.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = byo.a(clf.a($$16));
               float[] $$20 = byo.a(clf.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = byo.a($$3.w());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
