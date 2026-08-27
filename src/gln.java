import com.google.common.annotations.VisibleForTesting;

public class gln extends gkp<cig> {
   private static final float a = 0.15F;
   private static final float b = 0.0F;
   private static final float g = 0.0F;
   private static final float h = 0.09375F;
   private final glp i;
   private final ayt j = ayt.a();

   public gln(gkq.a $$0) {
      super($$0);
      this.i = $$0.b();
      this.e = 0.15F;
      this.f = 0.75F;
   }

   public akt a(cig $$0) {
      return gqx.e;
   }

   public void a(cig $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      cuh $$6 = $$0.p();
      this.j.b((long)a($$6));
      gsz $$7 = this.i.a($$6, $$0.dU(), null, $$0.al());
      boolean $$8 = $$7.b();
      float $$9 = 0.25F;
      float $$10 = aym.a(((float)$$0.r() + $$2) / 10.0F + $$0.c) * 0.1F + 0.1F;
      float $$11 = $$7.f().a(cue.h).d.y();
      $$3.a(0.0F, $$10 + 0.25F * $$11, 0.0F);
      float $$12 = $$0.a($$2);
      $$3.a(a.d.rotation($$12));
      a(this.i, $$3, $$4, $$5, $$6, $$7, $$8, this.j);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static int a(cuh $$0) {
      return $$0.d() ? 187 : cuc.a($$0.f()) + $$0.m();
   }

   @VisibleForTesting
   static int a(int $$0) {
      if ($$0 <= 1) {
         return 1;
      } else if ($$0 <= 16) {
         return 2;
      } else if ($$0 <= 32) {
         return 3;
      } else {
         return $$0 <= 48 ? 4 : 5;
      }
   }

   public static void a(glp $$0, fbc $$1, gfg $$2, int $$3, cuh $$4, ayt $$5, dca $$6) {
      gsz $$7 = $$0.a($$4, $$6, null, 0);
      a($$0, $$1, $$2, $$3, $$4, $$7, $$7.b(), $$5);
   }

   public static void a(glp $$0, fbc $$1, gfg $$2, int $$3, cuh $$4, gsz $$5, boolean $$6, ayt $$7) {
      int $$8 = a($$4.G());
      float $$9 = $$5.f().h.d.x();
      float $$10 = $$5.f().h.d.y();
      float $$11 = $$5.f().h.d.z();
      if (!$$6) {
         float $$12 = -0.0F * (float)($$8 - 1) * 0.5F * $$9;
         float $$13 = -0.0F * (float)($$8 - 1) * 0.5F * $$10;
         float $$14 = -0.09375F * (float)($$8 - 1) * 0.5F * $$11;
         $$1.a($$12, $$13, $$14);
      }

      for (int $$15 = 0; $$15 < $$8; $$15++) {
         $$1.a();
         if ($$15 > 0) {
            if ($$6) {
               float $$16 = ($$7.i() * 2.0F - 1.0F) * 0.15F;
               float $$17 = ($$7.i() * 2.0F - 1.0F) * 0.15F;
               float $$18 = ($$7.i() * 2.0F - 1.0F) * 0.15F;
               $$1.a($$16, $$17, $$18);
            } else {
               float $$19 = ($$7.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float $$20 = ($$7.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               $$1.a($$19, $$20, 0.0F);
            }
         }

         $$0.a($$4, cue.h, false, $$1, $$2, $$3, gqp.d, $$5);
         $$1.b();
         if (!$$6) {
            $$1.a(0.0F * $$9, 0.0F * $$10, 0.09375F * $$11);
         }
      }
   }
}
