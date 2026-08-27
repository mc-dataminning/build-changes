import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kl {
   private final czf a;
   final Map<kl.b, czf> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   kl(czf $$0) {
      this.a = $$0;
   }

   public czf a() {
      return this.a;
   }

   public Map<kl.b, czf> b() {
      return this.b;
   }

   public czf a(kl.b $$0) {
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
      private final kl a;

      public a(czf $$0) {
         this.a = new kl($$0);
      }

      public kl a() {
         return this.a;
      }

      public kl.a a(czf $$0) {
         this.a.b.put(kl.b.a, $$0);
         return this;
      }

      public kl.a b(czf $$0) {
         this.a.b.put(kl.b.b, $$0);
         return this;
      }

      public kl.a c(czf $$0) {
         this.a.b.put(kl.b.j, $$0);
         return this;
      }

      public kl.a d(czf $$0) {
         this.a.b.put(kl.b.c, $$0);
         return this;
      }

      public kl.a e(czf $$0) {
         this.a.b.put(kl.b.d, $$0);
         return this;
      }

      public kl.a f(czf $$0) {
         this.a.b.put(kl.b.e, $$0);
         return this;
      }

      public kl.a g(czf $$0) {
         this.a.b.put(kl.b.f, $$0);
         return this;
      }

      public kl.a h(czf $$0) {
         this.a.b.put(kl.b.g, $$0);
         return this;
      }

      public kl.a i(czf $$0) {
         this.a.b.put(kl.b.h, $$0);
         return this;
      }

      public kl.a j(czf $$0) {
         this.a.b.put(kl.b.i, $$0);
         return this;
      }

      public kl.a a(czf $$0, czf $$1) {
         this.a.b.put(kl.b.k, $$0);
         this.a.b.put(kl.b.r, $$1);
         return this;
      }

      public kl.a k(czf $$0) {
         this.a.b.put(kl.b.l, $$0);
         return this;
      }

      public kl.a l(czf $$0) {
         this.a.b.put(kl.b.m, $$0);
         return this;
      }

      public kl.a m(czf $$0) {
         this.a.b.put(kl.b.n, $$0);
         return this;
      }

      public kl.a n(czf $$0) {
         this.a.b.put(kl.b.o, $$0);
         return this;
      }

      public kl.a o(czf $$0) {
         this.a.b.put(kl.b.p, $$0);
         return this;
      }

      public kl.a p(czf $$0) {
         this.a.b.put(kl.b.q, $$0);
         return this;
      }

      public kl.a b() {
         this.a.c = false;
         return this;
      }

      public kl.a c() {
         this.a.d = false;
         return this;
      }

      public kl.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public kl.a b(String $$0) {
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
