import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fvl {
   private final aun a;
   final List<auk> b;
   final List<auk> c;
   final Function<auk, alj> d;
   final Runnable e;
   private final Consumer<aun> f;

   public fvl(Runnable $$0, Function<auk, alj> $$1, aun $$2, Consumer<aun> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<fvl.a> a() {
      return this.c.stream().map($$0 -> new fvl.d($$0));
   }

   public Stream<fvl.a> b() {
      return this.b.stream().map($$0 -> new fvl.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(auk::g).collect(ImmutableList.toImmutableList()));
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
      alj a();

      aul b();

      String c();

      xj d();

      xj e();

      auo f();

      default xj g() {
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

   abstract class b implements fvl.a {
      private final auk b;

      public b(final auk $$0) {
         this.b = $$0;
      }

      protected abstract List<auk> s();

      protected abstract List<auk> t();

      @Override
      public alj a() {
         return fvl.this.d.apply(this.b);
      }

      @Override
      public aul b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xj d() {
         return this.b.b();
      }

      @Override
      public xj e() {
         return this.b.c();
      }

      @Override
      public auo f() {
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
         this.b.k().a(this.t(), this.b, auk::h, true);
         fvl.this.e.run();
         fvl.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fkh<Boolean> $$0 = fke.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<auk> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         fvl.this.e.run();
      }

      @Override
      public boolean q() {
         List<auk> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<auk> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends fvl.b {
      public c(final auk $$0) {
         super($$0);
      }

      @Override
      protected List<auk> s() {
         return fvl.this.b;
      }

      @Override
      protected List<auk> t() {
         return fvl.this.c;
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

   class d extends fvl.b {
      public d(final auk $$0) {
         super($$0);
      }

      @Override
      protected List<auk> s() {
         return fvl.this.c;
      }

      @Override
      protected List<auk> t() {
         return fvl.this.b;
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
