import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class gbs {
   private final aun a;
   final List<auk> b;
   final List<auk> c;
   final Function<auk, alg> d;
   final Runnable e;
   private final Consumer<aun> f;

   public gbs(Runnable $$0, Function<auk, alg> $$1, aun $$2, Consumer<aun> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<gbs.a> a() {
      return this.c.stream().map($$0 -> new gbs.d($$0));
   }

   public Stream<gbs.a> b() {
      return this.b.stream().map($$0 -> new gbs.c($$0));
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
      alg a();

      aul b();

      String c();

      wy d();

      wy e();

      auo f();

      default wy g() {
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

   abstract class b implements gbs.a {
      private final auk b;

      public b(final auk $$0) {
         this.b = $$0;
      }

      protected abstract List<auk> s();

      protected abstract List<auk> t();

      @Override
      public alg a() {
         return gbs.this.d.apply(this.b);
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
      public wy d() {
         return this.b.b();
      }

      @Override
      public wy e() {
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
         gbs.this.e.run();
         gbs.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fpc<Boolean> $$0 = foz.Q().n.u();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<auk> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         gbs.this.e.run();
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

   class c extends gbs.b {
      public c(final auk $$0) {
         super($$0);
      }

      @Override
      protected List<auk> s() {
         return gbs.this.b;
      }

      @Override
      protected List<auk> t() {
         return gbs.this.c;
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

   class d extends gbs.b {
      public d(final auk $$0) {
         super($$0);
      }

      @Override
      protected List<auk> s() {
         return gbs.this.c;
      }

      @Override
      protected List<auk> t() {
         return gbs.this.b;
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
