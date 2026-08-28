import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ggv {
   public final ghd a = new ghd();
   public final ggv.a b;
   public final ggv.a c;
   public final ggv.a d;
   public final ggv.a e;
   public final ggv.a f;
   public final ggv.a g;
   public final ghg h;
   public final ggv.a i;
   public final ggv.a j;
   public final ggv.a k;
   public final ggv.a l;
   public final ggq m;
   public final ghi n;
   public final ggp o;
   public final ghe p;
   public final ggy q;
   public final ggx r;
   public final ggw s;
   public final ghb t;
   public final ggr u;
   private boolean v;

   public ggv(ffa $$0) {
      this.b = new ghj($$0);
      this.c = new ggs($$0);
      this.d = new ggz($$0);
      this.e = new ggu($$0);
      this.f = new ghh($$0);
      this.g = new ghc($$0);
      this.h = new ghg($$0);
      this.i = new gha($$0);
      this.j = new ghk();
      this.k = new ghf($$0);
      this.l = new ggt($$0);
      this.m = new ggq($$0);
      this.n = new ghi();
      this.o = new ggp($$0);
      this.p = new ghe($$0);
      this.q = new ggy($$0);
      this.r = new ggx();
      this.s = new ggw($$0);
      this.t = new ghb($$0, dcc.a);
      this.u = new ggr($$0);
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

   public void a(ezt $$0, gdj.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !ffa.Q().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bsp> a(@Nullable bsp $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         evm $$2 = $$0.bx();
         evm $$3 = $$0.f(1.0F).a((double)$$1);
         evm $$4 = $$2.e($$3);
         evh $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bsp> $$7 = $$0x -> !$$0x.N_() && $$0x.bz();
         evj $$8 = cnm.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(ezt $$0, gdj $$1, iz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ezt $$0, gdj $$1, iz $$2, iz $$3, float $$4, float $$5, float $$6, float $$7) {
      fel $$8 = ffa.Q().j.m();
      if ($$8.h()) {
         evm $$9 = $$8.b().e();
         evh $$10 = evh.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezt $$0, gdj $$1, iz $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fel $$8 = ffa.Q().j.m();
      if ($$8.h()) {
         evm $$9 = $$8.b().e();
         evh $$10 = new evh($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezt $$0, gdj $$1, evh $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ezt $$0, gdj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ezx $$12 = $$1.getBuffer(gdr.A());
      gdh.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ezt $$0, gdj $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ezt $$0, gdj $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ezt $$0, gdj $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ezt $$0, gdj $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ffa $$11 = ffa.Q();
      fel $$12 = $$11.j.m();
      if ($$12.h() && $$11.ap().d != null) {
         fgk $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fgk.a.b : fgk.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(ezt var1, gdj var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
