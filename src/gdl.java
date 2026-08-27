import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gdl {
   public final gdt a = new gdt();
   public final gdl.a b;
   public final gdl.a c;
   public final gdl.a d;
   public final gdl.a e;
   public final gdl.a f;
   public final gdl.a g;
   public final gdw h;
   public final gdl.a i;
   public final gdl.a j;
   public final gdl.a k;
   public final gdl.a l;
   public final gdg m;
   public final gdy n;
   public final gdf o;
   public final gdu p;
   public final gdo q;
   public final gdn r;
   public final gdm s;
   public final gdr t;
   public final gdh u;
   private boolean v;

   public gdl(fbp $$0) {
      this.b = new gdz($$0);
      this.c = new gdi($$0);
      this.d = new gdp($$0);
      this.e = new gdk($$0);
      this.f = new gdx($$0);
      this.g = new gds($$0);
      this.h = new gdw($$0);
      this.i = new gdq($$0);
      this.j = new gea();
      this.k = new gdv($$0);
      this.l = new gdj($$0);
      this.m = new gdg($$0);
      this.n = new gdy();
      this.o = new gdf($$0);
      this.p = new gdu($$0);
      this.q = new gdo($$0);
      this.r = new gdn();
      this.s = new gdm($$0);
      this.t = new gdr($$0, czg.a);
      this.u = new gdh($$0);
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

   public void a(ewi $$0, fzz.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fbp.Q().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bpv> a(@Nullable bpv $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         esa $$2 = $$0.bu();
         esa $$3 = $$0.f(1.0F).a((double)$$1);
         esa $$4 = $$2.e($$3);
         erv $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bpv> $$7 = $$0x -> !$$0x.N_() && $$0x.bw();
         erx $$8 = ckn.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(ewi $$0, fzz $$1, ib $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ewi $$0, fzz $$1, ib $$2, ib $$3, float $$4, float $$5, float $$6, float $$7) {
      fba $$8 = fbp.Q().j.n();
      if ($$8.h()) {
         esa $$9 = $$8.b().e();
         erv $$10 = erv.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ewi $$0, fzz $$1, ib $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fba $$8 = fbp.Q().j.n();
      if ($$8.h()) {
         esa $$9 = $$8.b().e();
         erv $$10 = new erv($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ewi $$0, fzz $$1, erv $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ewi $$0, fzz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ewm $$12 = $$1.getBuffer(gah.A());
      fzx.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ewi $$0, fzz $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ewi $$0, fzz $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ewi $$0, fzz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ewi $$0, fzz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fbp $$11 = fbp.Q();
      fba $$12 = $$11.j.n();
      if ($$12.h() && $$11.aq().d != null) {
         fda $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fda.a.b : fda.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(ewi var1, fzz var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
