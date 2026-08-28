import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fxx {
   private final atz a;
   final List<atw> b;
   final List<atw> c;
   final Function<atw, aku> d;
   final Runnable e;
   private final Consumer<atz> f;

   public fxx(Runnable $$0, Function<atw, aku> $$1, atz $$2, Consumer<atz> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fxx.a> a() {
      return this.c.stream().map($$0 -> new fxx.d($$0));
   }

   public Stream<fxx.a> b() {
      return this.b.stream().map($$0 -> new fxx.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(atw::g).collect(ImmutableList.toImmutableList()));
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
      aku a();

      atx b();

      String c();

      wo d();

      wo e();

      aua f();

      default wo g() {
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

   abstract class b implements fxx.a {
      private final atw b;

      public b(final atw $$0) {
         this.b = $$0;
      }

      protected abstract List<atw> s();

      protected abstract List<atw> t();

      @Override
      public aku a() {
         return fxx.this.d.apply(this.b);
      }

      @Override
      public atx b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public wo d() {
         return this.b.b();
      }

      @Override
      public wo e() {
         return this.b.c();
      }

      @Override
      public aua f() {
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
         this.b.k().a(this.t(), this.b, atw::h, true);
         fxx.this.e.run();
         fxx.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            flk<Boolean> $$0 = flh.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<atw> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fxx.this.e.run();
      }

      @Override
      public boolean q() {
         List<atw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<atw> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fxx.b {
      public c(final atw $$0) {
         super($$0);
      }

      @Override
      protected List<atw> s() {
         return fxx.this.b;
      }

      @Override
      protected List<atw> t() {
         return fxx.this.c;
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

   class d extends fxx.b {
      public d(final atw $$0) {
         super($$0);
      }

      @Override
      protected List<atw> s() {
         return fxx.this.c;
      }

      @Override
      protected List<atw> t() {
         return fxx.this.b;
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
