import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class gdu {
   private final aup a;
   final List<aum> b;
   final List<aum> c;
   final Function<aum, ali> d;
   final Runnable e;
   private final Consumer<aup> f;

   public gdu(Runnable $$0, Function<aum, ali> $$1, aup $$2, Consumer<aup> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<gdu.a> a() {
      return this.c.stream().map($$0 -> new gdu.d($$0));
   }

   public Stream<gdu.a> b() {
      return this.b.stream().map($$0 -> new gdu.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aum::g).collect(ImmutableList.toImmutableList()));
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

      aun b();

      String c();

      xa d();

      xa e();

      auq f();

      default xa g() {
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

   abstract class b implements gdu.a {
      private final aum b;

      public b(final aum $$0) {
         this.b = $$0;
      }

      protected abstract List<aum> s();

      protected abstract List<aum> t();

      @Override
      public ali a() {
         return gdu.this.d.apply(this.b);
      }

      @Override
      public aun b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xa d() {
         return this.b.b();
      }

      @Override
      public xa e() {
         return this.b.c();
      }

      @Override
      public auq f() {
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
         this.b.k().a(this.t(), this.b, aum::h, true);
         gdu.this.e.run();
         gdu.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            frg<Boolean> $$0 = frd.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aum> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         gdu.this.e.run();
      }

      @Override
      public boolean q() {
         List<aum> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aum> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends gdu.b {
      public c(final aum $$0) {
         super($$0);
      }

      @Override
      protected List<aum> s() {
         return gdu.this.b;
      }

      @Override
      protected List<aum> t() {
         return gdu.this.c;
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

   class d extends gdu.b {
      public d(final aum $$0) {
         super($$0);
      }

      @Override
      protected List<aum> s() {
         return gdu.this.c;
      }

      @Override
      protected List<aum> t() {
         return gdu.this.b;
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
