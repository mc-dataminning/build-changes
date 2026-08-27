import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gag implements fzs<dlr> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aww.h(16);
   private static final float d = 0.6666667F;
   private static final ept e = new ept(0.0, 0.33333334F, 0.046666667F);
   private final Map<doo, gag.a> f;
   private final fat g;

   public gag(fzt.a $$0) {
      this.f = doo.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gag.a($$0.a(fre.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dlr $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      dnb $$6 = $$0.n();
      dhb $$7 = (dhb)$$6.b();
      doo $$8 = dhb.a($$7);
      gag.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dhw;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dlr $$0, eub $$1, fxs $$2, int $$3, int $$4, dnb $$5, dhb $$6, doo $$7, fpb $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aC_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aC_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(eub $$0, float $$1, dnb $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dhw)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(eub $$0, fxs $$1, int $$2, int $$3, doo $$4, fpb $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      glf $$7 = this.a($$4);
      euf $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(eub $$0, int $$1, int $$2, fpb $$3, euf $$4) {
      gag.a $$5 = (gag.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   glf a(doo $$0) {
      return fyh.a($$0);
   }

   void a(ib $$0, dls $$1, eub $$2, fxs $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      awi[] $$10 = $$1.a(ezi.Q().aS(), $$1x -> {
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
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fat.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(eub $$0, boolean $$1, ept $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ept d() {
      return e;
   }

   static boolean a(ib $$0, int $$1) {
      if ($$1 == cpd.p.g()) {
         return true;
      } else {
         ezi $$2 = ezi.Q();
         fwu $$3 = $$2.s;
         if ($$3 != null && $$2.m.ay().a() && $$3.gx()) {
            return true;
         } else {
            box $$4 = $$2.ao();
            return $$4 != null && $$4.f(ept.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dls $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cpd.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)awg.b.b($$1) * 0.4);
         int $$4 = (int)((double)awg.b.c($$1) * 0.4);
         int $$5 = (int)((double)awg.b.d($$1) * 0.4);
         return awg.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gag.a a(frb $$0, doo $$1) {
      return new gag.a($$0.a(fre.a($$1)));
   }

   public static frl f() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("sign", frk.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), frh.a);
      $$1.a("stick", frk.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), frh.a);
      return frl.a($$0, 64, 32);
   }

   public static final class a extends fpb {
      public final frf a;
      public final frf b;

      public a(frf $$0) {
         super(fya::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(eub $$0, euf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
