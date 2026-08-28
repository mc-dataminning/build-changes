import org.joml.Matrix4f;

public class gxt extends gws<bxi, hdy> {
   public gxt(gwt.a $$0) {
      super($$0);
   }

   public void a(hdy $$0, fjy $$1, gqm $$2, int $$3) {
      float[] $$4 = new float[8];
      float[] $$5 = new float[8];
      float $$6 = 0.0F;
      float $$7 = 0.0F;
      azv $$8 = azv.a($$0.a);

      for (int $$9 = 7; $$9 >= 0; $$9--) {
         $$4[$$9] = $$6;
         $$5[$$9] = $$7;
         $$6 += (float)($$8.a(11) - 5);
         $$7 += (float)($$8.a(11) - 5);
      }

      fkc $$10 = $$2.getBuffer(gqx.p());
      Matrix4f $$11 = $$1.c().a();

      for (int $$12 = 0; $$12 < 4; $$12++) {
         azv $$13 = azv.a($$0.a);

         for (int $$14 = 0; $$14 < 3; $$14++) {
            int $$15 = 7;
            int $$16 = 0;
            if ($$14 > 0) {
               $$15 = 7 - $$14;
            }

            if ($$14 > 0) {
               $$16 = $$15 - 2;
            }

            float $$17 = $$4[$$15] - $$6;
            float $$18 = $$5[$$15] - $$7;

            for (int $$19 = $$15; $$19 >= $$16; $$19--) {
               float $$20 = $$17;
               float $$21 = $$18;
               if ($$14 == 0) {
                  $$17 += (float)($$13.a(11) - 5);
                  $$18 += (float)($$13.a(11) - 5);
               } else {
                  $$17 += (float)($$13.a(31) - 15);
                  $$18 += (float)($$13.a(31) - 15);
               }

               float $$22 = 0.5F;
               float $$23 = 0.45F;
               float $$24 = 0.45F;
               float $$25 = 0.5F;
               float $$26 = 0.1F + (float)$$12 * 0.2F;
               if ($$14 == 0) {
                  $$26 *= (float)$$19 * 0.1F + 1.0F;
               }

               float $$27 = 0.1F + (float)$$12 * 0.2F;
               if ($$14 == 0) {
                  $$27 *= ((float)$$19 - 1.0F) * 0.1F + 1.0F;
               }

               a($$11, $$10, $$17, $$18, $$19, $$20, $$21, 0.45F, 0.45F, 0.5F, $$26, $$27, false, false, true, false);
               a($$11, $$10, $$17, $$18, $$19, $$20, $$21, 0.45F, 0.45F, 0.5F, $$26, $$27, true, false, true, true);
               a($$11, $$10, $$17, $$18, $$19, $$20, $$21, 0.45F, 0.45F, 0.5F, $$26, $$27, true, true, false, true);
               a($$11, $$10, $$17, $$18, $$19, $$20, $$21, 0.45F, 0.45F, 0.5F, $$26, $$27, false, true, false, false);
            }
         }
      }
   }

   private static void a(
      Matrix4f $$0,
      fkc $$1,
      float $$2,
      float $$3,
      int $$4,
      float $$5,
      float $$6,
      float $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      boolean $$12,
      boolean $$13,
      boolean $$14,
      boolean $$15
   ) {
      $$1.a($$0, $$2 + ($$12 ? $$11 : -$$11), (float)($$4 * 16), $$3 + ($$13 ? $$11 : -$$11)).a($$7, $$8, $$9, 0.3F);
      $$1.a($$0, $$5 + ($$12 ? $$10 : -$$10), (float)(($$4 + 1) * 16), $$6 + ($$13 ? $$10 : -$$10)).a($$7, $$8, $$9, 0.3F);
      $$1.a($$0, $$5 + ($$14 ? $$10 : -$$10), (float)(($$4 + 1) * 16), $$6 + ($$15 ? $$10 : -$$10)).a($$7, $$8, $$9, 0.3F);
      $$1.a($$0, $$2 + ($$14 ? $$11 : -$$11), (float)($$4 * 16), $$3 + ($$15 ? $$11 : -$$11)).a($$7, $$8, $$9, 0.3F);
   }

   public hdy a() {
      return new hdy();
   }

   public void a(bxi $$0, hdy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a;
   }

   protected boolean a(bxi $$0) {
      return false;
   }
}
