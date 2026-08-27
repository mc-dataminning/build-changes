import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gae implements fzq<dlp> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aww.h(16);
   private static final float d = 0.6666667F;
   private static final epr e = new epr(0.0, 0.33333334F, 0.046666667F);
   private final Map<dom, gae.a> f;
   private final far g;

   public gae(fzr.a $$0) {
      this.f = dom.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gae.a($$0.a(frc.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dlp $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      dmz $$6 = $$0.n();
      dgz $$7 = (dgz)$$6.b();
      dom $$8 = dgz.a($$7);
      gae.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dhu;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dlp $$0, etz $$1, fxq $$2, int $$3, int $$4, dmz $$5, dgz $$6, dom $$7, foz $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aC_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aC_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(etz $$0, float $$1, dmz $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dhu)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(etz $$0, fxq $$1, int $$2, int $$3, dom $$4, foz $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      glc $$7 = this.a($$4);
      eud $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(etz $$0, int $$1, int $$2, foz $$3, eud $$4) {
      gae.a $$5 = (gae.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   glc a(dom $$0) {
      return fyf.a($$0);
   }

   void a(ib $$0, dlq $$1, etz $$2, fxq $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      awi[] $$10 = $$1.a(ezg.Q().aS(), $$1x -> {
         List<awi> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? awi.a : $$2x.get(0);
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
         awi $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, far.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(etz $$0, boolean $$1, epr $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   epr d() {
      return e;
   }

   static boolean a(ib $$0, int $$1) {
      if ($$1 == cpb.p.g()) {
         return true;
      } else {
         ezg $$2 = ezg.Q();
         fws $$3 = $$2.s;
         if ($$3 != null && $$2.m.ay().a() && $$3.gx()) {
            return true;
         } else {
            bow $$4 = $$2.ao();
            return $$4 != null && $$4.f(epr.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dlq $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cpb.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)awg.b.b($$1) * 0.4);
         int $$4 = (int)((double)awg.b.c($$1) * 0.4);
         int $$5 = (int)((double)awg.b.d($$1) * 0.4);
         return awg.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gae.a a(fqz $$0, dom $$1) {
      return new gae.a($$0.a(frc.a($$1)));
   }

   public static frj f() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("sign", fri.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), frf.a);
      $$1.a("stick", fri.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), frf.a);
      return frj.a($$0, 64, 32);
   }

   public static final class a extends foz {
      public final frd a;
      public final frd b;

      public a(frd $$0) {
         super(fxy::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(etz $$0, eud $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
