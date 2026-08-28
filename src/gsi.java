public class gsi<T extends cll> extends grk<T, gym> {
   public static final int a = 5;
   public static final int b = 30;
   private final gsj h;
   private final glf i;
   private final gmj j;

   public gsi(grl.a $$0) {
      super($$0);
      this.h = $$0.b();
      this.i = $$0.c();
      this.j = $$0.d();
   }

   protected int a(T $$0, jh $$1) {
      return $$0.aq() == bvi.ag ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(gym $$0, fgl $$1, glg $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a();
      jm $$4 = $$0.a;
      fbr $$5 = this.a($$0);
      $$1.a(-$$5.a(), -$$5.b(), -$$5.c());
      double $$6 = 0.46875;
      $$1.a((double)$$4.j() * 0.46875, (double)$$4.k() * 0.46875, (double)$$4.l() * 0.46875);
      float $$7;
      float $$8;
      if ($$4.o().d()) {
         $$7 = 0.0F;
         $$8 = 180.0F - $$4.p();
      } else {
         $$7 = (float)(-90 * $$4.f().a());
         $$8 = 180.0F;
      }

      $$1.a(a.b.rotationDegrees($$7));
      $$1.a(a.d.rotationDegrees($$8));
      cxg $$11 = $$0.b;
      if (!$$0.u) {
         hdv $$12 = this.j.a().a();
         hdw $$13 = this.a($$0.d, $$11);
         $$1.a();
         $$1.a(-0.5F, -0.5F, -0.5F);
         this.j.b().a($$1.c(), $$2.getBuffer(glq.e(hbf.d)), null, $$12.a($$13), 1.0F, 1.0F, 1.0F, $$3, hax.d);
         $$1.b();
      }

      if (!$$11.f()) {
         evi $$14 = $$0.f;
         if ($$0.u) {
            $$1.a(0.0F, 0.0F, 0.5F);
         } else {
            $$1.a(0.0F, 0.0F, 0.4375F);
         }

         int $$15 = $$14 != null ? $$0.c % 4 * 2 : $$0.c;
         $$1.a(a.f.rotationDegrees((float)$$15 * 360.0F / 8.0F));
         if ($$14 != null) {
            $$1.a(a.f.rotationDegrees(180.0F));
            float $$16 = 0.0078125F;
            $$1.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$1.a(-64.0F, -64.0F, 0.0F);
            $$1.a(0.0F, 0.0F, -1.0F);
            int $$17 = this.a($$0.d, 15728850, $$3);
            this.i.a($$0.g, $$1, $$2, true, $$17);
         } else if ($$0.e != null) {
            int $$18 = this.a($$0.d, 15728880, $$3);
            $$1.b(0.5F, 0.5F, 0.5F);
            this.h.a($$11, cxe.i, false, $$1, $$2, $$18, hax.d, $$0.e);
         }
      }

      $$1.b();
   }

   private int a(boolean $$0, int $$1, int $$2) {
      return $$0 ? $$1 : $$2;
   }

   private hdw a(boolean $$0, cxg $$1) {
      if ($$1.b(ku.L)) {
         return $$0 ? hdk.a : hdk.c;
      } else {
         return $$0 ? hdk.b : hdk.d;
      }
   }

   public fbr a(gym $$0) {
      return new fbr((double)((float)$$0.a.j() * 0.3F), -0.25, (double)((float)$$0.a.l() * 0.3F));
   }

   protected boolean a(T $$0, double $$1) {
      return flz.M() && this.e.c == $$0 && $$0.A().z() != null;
   }

   protected xk a(T $$0) {
      return $$0.A().y();
   }

   public gym a() {
      return new gym();
   }

   public void a(T $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.cO();
      cxg $$3 = $$0.A();
      $$1.b = $$3.v();
      $$1.c = $$0.C();
      $$1.d = $$0.aq() == bvi.ag;
      $$1.e = null;
      $$1.f = null;
      if (!$$1.b.f()) {
         evi $$4 = $$0.a($$3);
         if ($$4 != null) {
            evk $$5 = $$0.dW().a($$4);
            if ($$5 != null) {
               this.i.a($$4, $$5, $$1.g);
               $$1.f = $$4;
            }
         } else {
            $$1.e = this.h.a($$3, $$0.dW(), null, $$0.ar());
         }
      }
   }
}
