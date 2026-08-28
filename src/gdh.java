import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class gdh {
   private final auz a;
   final List<auv> b;
   final List<auv> c;
   final Function<auv, alr> d;
   final Runnable e;
   private final Consumer<auz> f;

   public gdh(Runnable $$0, Function<auv, alr> $$1, auz $$2, Consumer<auz> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<gdh.a> a() {
      return this.c.stream().map($$0 -> new gdh.d($$0));
   }

   public Stream<gdh.a> b() {
      return this.b.stream().map($$0 -> new gdh.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(auv::g).collect(ImmutableList.toImmutableList()));
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
      alr a();

      auw b();

      String c();

      xg d();

      xg e();

      ava f();

      default xg g() {
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

   abstract class b implements gdh.a {
      private final auv b;

      public b(final auv $$0) {
         this.b = $$0;
      }

      protected abstract List<auv> s();

      protected abstract List<auv> t();

      @Override
      public alr a() {
         return gdh.this.d.apply(this.b);
      }

      @Override
      public auw b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xg d() {
         return this.b.b();
      }

      @Override
      public xg e() {
         return this.b.c();
      }

      @Override
      public ava f() {
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
         this.b.k().a(this.t(), this.b, auv::h, true);
         gdh.this.e.run();
         gdh.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fqt<Boolean> $$0 = fqq.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<auv> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         gdh.this.e.run();
      }

      @Override
      public boolean q() {
         List<auv> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<auv> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends gdh.b {
      public c(final auv $$0) {
         super($$0);
      }

      @Override
      protected List<auv> s() {
         return gdh.this.b;
      }

      @Override
      protected List<auv> t() {
         return gdh.this.c;
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

   class d extends gdh.b {
      public d(final auv $$0) {
         super($$0);
      }

      @Override
      protected List<auv> s() {
         return gdh.this.c;
      }

      @Override
      protected List<auv> t() {
         return gdh.this.b;
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
