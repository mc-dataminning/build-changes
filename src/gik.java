import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gik {
   public final gis a = new gis();
   public final gik.a b;
   public final gik.a c;
   public final gik.a d;
   public final gik.a e;
   public final gik.a f;
   public final gik.a g;
   public final giv h;
   public final gik.a i;
   public final gik.a j;
   public final gik.a k;
   public final gik.a l;
   public final gif m;
   public final gix n;
   public final gie o;
   public final git p;
   public final gin q;
   public final gim r;
   public final gil s;
   public final giq t;
   public final gig u;
   private boolean v;

   public gik(fgm $$0) {
      this.b = new giy($$0);
      this.c = new gih($$0);
      this.d = new gio($$0);
      this.e = new gij($$0);
      this.f = new giw($$0);
      this.g = new gir($$0);
      this.h = new giv($$0);
      this.i = new gip($$0);
      this.j = new giz();
      this.k = new giu($$0);
      this.l = new gii($$0);
      this.m = new gif($$0);
      this.n = new gix();
      this.o = new gie($$0);
      this.p = new git($$0);
      this.q = new gin($$0);
      this.r = new gim();
      this.s = new gil($$0);
      this.t = new giq($$0, ddf.a);
      this.u = new gig($$0);
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

   public void a(fbg $$0, gex.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fgm.Q().av()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bsr> a(@Nullable bsr $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         exa $$2 = $$0.by();
         exa $$3 = $$0.g(1.0F).a((double)$$1);
         exa $$4 = $$2.e($$3);
         ewv $$5 = $$0.cL().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bsr> $$7 = $$0x -> !$$0x.R_() && $$0x.bA();
         ewx $$8 = cnr.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(fbg $$0, gex $$1, jd $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fbg $$0, gex $$1, jd $$2, jd $$3, float $$4, float $$5, float $$6, float $$7) {
      ffw $$8 = fgm.Q().j.l();
      if ($$8.h()) {
         exa $$9 = $$8.b().e();
         ewv $$10 = ewv.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fbg $$0, gex $$1, jd $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      ffw $$8 = fgm.Q().j.l();
      if ($$8.h()) {
         exa $$9 = $$8.b().e();
         ewv $$10 = new ewv($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fbg $$0, gex $$1, ewv $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fbg $$0, gex $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fbk $$12 = $$1.getBuffer(gff.z());
      gev.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fbg $$0, gex $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fbg $$0, gex $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fbg $$0, gex $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fbg $$0, gex $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fgm $$11 = fgm.Q();
      ffw $$12 = $$11.j.l();
      if ($$12.h() && $$11.ap().d != null) {
         fhv $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fhv.a.b : fhv.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(fbg var1, gex var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
