import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gis {
   public final gja a = new gja();
   public final gis.a b;
   public final gis.a c;
   public final gis.a d;
   public final gis.a e;
   public final gis.a f;
   public final gis.a g;
   public final gjd h;
   public final gis.a i;
   public final gis.a j;
   public final gis.a k;
   public final gis.a l;
   public final gin m;
   public final gjf n;
   public final gim o;
   public final gjb p;
   public final giv q;
   public final giu r;
   public final git s;
   public final giy t;
   public final gio u;
   private boolean v;

   public gis(fgj $$0) {
      this.b = new gjg($$0);
      this.c = new gip($$0);
      this.d = new giw($$0);
      this.e = new gir($$0);
      this.f = new gje($$0);
      this.g = new giz($$0);
      this.h = new gjd($$0);
      this.i = new gix($$0);
      this.j = new gjh();
      this.k = new gjc($$0);
      this.l = new giq($$0);
      this.m = new gin($$0);
      this.n = new gjf();
      this.o = new gim($$0);
      this.p = new gjb($$0);
      this.q = new giv($$0);
      this.r = new giu();
      this.s = new git($$0);
      this.t = new giy($$0, dcj.a);
      this.u = new gio($$0);
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

   public void a(fbc $$0, gfg.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fgj.Q().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<brv> a(@Nullable brv $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ewu $$2 = $$0.bC();
         ewu $$3 = $$0.f(1.0F).a((double)$$1);
         ewu $$4 = $$2.e($$3);
         ewp $$5 = $$0.cP().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<brv> $$7 = $$0x -> !$$0x.O_() && $$0x.bE();
         ewr $$8 = cmu.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(fbc $$0, gfg $$1, ir $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fbc $$0, gfg $$1, ir $$2, ir $$3, float $$4, float $$5, float $$6, float $$7) {
      ffu $$8 = fgj.Q().j.m();
      if ($$8.h()) {
         ewu $$9 = $$8.b().e();
         ewp $$10 = ewp.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fbc $$0, gfg $$1, ir $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      ffu $$8 = fgj.Q().j.m();
      if ($$8.h()) {
         ewu $$9 = $$8.b().e();
         ewp $$10 = new ewp($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fbc $$0, gfg $$1, ewp $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fbc $$0, gfg $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fbg $$12 = $$1.getBuffer(gfo.B());
      gfe.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fbc $$0, gfg $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fbc $$0, gfg $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fbc $$0, gfg $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fbc $$0, gfg $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fgj $$11 = fgj.Q();
      ffu $$12 = $$11.j.m();
      if ($$12.h() && $$11.aq().d != null) {
         fhy $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fhy.a.b : fhy.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(fbc var1, gfg var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
