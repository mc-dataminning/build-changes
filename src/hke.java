public class hke {
   private static final int a = 96;
   private static final float[] b = ag.a(new float[256], $$0 -> {
      for (int $$1 = 0; $$1 < $$0.length; $$1++) {
         $$0[$$1] = (float)Math.pow((double)((float)$$1 / 255.0F), 2.2);
      }
   });

   private hke() {
   }

   public static fkf[] a(fkf[] $$0, int $$1) {
      if ($$1 + 1 <= $$0.length) {
         return $$0;
      } else {
         fkf[] $$2 = new fkf[$$1 + 1];
         $$2[0] = $$0[0];
         boolean $$3 = a($$2[0]);

         for (int $$4 = 1; $$4 <= $$1; $$4++) {
            if ($$4 < $$0.length) {
               $$2[$$4] = $$0[$$4];
            } else {
               fkf $$5 = $$2[$$4 - 1];
               fkf $$6 = new fkf($$5.a() >> 1, $$5.b() >> 1, false);
               int $$7 = $$6.a();
               int $$8 = $$6.b();

               for (int $$9 = 0; $$9 < $$7; $$9++) {
                  for (int $$10 = 0; $$10 < $$8; $$10++) {
                     $$6.b(
                        $$9,
                        $$10,
                        a(
                           $$5.a($$9 * 2 + 0, $$10 * 2 + 0),
                           $$5.a($$9 * 2 + 1, $$10 * 2 + 0),
                           $$5.a($$9 * 2 + 0, $$10 * 2 + 1),
                           $$5.a($$9 * 2 + 1, $$10 * 2 + 1),
                           $$3
                        )
                     );
                  }
               }

               $$2[$$4] = $$6;
            }
         }

         return $$2;
      }
   }

   private static boolean a(fkf $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            if (ayh.a($$0.a($$1, $$2)) == 0) {
               return true;
            }
         }
      }

      return false;
   }

   private static int a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      if ($$4) {
         float $$5 = 0.0F;
         float $$6 = 0.0F;
         float $$7 = 0.0F;
         float $$8 = 0.0F;
         if ($$0 >> 24 != 0) {
            $$5 += a($$0 >> 24);
            $$6 += a($$0 >> 16);
            $$7 += a($$0 >> 8);
            $$8 += a($$0 >> 0);
         }

         if ($$1 >> 24 != 0) {
            $$5 += a($$1 >> 24);
            $$6 += a($$1 >> 16);
            $$7 += a($$1 >> 8);
            $$8 += a($$1 >> 0);
         }

         if ($$2 >> 24 != 0) {
            $$5 += a($$2 >> 24);
            $$6 += a($$2 >> 16);
            $$7 += a($$2 >> 8);
            $$8 += a($$2 >> 0);
         }

         if ($$3 >> 24 != 0) {
            $$5 += a($$3 >> 24);
            $$6 += a($$3 >> 16);
            $$7 += a($$3 >> 8);
            $$8 += a($$3 >> 0);
         }

         $$5 /= 4.0F;
         $$6 /= 4.0F;
         $$7 /= 4.0F;
         $$8 /= 4.0F;
         int $$9 = (int)(Math.pow((double)$$5, 0.45454545454545453) * 255.0);
         int $$10 = (int)(Math.pow((double)$$6, 0.45454545454545453) * 255.0);
         int $$11 = (int)(Math.pow((double)$$7, 0.45454545454545453) * 255.0);
         int $$12 = (int)(Math.pow((double)$$8, 0.45454545454545453) * 255.0);
         if ($$9 < 96) {
            $$9 = 0;
         }

         return ayh.a($$9, $$10, $$11, $$12);
      } else {
         int $$13 = a($$0, $$1, $$2, $$3, 24);
         int $$14 = a($$0, $$1, $$2, $$3, 16);
         int $$15 = a($$0, $$1, $$2, $$3, 8);
         int $$16 = a($$0, $$1, $$2, $$3, 0);
         return ayh.a($$13, $$14, $$15, $$16);
      }
   }

   private static int a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      float $$5 = a($$0 >> $$4);
      float $$6 = a($$1 >> $$4);
      float $$7 = a($$2 >> $$4);
      float $$8 = a($$3 >> $$4);
      float $$9 = (float)((double)((float)Math.pow((double)($$5 + $$6 + $$7 + $$8) * 0.25, 0.45454545454545453)));
      return (int)((double)$$9 * 255.0);
   }

   private static float a(int $$0) {
      return b[$$0 & 0xFF];
   }
}
