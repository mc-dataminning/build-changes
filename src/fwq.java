import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fwq {
   public final fwy a = new fwy();
   public final fwq.a b;
   public final fwq.a c;
   public final fwq.a d;
   public final fwq.a e;
   public final fwq.a f;
   public final fwq.a g;
   public final fxb h;
   public final fwq.a i;
   public final fwq.a j;
   public final fwq.a k;
   public final fwq.a l;
   public final fwl m;
   public final fxd n;
   public final fwk o;
   public final fwz p;
   public final fwt q;
   public final fws r;
   public final fwr s;
   public final fww t;
   public final fwm u;
   private boolean v;

   public fwq(evg $$0) {
      this.b = new fxe($$0);
      this.c = new fwn($$0);
      this.d = new fwu($$0);
      this.e = new fwp($$0);
      this.f = new fxc($$0);
      this.g = new fwx($$0);
      this.h = new fxb($$0);
      this.i = new fwv($$0);
      this.j = new fxf();
      this.k = new fxa($$0);
      this.l = new fwo($$0);
      this.m = new fwl($$0);
      this.n = new fxd();
      this.o = new fwk($$0);
      this.p = new fwz($$0);
      this.q = new fwt($$0);
      this.r = new fws();
      this.s = new fwr($$0);
      this.t = new fww($$0, ctx.a);
      this.u = new fwm($$0);
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

   public void a(epz $$0, ftf.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !evg.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<blu> a(@Nullable blu $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         els $$2 = $$0.br();
         els $$3 = $$0.f(1.0F).a((double)$$1);
         els $$4 = $$2.e($$3);
         eln $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<blu> $$7 = $$0x -> !$$0x.P_() && $$0x.bt();
         elp $$8 = cga.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(epz $$0, ftf $$1, hx $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(epz $$0, ftf $$1, hx $$2, hx $$3, float $$4, float $$5, float $$6, float $$7) {
      eur $$8 = evg.O().j.m();
      if ($$8.h()) {
         els $$9 = $$8.b().e();
         eln $$10 = eln.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(epz $$0, ftf $$1, hx $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eur $$8 = evg.O().j.m();
      if ($$8.h()) {
         els $$9 = $$8.b().e();
         eln $$10 = new eln($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(epz $$0, ftf $$1, eln $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(epz $$0, ftf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eqd $$12 = $$1.getBuffer(ftn.y());
      ftd.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(epz $$0, ftf $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(epz $$0, ftf $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(epz $$0, ftf $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(epz $$0, ftf $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      evg $$11 = evg.O();
      eur $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         ewq $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? ewq.a.b : ewq.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(epz var1, ftf var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
