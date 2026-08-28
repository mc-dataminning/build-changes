import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class gaz {
   private final aul a;
   final List<aui> b;
   final List<aui> c;
   final Function<aui, ale> d;
   final Runnable e;
   private final Consumer<aul> f;

   public gaz(Runnable $$0, Function<aui, ale> $$1, aul $$2, Consumer<aul> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<gaz.a> a() {
      return this.c.stream().map($$0 -> new gaz.d($$0));
   }

   public Stream<gaz.a> b() {
      return this.b.stream().map($$0 -> new gaz.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aui::g).collect(ImmutableList.toImmutableList()));
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
      ale a();

      auj b();

      String c();

      ww d();

      ww e();

      aum f();

      default ww g() {
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

   abstract class b implements gaz.a {
      private final aui b;

      public b(final aui $$0) {
         this.b = $$0;
      }

      protected abstract List<aui> s();

      protected abstract List<aui> t();

      @Override
      public ale a() {
         return gaz.this.d.apply(this.b);
      }

      @Override
      public auj b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public ww d() {
         return this.b.b();
      }

      @Override
      public ww e() {
         return this.b.c();
      }

      @Override
      public aum f() {
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
         this.b.k().a(this.t(), this.b, aui::h, true);
         gaz.this.e.run();
         gaz.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            foi<Boolean> $$0 = fof.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aui> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         gaz.this.e.run();
      }

      @Override
      public boolean q() {
         List<aui> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aui> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends gaz.b {
      public c(final aui $$0) {
         super($$0);
      }

      @Override
      protected List<aui> s() {
         return gaz.this.b;
      }

      @Override
      protected List<aui> t() {
         return gaz.this.c;
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

   class d extends gaz.b {
      public d(final aui $$0) {
         super($$0);
      }

      @Override
      protected List<aui> s() {
         return gaz.this.c;
      }

      @Override
      protected List<aui> t() {
         return gaz.this.b;
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
