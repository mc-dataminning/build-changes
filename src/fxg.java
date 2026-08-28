import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fxg {
   private final auv a;
   final List<aus> b;
   final List<aus> c;
   final Function<aus, alp> d;
   final Runnable e;
   private final Consumer<auv> f;

   public fxg(Runnable $$0, Function<aus, alp> $$1, auv $$2, Consumer<auv> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fxg.a> a() {
      return this.c.stream().map($$0 -> new fxg.d($$0));
   }

   public Stream<fxg.a> b() {
      return this.b.stream().map($$0 -> new fxg.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aus::g).collect(ImmutableList.toImmutableList()));
   }

   public void c() {
      this.e();
      this.f.accept(this.a);
   }

   public void d() {
      this.a.a();
      this.b.retainAll(this.a.d());
      this.c.clear();
      this.c.addAll(this.a.d());
      this.c.removeAll(this.b);
   }

   public interface a {
      alp a();

      aut b();

      String c();

      xk d();

      xk e();

      auw f();

      default xk g() {
         return this.f().a(this.e());
      }

      boolean h();

      boolean i();

      void j();

      void k();

      void l();

      void m();

      boolean n();

      default boolean o() {
         return !this.n();
      }

      default boolean p() {
         return this.n() && !this.i();
      }

      boolean q();

      boolean r();
   }

   abstract class b implements fxg.a {
      private final aus b;

      public b(final aus $$0) {
         this.b = $$0;
      }

      protected abstract List<aus> s();

      protected abstract List<aus> t();

      @Override
      public alp a() {
         return fxg.this.d.apply(this.b);
      }

      @Override
      public aut b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xk d() {
         return this.b.b();
      }

      @Override
      public xk e() {
         return this.b.c();
      }

      @Override
      public auw f() {
         return this.b.l();
      }

      @Override
      public boolean h() {
         return this.b.j();
      }

      @Override
      public boolean i() {
         return this.b.i();
      }

      protected void u() {
         this.s().remove(this.b);
         this.b.k().a(this.t(), this.b, aus::h, true);
         fxg.this.e.run();
         fxg.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fmc<Boolean> $$0 = flz.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aus> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fxg.this.e.run();
      }

      @Override
      public boolean q() {
         List<aus> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aus> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fxg.b {
      public c(final aus $$0) {
         super($$0);
      }

      @Override
      protected List<aus> s() {
         return fxg.this.b;
      }

      @Override
      protected List<aus> t() {
         return fxg.this.c;
      }

      @Override
      public boolean n() {
         return true;
      }

      @Override
      public void j() {
      }

      @Override
      public void k() {
         this.u();
      }
   }

   class d extends fxg.b {
      public d(final aus $$0) {
         super($$0);
      }

      @Override
      protected List<aus> s() {
         return fxg.this.c;
      }

      @Override
      protected List<aus> t() {
         return fxg.this.b;
      }

      @Override
      public boolean n() {
         return false;
      }

      @Override
      public void j() {
         this.u();
      }

      @Override
      public void k() {
      }
   }
}
