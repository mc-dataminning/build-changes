import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fvd {
   private final auo a;
   final List<aul> b;
   final List<aul> c;
   final Function<aul, all> d;
   final Runnable e;
   private final Consumer<auo> f;

   public fvd(Runnable $$0, Function<aul, all> $$1, auo $$2, Consumer<auo> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fvd.a> a() {
      return this.c.stream().map($$0 -> new fvd.d($$0));
   }

   public Stream<fvd.a> b() {
      return this.b.stream().map($$0 -> new fvd.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aul::g).collect(ImmutableList.toImmutableList()));
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
      all a();

      aum b();

      String c();

      xl d();

      xl e();

      aup f();

      default xl g() {
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

   abstract class b implements fvd.a {
      private final aul b;

      public b(final aul $$0) {
         this.b = $$0;
      }

      protected abstract List<aul> s();

      protected abstract List<aul> t();

      @Override
      public all a() {
         return fvd.this.d.apply(this.b);
      }

      @Override
      public aum b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xl d() {
         return this.b.b();
      }

      @Override
      public xl e() {
         return this.b.c();
      }

      @Override
      public aup f() {
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
         this.b.k().a(this.t(), this.b, aul::h, true);
         fvd.this.e.run();
         fvd.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fka<Boolean> $$0 = fjx.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aul> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fvd.this.e.run();
      }

      @Override
      public boolean q() {
         List<aul> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aul> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fvd.b {
      public c(final aul $$0) {
         super($$0);
      }

      @Override
      protected List<aul> s() {
         return fvd.this.b;
      }

      @Override
      protected List<aul> t() {
         return fvd.this.c;
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

   class d extends fvd.b {
      public d(final aul $$0) {
         super($$0);
      }

      @Override
      protected List<aul> s() {
         return fvd.this.c;
      }

      @Override
      protected List<aul> t() {
         return fvd.this.b;
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
