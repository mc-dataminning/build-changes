import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gmx {
   public final gng a = new gng();
   public final gmx.a b;
   public final gmx.a c;
   public final gmx.a d;
   public final gmx.a e;
   public final gmx.a f;
   public final gne g;
   public final gni h;
   public final gnk i;
   public final gmx.a j;
   public final gmx.a k;
   public final gmx.a l;
   public final gmx.a m;
   public final gmr n;
   public final gnm o;
   public final gmq p;
   public final gnh q;
   public final gna r;
   public final gmz s;
   public final gmy t;
   public final gnd u;
   public final gms v;
   public final gmu w;
   public final gnf x;
   private boolean y;
   private boolean z;

   public gmx(fjx $$0) {
      this.b = new gnn($$0);
      this.c = new gmt($$0);
      this.d = new gnb($$0);
      this.e = new gmw($$0);
      this.f = new gnl($$0);
      this.g = new gne($$0);
      this.h = new gni($$0);
      this.i = new gnk($$0);
      this.j = new gnc($$0);
      this.k = new gno();
      this.l = new gnj($$0);
      this.m = new gmv($$0);
      this.n = new gmr($$0);
      this.o = new gnm();
      this.p = new gmq($$0);
      this.q = new gnh($$0);
      this.r = new gna($$0);
      this.s = new gmz();
      this.t = new gmy($$0);
      this.u = new gnd($$0, dfo.a);
      this.v = new gms($$0);
      this.w = new gmu($$0);
      this.x = new gnf($$0);
   }

   public void a() {
      this.a.a();
      this.b.a();
      this.c.a();
      this.d.a();
      this.e.a();
      this.f.a();
      this.g.a();
      this.i.a();
      this.j.a();
      this.k.a();
      this.l.a();
      this.m.a();
      this.n.a();
      this.o.a();
      this.p.a();
      this.q.a();
      this.r.a();
      this.s.a();
      this.t.a();
      this.u.a();
      this.v.a();
      this.w.a();
   }

   public boolean b() {
      this.y = !this.y;
      return this.y;
   }

   public boolean c() {
      return this.z = !this.z;
   }

   public void a(fek $$0, gmo $$1, gix.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !fjx.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fek $$0, gix.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bui> a(@Nullable bui $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ezr $$2 = $$0.bH();
         ezr $$3 = $$0.g(1.0F).c((double)$$1);
         ezr $$4 = $$2.e($$3);
         ezm $$5 = $$0.cT().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         ezo $$7 = cpm.a($$0, $$2, $$4, $$5, bun.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fek $$0, gix $$1, jh $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fek $$0, gix $$1, jh $$2, jh $$3, float $$4, float $$5, float $$6, float $$7) {
      fjg $$8 = fjx.Q().j.k();
      if ($$8.h()) {
         ezr $$9 = $$8.b().e();
         ezm $$10 = ezm.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fek $$0, gix $$1, jh $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fjg $$8 = fjx.Q().j.k();
      if ($$8.h()) {
         ezr $$9 = $$8.b().e();
         ezm $$10 = new ezm($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fek $$0, gix $$1, ezm $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fek $$0, gix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      feo $$12 = $$1.getBuffer(gjh.A());
      gjr.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fek $$0, gix $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fek $$0, gix $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fek $$0, gix $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fek $$0, gix $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fjx $$11 = fjx.Q();
      fjg $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         flh $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? flh.a.b : flh.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static ezr a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(azn.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ezr(1.0, (double)$$3, 0.0);
         case 1 -> new ezr((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ezr(0.0, 1.0, (double)$$3);
         case 3 -> new ezr(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ezr((double)$$3, 0.0, 1.0);
         case 5 -> new ezr(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ezr a(float $$0, float $$1, float $$2, float $$3) {
      ezr $$4 = a($$3).c((double)$$0);
      ezr $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      ezr $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      ezr $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new ezr($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fek $$0, feo $$1, fal $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<ezm> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gjr.a($$0, $$1, fai.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            ezm $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ezr $$16 = a($$6, $$7, $$8, $$15);
            gjr.a($$0, $$1, fai.a($$14), $$3, $$4, $$5, (float)$$16.d, (float)$$16.e, (float)$$16.f, $$9);
         }
      }
   }

   public interface a {
      void a(fek var1, gix var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
