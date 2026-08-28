import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gim {
   public final giu a = new giu();
   public final gim.a b;
   public final gim.a c;
   public final gim.a d;
   public final gim.a e;
   public final gim.a f;
   public final gim.a g;
   public final gix h;
   public final gim.a i;
   public final gim.a j;
   public final gim.a k;
   public final gim.a l;
   public final gih m;
   public final giz n;
   public final gig o;
   public final giv p;
   public final gip q;
   public final gio r;
   public final gin s;
   public final gis t;
   public final gii u;
   private boolean v;

   public gim(fgo $$0) {
      this.b = new gja($$0);
      this.c = new gij($$0);
      this.d = new giq($$0);
      this.e = new gil($$0);
      this.f = new giy($$0);
      this.g = new git($$0);
      this.h = new gix($$0);
      this.i = new gir($$0);
      this.j = new gjb();
      this.k = new giw($$0);
      this.l = new gik($$0);
      this.m = new gih($$0);
      this.n = new giz();
      this.o = new gig($$0);
      this.p = new giv($$0);
      this.q = new gip($$0);
      this.r = new gio();
      this.s = new gin($$0);
      this.t = new gis($$0, ddf.a);
      this.u = new gii($$0);
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

   public void a(fbi $$0, gez.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fgo.Q().av()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bsr> a(@Nullable bsr $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         exc $$2 = $$0.by();
         exc $$3 = $$0.g(1.0F).a((double)$$1);
         exc $$4 = $$2.e($$3);
         ewx $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bsr> $$7 = $$0x -> !$$0x.R_() && $$0x.bA();
         ewz $$8 = cnr.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(fbi $$0, gez $$1, jd $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fbi $$0, gez $$1, jd $$2, jd $$3, float $$4, float $$5, float $$6, float $$7) {
      ffy $$8 = fgo.Q().j.l();
      if ($$8.h()) {
         exc $$9 = $$8.b().e();
         ewx $$10 = ewx.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fbi $$0, gez $$1, jd $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      ffy $$8 = fgo.Q().j.l();
      if ($$8.h()) {
         exc $$9 = $$8.b().e();
         ewx $$10 = new ewx($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fbi $$0, gez $$1, ewx $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fbm $$12 = $$1.getBuffer(gfh.A());
      gex.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fbi $$0, gez $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fbi $$0, gez $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fbi $$0, gez $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fbi $$0, gez $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fgo $$11 = fgo.Q();
      ffy $$12 = $$11.j.l();
      if ($$12.h() && $$11.ap().d != null) {
         fhx $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fhx.a.b : fhx.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(fbi var1, gez var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
