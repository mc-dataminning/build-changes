import com.google.common.annotations.VisibleForTesting;

public class gov extends gny<ckq, gux> {
   private static final float a = 0.15F;
   private static final float b = 0.0F;
   private static final float h = 0.0F;
   private static final float i = 0.09375F;
   private final gox j;
   private final azr k = azr.a();

   public gov(gnz.a $$0) {
      super($$0);
      this.j = $$0.b();
      this.f = 0.15F;
      this.g = 0.75F;
   }

   public gux a() {
      return new gux();
   }

   public void a(ckq $$0, gux $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.o() + $$2;
      $$1.a = $$0.c;
      cvx $$3 = $$0.m();
      $$1.c = $$3.v();
      $$1.b = this.j.a($$3, $$0.dX(), null, $$0.ar());
   }

   public void a(gux $$0, fdt $$1, ghw $$2, int $$3) {
      gzu $$4 = $$0.b;
      if ($$4 != null) {
         $$1.a();
         cvx $$5 = $$0.c;
         this.k.b((long)a($$5));
         boolean $$6 = $$4.b();
         float $$7 = 0.25F;
         float $$8 = azj.a($$0.p / 10.0F + $$0.a) * 0.1F + 0.1F;
         float $$9 = $$4.f().a(cvv.h).d.y();
         $$1.a(0.0F, $$8 + 0.25F * $$9, 0.0F);
         float $$10 = ckq.e($$0.p, $$0.a);
         $$1.a(a.d.rotation($$10));
         a(this.j, $$1, $$2, $$3, $$5, $$4, $$6, this.k);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public static int a(cvx $$0) {
      return $$0.f() ? 187 : cvt.a($$0.h()) + $$0.o();
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

   public static void a(gox $$0, fdt $$1, ghw $$2, int $$3, cvx $$4, azr $$5, dev $$6) {
      gzu $$7 = $$0.a($$4, $$6, null, 0);
      a($$0, $$1, $$2, $$3, $$4, $$7, $$7.b(), $$5);
   }

   public static void a(gox $$0, fdt $$1, ghw $$2, int $$3, cvx $$4, gzu $$5, boolean $$6, azr $$7) {
      int $$8 = a($$4.L());
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

         $$0.a($$4, cvv.h, false, $$1, $$2, $$3, gxj.d, $$5);
         $$1.b();
         if (!$$6) {
            $$1.a(0.0F * $$9, 0.0F * $$10, 0.09375F * $$11);
         }
      }
   }
}
