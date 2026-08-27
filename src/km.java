import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class km {
   private final dac a;
   final Map<km.b, dac> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   km(dac $$0) {
      this.a = $$0;
   }

   public dac a() {
      return this.a;
   }

   public Map<km.b, dac> b() {
      return this.b;
   }

   public dac a(km.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ac.b(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final km a;

      public a(dac $$0) {
         this.a = new km($$0);
      }

      public km a() {
         return this.a;
      }

      public km.a a(dac $$0) {
         this.a.b.put(km.b.a, $$0);
         return this;
      }

      public km.a b(dac $$0) {
         this.a.b.put(km.b.b, $$0);
         return this;
      }

      public km.a c(dac $$0) {
         this.a.b.put(km.b.j, $$0);
         return this;
      }

      public km.a d(dac $$0) {
         this.a.b.put(km.b.c, $$0);
         return this;
      }

      public km.a e(dac $$0) {
         this.a.b.put(km.b.d, $$0);
         return this;
      }

      public km.a f(dac $$0) {
         this.a.b.put(km.b.e, $$0);
         return this;
      }

      public km.a g(dac $$0) {
         this.a.b.put(km.b.f, $$0);
         return this;
      }

      public km.a h(dac $$0) {
         this.a.b.put(km.b.g, $$0);
         return this;
      }

      public km.a i(dac $$0) {
         this.a.b.put(km.b.h, $$0);
         return this;
      }

      public km.a j(dac $$0) {
         this.a.b.put(km.b.i, $$0);
         return this;
      }

      public km.a a(dac $$0, dac $$1) {
         this.a.b.put(km.b.k, $$0);
         this.a.b.put(km.b.r, $$1);
         return this;
      }

      public km.a k(dac $$0) {
         this.a.b.put(km.b.l, $$0);
         return this;
      }

      public km.a l(dac $$0) {
         this.a.b.put(km.b.m, $$0);
         return this;
      }

      public km.a m(dac $$0) {
         this.a.b.put(km.b.n, $$0);
         return this;
      }

      public km.a n(dac $$0) {
         this.a.b.put(km.b.o, $$0);
         return this;
      }

      public km.a o(dac $$0) {
         this.a.b.put(km.b.p, $$0);
         return this;
      }

      public km.a p(dac $$0) {
         this.a.b.put(km.b.q, $$0);
         return this;
      }

      public km.a b() {
         this.a.c = false;
         return this;
      }

      public km.a c() {
         this.a.d = false;
         return this;
      }

      public km.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public km.a b(String $$0) {
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
