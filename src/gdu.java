import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gdu {
   public final gec a = new gec();
   public final gdu.a b;
   public final gdu.a c;
   public final gdu.a d;
   public final gdu.a e;
   public final gdu.a f;
   public final gdu.a g;
   public final gef h;
   public final gdu.a i;
   public final gdu.a j;
   public final gdu.a k;
   public final gdu.a l;
   public final gdp m;
   public final geh n;
   public final gdo o;
   public final ged p;
   public final gdx q;
   public final gdw r;
   public final gdv s;
   public final gea t;
   public final gdq u;
   private boolean v;

   public gdu(fby $$0) {
      this.b = new gei($$0);
      this.c = new gdr($$0);
      this.d = new gdy($$0);
      this.e = new gdt($$0);
      this.f = new geg($$0);
      this.g = new geb($$0);
      this.h = new gef($$0);
      this.i = new gdz($$0);
      this.j = new gej();
      this.k = new gee($$0);
      this.l = new gds($$0);
      this.m = new gdp($$0);
      this.n = new geh();
      this.o = new gdo($$0);
      this.p = new ged($$0);
      this.q = new gdx($$0);
      this.r = new gdw();
      this.s = new gdv($$0);
      this.t = new gea($$0, czp.a);
      this.u = new gdq($$0);
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

   public void a(ewr $$0, gai.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fby.Q().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bqa> a(@Nullable bqa $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         esj $$2 = $$0.bu();
         esj $$3 = $$0.f(1.0F).a((double)$$1);
         esj $$4 = $$2.e($$3);
         ese $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bqa> $$7 = $$0x -> !$$0x.N_() && $$0x.bw();
         esg $$8 = cku.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(ewr $$0, gai $$1, id $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ewr $$0, gai $$1, id $$2, id $$3, float $$4, float $$5, float $$6, float $$7) {
      fbj $$8 = fby.Q().j.n();
      if ($$8.h()) {
         esj $$9 = $$8.b().e();
         ese $$10 = ese.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ewr $$0, gai $$1, id $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fbj $$8 = fby.Q().j.n();
      if ($$8.h()) {
         esj $$9 = $$8.b().e();
         ese $$10 = new ese($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ewr $$0, gai $$1, ese $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ewr $$0, gai $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ewv $$12 = $$1.getBuffer(gaq.A());
      gag.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ewr $$0, gai $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ewr $$0, gai $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ewr $$0, gai $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ewr $$0, gai $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fby $$11 = fby.Q();
      fbj $$12 = $$11.j.n();
      if ($$12.h() && $$11.aq().d != null) {
         fdj $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fdj.a.b : fdj.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(ewr var1, gai var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
