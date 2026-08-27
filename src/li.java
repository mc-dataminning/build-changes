import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class li {
   private final ddy a;
   final Map<li.b, ddy> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   li(ddy $$0) {
      this.a = $$0;
   }

   public ddy a() {
      return this.a;
   }

   public Map<li.b, ddy> b() {
      return this.b;
   }

   public ddy a(li.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ayy.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ayy.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final li a;

      public a(ddy $$0) {
         this.a = new li($$0);
      }

      public li a() {
         return this.a;
      }

      public li.a a(ddy $$0) {
         this.a.b.put(li.b.a, $$0);
         return this;
      }

      public li.a b(ddy $$0) {
         this.a.b.put(li.b.b, $$0);
         return this;
      }

      public li.a c(ddy $$0) {
         this.a.b.put(li.b.j, $$0);
         return this;
      }

      public li.a d(ddy $$0) {
         this.a.b.put(li.b.c, $$0);
         return this;
      }

      public li.a e(ddy $$0) {
         this.a.b.put(li.b.d, $$0);
         return this;
      }

      public li.a f(ddy $$0) {
         this.a.b.put(li.b.e, $$0);
         return this;
      }

      public li.a g(ddy $$0) {
         this.a.b.put(li.b.f, $$0);
         return this;
      }

      public li.a h(ddy $$0) {
         this.a.b.put(li.b.g, $$0);
         return this;
      }

      public li.a i(ddy $$0) {
         this.a.b.put(li.b.h, $$0);
         return this;
      }

      public li.a j(ddy $$0) {
         this.a.b.put(li.b.i, $$0);
         return this;
      }

      public li.a a(ddy $$0, ddy $$1) {
         this.a.b.put(li.b.k, $$0);
         this.a.b.put(li.b.r, $$1);
         return this;
      }

      public li.a k(ddy $$0) {
         this.a.b.put(li.b.l, $$0);
         return this;
      }

      public li.a l(ddy $$0) {
         this.a.b.put(li.b.m, $$0);
         return this;
      }

      public li.a m(ddy $$0) {
         this.a.b.put(li.b.n, $$0);
         return this;
      }

      public li.a n(ddy $$0) {
         this.a.b.put(li.b.o, $$0);
         return this;
      }

      public li.a o(ddy $$0) {
         this.a.b.put(li.b.p, $$0);
         return this;
      }

      public li.a p(ddy $$0) {
         this.a.b.put(li.b.q, $$0);
         return this;
      }

      public li.a b() {
         this.a.c = false;
         return this;
      }

      public li.a c() {
         this.a.d = false;
         return this;
      }

      public li.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public li.a b(String $$0) {
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
