import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fvt {
   public final fwb a = new fwb();
   public final fvt.a b;
   public final fvt.a c;
   public final fvt.a d;
   public final fvt.a e;
   public final fvt.a f;
   public final fvt.a g;
   public final fwe h;
   public final fvt.a i;
   public final fvt.a j;
   public final fvt.a k;
   public final fvt.a l;
   public final fvo m;
   public final fwg n;
   public final fvn o;
   public final fwc p;
   public final fvw q;
   public final fvv r;
   public final fvu s;
   public final fvz t;
   public final fvp u;
   private boolean v;

   public fvt(euk $$0) {
      this.b = new fwh($$0);
      this.c = new fvq($$0);
      this.d = new fvx($$0);
      this.e = new fvs($$0);
      this.f = new fwf($$0);
      this.g = new fwa($$0);
      this.h = new fwe($$0);
      this.i = new fvy($$0);
      this.j = new fwi();
      this.k = new fwd($$0);
      this.l = new fvr($$0);
      this.m = new fvo($$0);
      this.n = new fwg();
      this.o = new fvn($$0);
      this.p = new fwc($$0);
      this.q = new fvw($$0);
      this.r = new fvv();
      this.s = new fvu($$0);
      this.t = new fvz($$0, cth.a);
      this.u = new fvp($$0);
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

   public void a(epd $$0, fsi.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !euk.N().au()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<blf> a(@Nullable blf $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         elb $$2 = $$0.br();
         elb $$3 = $$0.f(1.0F).a((double)$$1);
         elb $$4 = $$2.e($$3);
         ekw $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<blf> $$7 = $$0x -> !$$0x.P_() && $$0x.bt();
         eky $$8 = cfk.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(epd $$0, fsi $$1, hv $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(epd $$0, fsi $$1, hv $$2, hv $$3, float $$4, float $$5, float $$6, float $$7) {
      etv $$8 = euk.N().j.m();
      if ($$8.h()) {
         elb $$9 = $$8.b().e();
         ekw $$10 = ekw.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(epd $$0, fsi $$1, hv $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      etv $$8 = euk.N().j.m();
      if ($$8.h()) {
         elb $$9 = $$8.b().e();
         ekw $$10 = new ekw($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(epd $$0, fsi $$1, ekw $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(epd $$0, fsi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eph $$12 = $$1.getBuffer(fsq.y());
      fsg.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(epd $$0, fsi $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(epd $$0, fsi $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(epd $$0, fsi $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(epd $$0, fsi $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      euk $$11 = euk.N();
      etv $$12 = $$11.j.m();
      if ($$12.h() && $$11.an().d != null) {
         evu $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? evu.a.b : evu.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(epd var1, fsi var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
