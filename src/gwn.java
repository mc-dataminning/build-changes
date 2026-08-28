public abstract class gwn<M extends gcr> extends gwf<gzg, M> {
   private final gch a;
   private final alz b;
   private final gwn.a c;

   public gwn(gsr<?, gzg, M> $$0, gch $$1, alz $$2, gwn.a $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   protected abstract int a(gzg var1);

   private void a(fgs $$0, gll $$1, int $$2, float $$3, float $$4, float $$5) {
      float $$6 = bae.c($$3 * $$3 + $$5 * $$5);
      float $$7 = (float)(Math.atan2((double)$$3, (double)$$5) * 180.0F / (float)Math.PI);
      float $$8 = (float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI);
      $$0.a(a.d.rotationDegrees($$7 - 90.0F));
      $$0.a(a.f.rotationDegrees($$8));
      this.a.a($$0, $$1.getBuffer(this.a.a(this.b)), $$2, hbc.d);
   }

   public void a(fgs $$0, gll $$1, int $$2, gzg $$3, float $$4, float $$5) {
      int $$6 = this.a($$3);
      if ($$6 > 0) {
         bam $$7 = bam.a((long)$$3.aG);

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            $$0.a();
            geo $$9 = this.d().a($$7);
            geo.a $$10 = $$9.a($$7);
            $$9.a($$0);
            float $$11 = $$7.i();
            float $$12 = $$7.i();
            float $$13 = $$7.i();
            if (this.c == gwn.a.b) {
               int $$14 = $$7.a(3);
               switch ($$14) {
                  case 0:
                     $$11 = a($$11);
                     break;
                  case 1:
                     $$12 = a($$12);
                     break;
                  default:
                     $$13 = a($$13);
               }
            }

            $$0.a(bae.h($$11, $$10.b, $$10.e) / 16.0F, bae.h($$12, $$10.c, $$10.f) / 16.0F, bae.h($$13, $$10.d, $$10.g) / 16.0F);
            this.a($$0, $$1, $$2, -($$11 * 2.0F - 1.0F), -($$12 * 2.0F - 1.0F), -($$13 * 2.0F - 1.0F));
            $$0.b();
         }
      }
   }

   private static float a(float $$0) {
      return $$0 > 0.5F ? 1.0F : 0.5F;
   }

   public static enum a {
      a,
      b;
   }
}
