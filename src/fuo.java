import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fuo {
   private final aul a;
   final List<aui> b;
   final List<aui> c;
   final Function<aui, ali> d;
   final Runnable e;
   private final Consumer<aul> f;

   public fuo(Runnable $$0, Function<aui, ali> $$1, aul $$2, Consumer<aul> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fuo.a> a() {
      return this.c.stream().map($$0 -> new fuo.d($$0));
   }

   public Stream<fuo.a> b() {
      return this.b.stream().map($$0 -> new fuo.c($$0));
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
      ali a();

      auj b();

      String c();

      xi d();

      xi e();

      aum f();

      default xi g() {
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

   abstract class b implements fuo.a {
      private final aui b;

      public b(final aui $$0) {
         this.b = $$0;
      }

      protected abstract List<aui> s();

      protected abstract List<aui> t();

      @Override
      public ali a() {
         return fuo.this.d.apply(this.b);
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
      public xi d() {
         return this.b.b();
      }

      @Override
      public xi e() {
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
         fuo.this.e.run();
         fuo.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fjl<Boolean> $$0 = fji.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aui> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fuo.this.e.run();
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

   class c extends fuo.b {
      public c(final aui $$0) {
         super($$0);
      }

      @Override
      protected List<aui> s() {
         return fuo.this.b;
      }

      @Override
      protected List<aui> t() {
         return fuo.this.c;
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

   class d extends fuo.b {
      public d(final aui $$0) {
         super($$0);
      }

      @Override
      protected List<aui> s() {
         return fuo.this.c;
      }

      @Override
      protected List<aui> t() {
         return fuo.this.b;
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
