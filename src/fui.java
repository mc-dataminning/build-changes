import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fui {
   public final fuq a = new fuq();
   public final fui.a b;
   public final fui.a c;
   public final fui.a d;
   public final fui.a e;
   public final fui.a f;
   public final fui.a g;
   public final fut h;
   public final fui.a i;
   public final fui.a j;
   public final fui.a k;
   public final fui.a l;
   public final fue m;
   public final fuv n;
   public final fud o;
   public final fur p;
   public final ful q;
   public final fuk r;
   public final fuj s;
   public final fuo t;
   private boolean u;

   public fui(eti $$0) {
      this.b = new fuw($$0);
      this.c = new fuf($$0);
      this.d = new fum($$0);
      this.e = new fuh($$0);
      this.f = new fuu($$0);
      this.g = new fup($$0);
      this.h = new fut($$0);
      this.i = new fun($$0);
      this.j = new fux();
      this.k = new fus($$0);
      this.l = new fug($$0);
      this.m = new fue($$0);
      this.n = new fuv();
      this.o = new fud($$0);
      this.p = new fur($$0);
      this.q = new ful($$0);
      this.r = new fuk();
      this.s = new fuj($$0);
      this.t = new fuo($$0, cso.a);
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
   }

   public boolean b() {
      this.u = !this.u;
      return this.u;
   }

   public void a(eob $$0, fqz.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eti.N().au()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bkv> a(@Nullable bkv $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ejz $$2 = $$0.br();
         ejz $$3 = $$0.f(1.0F).a((double)$$1);
         ejz $$4 = $$2.e($$3);
         eju $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bkv> $$7 = $$0x -> !$$0x.P_() && $$0x.bt();
         ejw $$8 = ces.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(eob $$0, fqz $$1, hx $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(eob $$0, fqz $$1, hx $$2, hx $$3, float $$4, float $$5, float $$6, float $$7) {
      est $$8 = eti.N().j.m();
      if ($$8.h()) {
         ejz $$9 = $$8.b().e();
         eju $$10 = eju.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eob $$0, fqz $$1, hx $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      est $$8 = eti.N().j.m();
      if ($$8.h()) {
         ejz $$9 = $$8.b().e();
         eju $$10 = new eju($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eob $$0, fqz $$1, eju $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(eob $$0, fqz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eof $$12 = $$1.getBuffer(frh.y());
      fqx.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(eob $$0, fqz $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(eob $$0, fqz $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(eob $$0, fqz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(eob $$0, fqz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eti $$11 = eti.N();
      est $$12 = $$11.j.m();
      if ($$12.h() && $$11.an().d != null) {
         eur $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? eur.a.b : eur.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(eob var1, fqz var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
