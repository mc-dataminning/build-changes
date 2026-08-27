import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fvu implements fvg<did> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aun.h(16);
   private static final float d = 0.6666667F;
   private static final els e = new els(0.0, 0.33333334F, 0.046666667F);
   private final Map<dkt, fvu.a> f;
   private final ewr g;

   public fvu(fvh.a $$0) {
      this.f = dkt.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fvu.a($$0.a(fmv.a($$1)))));
      this.g = $$0.f();
   }

   public void a(did $$0, float $$1, eqa $$2, ftg $$3, int $$4, int $$5) {
      djg $$6 = $$0.r();
      ddo $$7 = (ddo)$$6.b();
      dkt $$8 = ddo.a($$7);
      fvu.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dej;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(did $$0, eqa $$1, ftg $$2, int $$3, int $$4, djg $$5, ddo $$6, dkt $$7, fks $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.aB_(), $$0.l(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(eqa $$0, float $$1, djg $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dej)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(eqa $$0, ftg $$1, int $$2, int $$3, dkt $$4, fks $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      ggp $$7 = this.a($$4);
      eqe $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(eqa $$0, int $$1, int $$2, fks $$3, eqe $$4) {
      fvu.a $$5 = (fvu.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   ggp a(dkt $$0) {
      return ftv.a($$0);
   }

   void a(hx $$0, die $$1, eqa $$2, ftg $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      atz[] $$10 = $$1.a(evh.O().aQ(), $$1x -> {
         List<atz> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? atz.a : $$2x.get(0);
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
         atz $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, ewr.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(eqa $$0, boolean $$1, els $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   els d() {
      return e;
   }

   static boolean a(hx $$0, int $$1) {
      if ($$1 == cll.p.g()) {
         return true;
      } else {
         evh $$2 = evh.O();
         fsi $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gq()) {
            return true;
         } else {
            blu $$4 = $$2.am();
            return $$4 != null && $$4.f(els.b($$0)) < (double)c;
         }
      }
   }

   public static int a(die $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cll.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)atx.b.b($$1) * 0.4);
         int $$4 = (int)((double)atx.b.c($$1) * 0.4);
         int $$5 = (int)((double)atx.b.d($$1) * 0.4);
         return atx.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fvu.a a(fms $$0, dkt $$1) {
      return new fvu.a($$0.a(fmv.a($$1)));
   }

   public static fnc f() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("sign", fnb.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fmy.a);
      $$1.a("stick", fnb.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fmy.a);
      return fnc.a($$0, 64, 32);
   }

   public static final class a extends fks {
      public final fmw a;
      public final fmw b;

      public a(fmw $$0) {
         super(fto::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(eqa $$0, eqe $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
