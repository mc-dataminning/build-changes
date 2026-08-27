import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fxe {
   public final fxm a = new fxm();
   public final fxe.a b;
   public final fxe.a c;
   public final fxe.a d;
   public final fxe.a e;
   public final fxe.a f;
   public final fxe.a g;
   public final fxp h;
   public final fxe.a i;
   public final fxe.a j;
   public final fxe.a k;
   public final fxe.a l;
   public final fwz m;
   public final fxr n;
   public final fwy o;
   public final fxn p;
   public final fxh q;
   public final fxg r;
   public final fxf s;
   public final fxk t;
   public final fxa u;
   private boolean v;

   public fxe(evr $$0) {
      this.b = new fxs($$0);
      this.c = new fxb($$0);
      this.d = new fxi($$0);
      this.e = new fxd($$0);
      this.f = new fxq($$0);
      this.g = new fxl($$0);
      this.h = new fxp($$0);
      this.i = new fxj($$0);
      this.j = new fxt();
      this.k = new fxo($$0);
      this.l = new fxc($$0);
      this.m = new fwz($$0);
      this.n = new fxr();
      this.o = new fwy($$0);
      this.p = new fxn($$0);
      this.q = new fxh($$0);
      this.r = new fxg();
      this.s = new fxf($$0);
      this.t = new fxk($$0, cug.a);
      this.u = new fxa($$0);
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

   public void a(eqk $$0, ftt.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !evr.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<blw> a(@Nullable blw $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         emc $$2 = $$0.br();
         emc $$3 = $$0.f(1.0F).a((double)$$1);
         emc $$4 = $$2.e($$3);
         elx $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<blw> $$7 = $$0x -> !$$0x.P_() && $$0x.bt();
         elz $$8 = cgj.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(eqk $$0, ftt $$1, hx $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(eqk $$0, ftt $$1, hx $$2, hx $$3, float $$4, float $$5, float $$6, float $$7) {
      evc $$8 = evr.O().j.m();
      if ($$8.h()) {
         emc $$9 = $$8.b().e();
         elx $$10 = elx.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eqk $$0, ftt $$1, hx $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      evc $$8 = evr.O().j.m();
      if ($$8.h()) {
         emc $$9 = $$8.b().e();
         elx $$10 = new elx($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eqk $$0, ftt $$1, elx $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(eqk $$0, ftt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eqo $$12 = $$1.getBuffer(fub.y());
      ftr.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(eqk $$0, ftt $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(eqk $$0, ftt $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(eqk $$0, ftt $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(eqk $$0, ftt $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      evr $$11 = evr.O();
      evc $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         exc $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? exc.a.b : exc.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(eqk var1, ftt var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
