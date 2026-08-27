import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ll {
   private final dfc a;
   final Map<ll.b, dfc> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   ll(dfc $$0) {
      this.a = $$0;
   }

   public dfc a() {
      return this.a;
   }

   public Map<ll.b, dfc> b() {
      return this.b;
   }

   public dfc a(ll.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return azh.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return azh.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final ll a;

      public a(dfc $$0) {
         this.a = new ll($$0);
      }

      public ll a() {
         return this.a;
      }

      public ll.a a(dfc $$0) {
         this.a.b.put(ll.b.a, $$0);
         return this;
      }

      public ll.a b(dfc $$0) {
         this.a.b.put(ll.b.b, $$0);
         return this;
      }

      public ll.a c(dfc $$0) {
         this.a.b.put(ll.b.j, $$0);
         return this;
      }

      public ll.a d(dfc $$0) {
         this.a.b.put(ll.b.c, $$0);
         return this;
      }

      public ll.a e(dfc $$0) {
         this.a.b.put(ll.b.d, $$0);
         return this;
      }

      public ll.a f(dfc $$0) {
         this.a.b.put(ll.b.e, $$0);
         return this;
      }

      public ll.a g(dfc $$0) {
         this.a.b.put(ll.b.f, $$0);
         return this;
      }

      public ll.a h(dfc $$0) {
         this.a.b.put(ll.b.g, $$0);
         return this;
      }

      public ll.a i(dfc $$0) {
         this.a.b.put(ll.b.h, $$0);
         return this;
      }

      public ll.a j(dfc $$0) {
         this.a.b.put(ll.b.i, $$0);
         return this;
      }

      public ll.a a(dfc $$0, dfc $$1) {
         this.a.b.put(ll.b.k, $$0);
         this.a.b.put(ll.b.r, $$1);
         return this;
      }

      public ll.a k(dfc $$0) {
         this.a.b.put(ll.b.l, $$0);
         return this;
      }

      public ll.a l(dfc $$0) {
         this.a.b.put(ll.b.m, $$0);
         return this;
      }

      public ll.a m(dfc $$0) {
         this.a.b.put(ll.b.n, $$0);
         return this;
      }

      public ll.a n(dfc $$0) {
         this.a.b.put(ll.b.o, $$0);
         return this;
      }

      public ll.a o(dfc $$0) {
         this.a.b.put(ll.b.p, $$0);
         return this;
      }

      public ll.a p(dfc $$0) {
         this.a.b.put(ll.b.q, $$0);
         return this;
      }

      public ll.a b() {
         this.a.c = false;
         return this;
      }

      public ll.a c() {
         this.a.d = false;
         return this;
      }

      public ll.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public ll.a b(String $$0) {
         this.a.f = $$0;
         return this;
      }
   }

   public static enum b {
      a("button"),
      b("chiseled"),
      c("cracked"),
      d("cut"),
      e("door"),
      f("fence"),
      g("fence"),
      h("fence_gate"),
      i("fence_gate"),
      j("mosaic"),
      k("sign"),
      l("slab"),
      m("stairs"),
      n("pressure_plate"),
      o("polished"),
      p("trapdoor"),
      q("wall"),
      r("wall_sign");

      private final String s;

      private b(String $$0) {
         this.s = $$0;
      }

      public String a() {
         return this.s;
      }
   }
}
