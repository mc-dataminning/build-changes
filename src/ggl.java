import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ggl implements gfx<dqx> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aye.h(16);
   private static final float d = 0.6666667F;
   private static final evz e = new evz(0.0, 0.33333334F, 0.046666667F);
   private final Map<dtu, ggl.a> f;
   private final fgx g;

   public ggl(gfy.a $$0) {
      this.f = dtu.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ggl.a($$0.a(fxh.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dqx $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      dsh $$6 = $$0.n();
      dmf $$7 = (dmf)$$6.b();
      dtu $$8 = dmf.a($$7);
      ggl.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dna;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dqx $$0, fag $$1, gdx $$2, int $$3, int $$4, dsh $$5, dmf $$6, dtu $$7, fve $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fag $$0, float $$1, dsh $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dna)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fag $$0, gdx $$1, int $$2, int $$3, dtu $$4, fve $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      grm $$7 = this.a($$4);
      fak $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(fag $$0, int $$1, int $$2, fve $$3, fak $$4) {
      ggl.a $$5 = (ggl.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   grm a(dtu $$0) {
      return gem.a($$0);
   }

   void a(ja $$0, dqy $$1, fag $$2, gdx $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axq[] $$10 = $$1.a(ffn.Q().aS(), $$1x -> {
         List<axq> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axq.a : $$2x.get(0);
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
         axq $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fgx.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fag $$0, boolean $$1, evz $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   evz d() {
      return e;
   }

   static boolean a(ja $$0, int $$1) {
      if ($$1 == cst.p.g()) {
         return true;
      } else {
         ffn $$2 = ffn.Q();
         gcz $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gw()) {
            return true;
         } else {
            bsd $$4 = $$2.an();
            return $$4 != null && $$4.f(evz.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dqy $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cst.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axo.b.b($$1) * 0.4);
         int $$4 = (int)((double)axo.b.c($$1) * 0.4);
         int $$5 = (int)((double)axo.b.d($$1) * 0.4);
         return axo.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ggl.a a(fxe $$0, dtu $$1) {
      return new ggl.a($$0.a(fxh.a($$1)));
   }

   public static fxo f() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("sign", fxn.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fxk.a);
      $$1.a("stick", fxn.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fxk.a);
      return fxo.a($$0, 64, 32);
   }

   public static final class a extends fve {
      public final fxi a;
      public final fxi b;

      public a(fxi $$0) {
         super(gef::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(fag $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
