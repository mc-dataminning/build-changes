import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fze {
   public final fzm a = new fzm();
   public final fze.a b;
   public final fze.a c;
   public final fze.a d;
   public final fze.a e;
   public final fze.a f;
   public final fze.a g;
   public final fzp h;
   public final fze.a i;
   public final fze.a j;
   public final fze.a k;
   public final fze.a l;
   public final fyz m;
   public final fzr n;
   public final fyy o;
   public final fzn p;
   public final fzh q;
   public final fzg r;
   public final fzf s;
   public final fzk t;
   public final fza u;
   private boolean v;

   public fze(exo $$0) {
      this.b = new fzs($$0);
      this.c = new fzb($$0);
      this.d = new fzi($$0);
      this.e = new fzd($$0);
      this.f = new fzq($$0);
      this.g = new fzl($$0);
      this.h = new fzp($$0);
      this.i = new fzj($$0);
      this.j = new fzt();
      this.k = new fzo($$0);
      this.l = new fzc($$0);
      this.m = new fyz($$0);
      this.n = new fzr();
      this.o = new fyy($$0);
      this.p = new fzn($$0);
      this.q = new fzh($$0);
      this.r = new fzg();
      this.s = new fzf($$0);
      this.t = new fzk($$0, cwa.a);
      this.u = new fza($$0);
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

   public void a(esh $$0, fvt.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !exo.P().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bnq> a(@Nullable bnq $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         enz $$2 = $$0.br();
         enz $$3 = $$0.f(1.0F).a((double)$$1);
         enz $$4 = $$2.e($$3);
         enu $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bnq> $$7 = $$0x -> !$$0x.P_() && $$0x.bt();
         enw $$8 = cif.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(esh $$0, fvt $$1, hz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(esh $$0, fvt $$1, hz $$2, hz $$3, float $$4, float $$5, float $$6, float $$7) {
      ewz $$8 = exo.P().j.m();
      if ($$8.h()) {
         enz $$9 = $$8.b().e();
         enu $$10 = enu.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(esh $$0, fvt $$1, hz $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      ewz $$8 = exo.P().j.m();
      if ($$8.h()) {
         enz $$9 = $$8.b().e();
         enu $$10 = new enu($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(esh $$0, fvt $$1, enu $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(esh $$0, fvt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      esl $$12 = $$1.getBuffer(fwb.y());
      fvr.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(esh $$0, fvt $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(esh $$0, fvt $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(esh $$0, fvt $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(esh $$0, fvt $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      exo $$11 = exo.P();
      ewz $$12 = $$11.j.m();
      if ($$12.h() && $$11.ap().d != null) {
         eyz $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? eyz.a.b : eyz.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(esh var1, fvt var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
