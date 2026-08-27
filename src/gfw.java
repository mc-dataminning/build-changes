import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gfw {
   public final gge a = new gge();
   public final gfw.a b;
   public final gfw.a c;
   public final gfw.a d;
   public final gfw.a e;
   public final gfw.a f;
   public final gfw.a g;
   public final ggh h;
   public final gfw.a i;
   public final gfw.a j;
   public final gfw.a k;
   public final gfw.a l;
   public final gfr m;
   public final ggj n;
   public final gfq o;
   public final ggf p;
   public final gfz q;
   public final gfy r;
   public final gfx s;
   public final ggc t;
   public final gfs u;
   private boolean v;

   public gfw(fdz $$0) {
      this.b = new ggk($$0);
      this.c = new gft($$0);
      this.d = new gga($$0);
      this.e = new gfv($$0);
      this.f = new ggi($$0);
      this.g = new ggd($$0);
      this.h = new ggh($$0);
      this.i = new ggb($$0);
      this.j = new ggl();
      this.k = new ggg($$0);
      this.l = new gfu($$0);
      this.m = new gfr($$0);
      this.n = new ggj();
      this.o = new gfq($$0);
      this.p = new ggf($$0);
      this.q = new gfz($$0);
      this.r = new gfy();
      this.s = new gfx($$0);
      this.t = new ggc($$0, dbg.a);
      this.u = new gfs($$0);
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

   public void a(eys $$0, gck.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fdz.Q().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bru> a(@Nullable bru $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         euk $$2 = $$0.bx();
         euk $$3 = $$0.f(1.0F).a((double)$$1);
         euk $$4 = $$2.e($$3);
         euf $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bru> $$7 = $$0x -> !$$0x.N_() && $$0x.bz();
         euh $$8 = cmq.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(eys $$0, gck $$1, io $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(eys $$0, gck $$1, io $$2, io $$3, float $$4, float $$5, float $$6, float $$7) {
      fdk $$8 = fdz.Q().j.m();
      if ($$8.h()) {
         euk $$9 = $$8.b().e();
         euf $$10 = euf.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eys $$0, gck $$1, io $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fdk $$8 = fdz.Q().j.m();
      if ($$8.h()) {
         euk $$9 = $$8.b().e();
         euf $$10 = new euf($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eys $$0, gck $$1, euf $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(eys $$0, gck $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eyw $$12 = $$1.getBuffer(gcs.A());
      gci.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(eys $$0, gck $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(eys $$0, gck $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(eys $$0, gck $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(eys $$0, gck $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fdz $$11 = fdz.Q();
      fdk $$12 = $$11.j.m();
      if ($$12.h() && $$11.aq().d != null) {
         ffk $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? ffk.a.b : ffk.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(eys var1, gck var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
