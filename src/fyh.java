import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fyh implements fxt<dkg> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = awi.h(16);
   private static final float d = 0.6666667F;
   private static final enz e = new enz(0.0, 0.33333334F, 0.046666667F);
   private final Map<dmw, fyh.a> f;
   private final eyz g;

   public fyh(fxu.a $$0) {
      this.f = dmw.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fyh.a($$0.a(fpi.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dkg $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      dlj $$6 = $$0.r();
      dfr $$7 = (dfr)$$6.b();
      dmw $$8 = dfr.a($$7);
      fyh.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dgm;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dkg $$0, esh $$1, fvt $$2, int $$3, int $$4, dlj $$5, dfr $$6, dmw $$7, fne $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aE_(), $$0.k(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.aE_(), $$0.l(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(esh $$0, float $$1, dlj $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dgm)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(esh $$0, fvt $$1, int $$2, int $$3, dmw $$4, fne $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gje $$7 = this.a($$4);
      esl $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(esh $$0, int $$1, int $$2, fne $$3, esl $$4) {
      fyh.a $$5 = (fyh.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gje a(dmw $$0) {
      return fwi.a($$0);
   }

   void a(hz $$0, dkh $$1, esh $$2, fvt $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      avu[] $$10 = $$1.a(exo.P().aR(), $$1x -> {
         List<avu> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? avu.a : $$2x.get(0);
      });
      int $$11;
      boolean $$12;
      int $$13;
      if ($$1.a()) {
         $$11 = $$1.b().g();
         $$12 = a($$0, $$11);
         $$13 = 15728880;
      } else {
         $$11 = $$8;
         $$12 = false;
         $$13 = $$4;
      }

      for (int $$17 = 0; $$17 < 4; $$17++) {
         avu $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, eyz.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(esh $$0, boolean $$1, enz $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   enz d() {
      return e;
   }

   static boolean a(hz $$0, int $$1) {
      if ($$1 == cnr.p.g()) {
         return true;
      } else {
         exo $$2 = exo.P();
         fuv $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gr()) {
            return true;
         } else {
            bnq $$4 = $$2.an();
            return $$4 != null && $$4.f(enz.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dkh $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cnr.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)avs.b.b($$1) * 0.4);
         int $$4 = (int)((double)avs.b.c($$1) * 0.4);
         int $$5 = (int)((double)avs.b.d($$1) * 0.4);
         return avs.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fyh.a a(fpf $$0, dmw $$1) {
      return new fyh.a($$0.a(fpi.a($$1)));
   }

   public static fpp f() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("sign", fpo.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fpl.a);
      $$1.a("stick", fpo.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fpl.a);
      return fpp.a($$0, 64, 32);
   }

   public static final class a extends fne {
      public final fpj a;
      public final fpj b;

      public a(fpj $$0) {
         super(fwb::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(esh $$0, esl $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
