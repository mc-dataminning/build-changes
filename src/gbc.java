import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gbc {
   public final gbk a = new gbk();
   public final gbc.a b;
   public final gbc.a c;
   public final gbc.a d;
   public final gbc.a e;
   public final gbc.a f;
   public final gbc.a g;
   public final gbn h;
   public final gbc.a i;
   public final gbc.a j;
   public final gbc.a k;
   public final gbc.a l;
   public final gax m;
   public final gbp n;
   public final gaw o;
   public final gbl p;
   public final gbf q;
   public final gbe r;
   public final gbd s;
   public final gbi t;
   public final gay u;
   private boolean v;

   public gbc(ezg $$0) {
      this.b = new gbq($$0);
      this.c = new gaz($$0);
      this.d = new gbg($$0);
      this.e = new gbb($$0);
      this.f = new gbo($$0);
      this.g = new gbj($$0);
      this.h = new gbn($$0);
      this.i = new gbh($$0);
      this.j = new gbr();
      this.k = new gbm($$0);
      this.l = new gba($$0);
      this.m = new gax($$0);
      this.n = new gbp();
      this.o = new gaw($$0);
      this.p = new gbl($$0);
      this.q = new gbf($$0);
      this.r = new gbe();
      this.s = new gbd($$0);
      this.t = new gbi($$0, cxi.a);
      this.u = new gay($$0);
   }

   public void a() {
      this.a.a();
      this.b.a();
      this.c.a();
      this.d.a();
      this.e.a();
      this.f.a();
      this.g.a();
      this.h.a();
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
   }

   public boolean b() {
      this.v = !this.v;
      return this.v;
   }

   public void a(etz $$0, fxq.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !ezg.Q().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bow> a(@Nullable bow $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         epr $$2 = $$0.bu();
         epr $$3 = $$0.f(1.0F).a((double)$$1);
         epr $$4 = $$2.e($$3);
         epm $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bow> $$7 = $$0x -> !$$0x.N_() && $$0x.bw();
         epo $$8 = cjm.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(etz $$0, fxq $$1, ib $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(etz $$0, fxq $$1, ib $$2, ib $$3, float $$4, float $$5, float $$6, float $$7) {
      eyr $$8 = ezg.Q().j.m();
      if ($$8.h()) {
         epr $$9 = $$8.b().e();
         epm $$10 = epm.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(etz $$0, fxq $$1, ib $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eyr $$8 = ezg.Q().j.m();
      if ($$8.h()) {
         epr $$9 = $$8.b().e();
         epm $$10 = new epm($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(etz $$0, fxq $$1, epm $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(etz $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eud $$12 = $$1.getBuffer(fxy.A());
      fxo.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(etz $$0, fxq $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(etz $$0, fxq $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(etz $$0, fxq $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(etz $$0, fxq $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ezg $$11 = ezg.Q();
      eyr $$12 = $$11.j.m();
      if ($$12.h() && $$11.aq().d != null) {
         far $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? far.a.b : far.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(etz var1, fxq var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
