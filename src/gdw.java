import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class gdw {
   private final aur a;
   final List<auo> b;
   final List<auo> c;
   final Function<auo, alk> d;
   final Runnable e;
   private final Consumer<aur> f;

   public gdw(Runnable $$0, Function<auo, alk> $$1, aur $$2, Consumer<aur> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<gdw.a> a() {
      return this.c.stream().map($$0 -> new gdw.d($$0));
   }

   public Stream<gdw.a> b() {
      return this.b.stream().map($$0 -> new gdw.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(auo::g).collect(ImmutableList.toImmutableList()));
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
      alk a();

      aup b();

      String c();

      xc d();

      xc e();

      aus f();

      default xc g() {
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

   abstract class b implements gdw.a {
      private final auo b;

      public b(final auo $$0) {
         this.b = $$0;
      }

      protected abstract List<auo> s();

      protected abstract List<auo> t();

      @Override
      public alk a() {
         return gdw.this.d.apply(this.b);
      }

      @Override
      public aup b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xc d() {
         return this.b.b();
      }

      @Override
      public xc e() {
         return this.b.c();
      }

      @Override
      public aus f() {
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
         this.b.k().a(this.t(), this.b, auo::h, true);
         gdw.this.e.run();
         gdw.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fri<Boolean> $$0 = frf.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<auo> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         gdw.this.e.run();
      }

      @Override
      public boolean q() {
         List<auo> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<auo> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends gdw.b {
      public c(final auo $$0) {
         super($$0);
      }

      @Override
      protected List<auo> s() {
         return gdw.this.b;
      }

      @Override
      protected List<auo> t() {
         return gdw.this.c;
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

   class d extends gdw.b {
      public d(final auo $$0) {
         super($$0);
      }

      @Override
      protected List<auo> s() {
         return gdw.this.c;
      }

      @Override
      protected List<auo> t() {
         return gdw.this.b;
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
