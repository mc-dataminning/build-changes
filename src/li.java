import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class li {
   private final dea a;
   final Map<li.b, dea> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   li(dea $$0) {
      this.a = $$0;
   }

   public dea a() {
      return this.a;
   }

   public Map<li.b, dea> b() {
      return this.b;
   }

   public dea a(li.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return aza.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return aza.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final li a;

      public a(dea $$0) {
         this.a = new li($$0);
      }

      public li a() {
         return this.a;
      }

      public li.a a(dea $$0) {
         this.a.b.put(li.b.a, $$0);
         return this;
      }

      public li.a b(dea $$0) {
         this.a.b.put(li.b.b, $$0);
         return this;
      }

      public li.a c(dea $$0) {
         this.a.b.put(li.b.j, $$0);
         return this;
      }

      public li.a d(dea $$0) {
         this.a.b.put(li.b.c, $$0);
         return this;
      }

      public li.a e(dea $$0) {
         this.a.b.put(li.b.d, $$0);
         return this;
      }

      public li.a f(dea $$0) {
         this.a.b.put(li.b.e, $$0);
         return this;
      }

      public li.a g(dea $$0) {
         this.a.b.put(li.b.f, $$0);
         return this;
      }

      public li.a h(dea $$0) {
         this.a.b.put(li.b.g, $$0);
         return this;
      }

      public li.a i(dea $$0) {
         this.a.b.put(li.b.h, $$0);
         return this;
      }

      public li.a j(dea $$0) {
         this.a.b.put(li.b.i, $$0);
         return this;
      }

      public li.a a(dea $$0, dea $$1) {
         this.a.b.put(li.b.k, $$0);
         this.a.b.put(li.b.r, $$1);
         return this;
      }

      public li.a k(dea $$0) {
         this.a.b.put(li.b.l, $$0);
         return this;
      }

      public li.a l(dea $$0) {
         this.a.b.put(li.b.m, $$0);
         return this;
      }

      public li.a m(dea $$0) {
         this.a.b.put(li.b.n, $$0);
         return this;
      }

      public li.a n(dea $$0) {
         this.a.b.put(li.b.o, $$0);
         return this;
      }

      public li.a o(dea $$0) {
         this.a.b.put(li.b.p, $$0);
         return this;
      }

      public li.a p(dea $$0) {
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
