import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fyw {
   public final fze a = new fze();
   public final fyw.a b;
   public final fyw.a c;
   public final fyw.a d;
   public final fyw.a e;
   public final fyw.a f;
   public final fyw.a g;
   public final fzh h;
   public final fyw.a i;
   public final fyw.a j;
   public final fyw.a k;
   public final fyw.a l;
   public final fyr m;
   public final fzj n;
   public final fyq o;
   public final fzf p;
   public final fyz q;
   public final fyy r;
   public final fyx s;
   public final fzc t;
   public final fys u;
   private boolean v;

   public fyw(exh $$0) {
      this.b = new fzk($$0);
      this.c = new fyt($$0);
      this.d = new fza($$0);
      this.e = new fyv($$0);
      this.f = new fzi($$0);
      this.g = new fzd($$0);
      this.h = new fzh($$0);
      this.i = new fzb($$0);
      this.j = new fzl();
      this.k = new fzg($$0);
      this.l = new fyu($$0);
      this.m = new fyr($$0);
      this.n = new fzj();
      this.o = new fyq($$0);
      this.p = new fzf($$0);
      this.q = new fyz($$0);
      this.r = new fyy();
      this.s = new fyx($$0);
      this.t = new fzc($$0, cvw.a);
      this.u = new fys($$0);
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

   public void a(esa $$0, fvl.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !exh.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bno> a(@Nullable bno $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ens $$2 = $$0.br();
         ens $$3 = $$0.f(1.0F).a((double)$$1);
         ens $$4 = $$2.e($$3);
         enn $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bno> $$7 = $$0x -> !$$0x.P_() && $$0x.bt();
         enp $$8 = cib.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(esa $$0, fvl $$1, hz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(esa $$0, fvl $$1, hz $$2, hz $$3, float $$4, float $$5, float $$6, float $$7) {
      ews $$8 = exh.O().j.m();
      if ($$8.h()) {
         ens $$9 = $$8.b().e();
         enn $$10 = enn.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(esa $$0, fvl $$1, hz $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      ews $$8 = exh.O().j.m();
      if ($$8.h()) {
         ens $$9 = $$8.b().e();
         enn $$10 = new enn($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(esa $$0, fvl $$1, enn $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(esa $$0, fvl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ese $$12 = $$1.getBuffer(fvt.y());
      fvj.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(esa $$0, fvl $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(esa $$0, fvl $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(esa $$0, fvl $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(esa $$0, fvl $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      exh $$11 = exh.O();
      ews $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         eys $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? eys.a.b : eys.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(esa var1, fvl var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
