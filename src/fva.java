import java.util.OptionalInt;

public class fva<T extends bzj> extends fuc<T> {
   private static final gci g = gci.c("item_frame", "map=false");
   private static final gci h = gci.c("item_frame", "map=true");
   private static final gci i = gci.c("glow_item_frame", "map=false");
   private static final gci j = gci.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final fvb k;
   private final fpu l;

   public fva(fud.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, ht $$1) {
      return $$0.ag() == bjx.S ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      hx $$6 = $$0.cD();
      eif $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dD()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dB()));
      boolean $$9 = $$0.cd();
      ckj $$10 = $$0.F();
      if (!$$9) {
         gch $$11 = this.l.a().a();
         gci $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(fpp.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, fzr.d);
         $$3.b();
      }

      if (!$$10.b()) {
         OptionalInt $$13 = $$0.G();
         if ($$9) {
            $$3.a(0.0F, 0.0F, 0.5F);
         } else {
            $$3.a(0.0F, 0.0F, 0.4375F);
         }

         int $$14 = $$13.isPresent() ? $$0.I() % 4 * 2 : $$0.I();
         $$3.a(a.f.rotationDegrees((float)$$14 * 360.0F / 8.0F));
         if ($$13.isPresent()) {
            $$3.a(a.f.rotationDegrees(180.0F));
            float $$15 = 0.0078125F;
            $$3.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$3.a(-64.0F, -64.0F, 0.0F);
            eco $$16 = ckq.a($$13.getAsInt(), $$0.dL());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               ero.O().j.j().a($$3, $$4, $$13.getAsInt(), $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, ckg.i, $$18, fzr.d, $$3, $$4, $$0.dL(), $$0.ah());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ag() == bjx.S ? $$1 : $$2;
   }

   private gci a(T $$0, ckj $$1) {
      boolean $$2 = $$0.ag() == bjx.S;
      if ($$1.a(ckm.rf)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public eif a(T $$0, float $$1) {
      return new eif((double)((float)$$0.cD().j() * 0.3F), -0.25, (double)((float)$$0.cD().l() * 0.3F));
   }

   public afw a(T $$0) {
      return fzz.e;
   }

   protected boolean b(T $$0) {
      if (ero.K() && !$$0.F().b() && $$0.F().A() && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bU() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, ui $$1, emh $$2, fpb $$3, int $$4) {
      super.a($$0, $$0.F().y(), $$2, $$3, $$4);
   }
}
