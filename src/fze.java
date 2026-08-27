import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fze implements fyq<dku> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = awm.h(16);
   private static final float d = 0.6666667F;
   private static final eov e = new eov(0.0, 0.33333334F, 0.046666667F);
   private final Map<dnr, fze.a> f;
   private final ezv g;

   public fze(fyr.a $$0) {
      this.f = dnr.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fze.a($$0.a(fqe.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dku $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      dme $$6 = $$0.n();
      dge $$7 = (dge)$$6.b();
      dnr $$8 = dge.a($$7);
      fze.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dgz;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dku $$0, etd $$1, fwq $$2, int $$3, int $$4, dme $$5, dge $$6, dnr $$7, foa $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aD_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aD_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(etd $$0, float $$1, dme $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dgz)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(etd $$0, fwq $$1, int $$2, int $$3, dnr $$4, foa $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gkc $$7 = this.a($$4);
      eth $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(etd $$0, int $$1, int $$2, foa $$3, eth $$4) {
      fze.a $$5 = (fze.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gkc a(dnr $$0) {
      return fxf.a($$0);
   }

   void a(ib $$0, dkv $$1, etd $$2, fwq $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      avy[] $$10 = $$1.a(eyk.P().aR(), $$1x -> {
         List<avy> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? avy.a : $$2x.get(0);
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
         avy $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, ezv.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(etd $$0, boolean $$1, eov $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   eov d() {
      return e;
   }

   static boolean a(ib $$0, int $$1) {
      if ($$1 == cog.p.g()) {
         return true;
      } else {
         eyk $$2 = eyk.P();
         fvs $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gt()) {
            return true;
         } else {
            bof $$4 = $$2.an();
            return $$4 != null && $$4.f(eov.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dkv $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cog.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)avw.b.b($$1) * 0.4);
         int $$4 = (int)((double)avw.b.c($$1) * 0.4);
         int $$5 = (int)((double)avw.b.d($$1) * 0.4);
         return avw.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fze.a a(fqb $$0, dnr $$1) {
      return new fze.a($$0.a(fqe.a($$1)));
   }

   public static fql f() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("sign", fqk.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fqh.a);
      $$1.a("stick", fqk.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fqh.a);
      return fql.a($$0, 64, 32);
   }

   public static final class a extends foa {
      public final fqf a;
      public final fqf b;

      public a(fqf $$0) {
         super(fwy::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(etd $$0, eth $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
