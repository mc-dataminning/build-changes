import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kv {
   private final dby a;
   final Map<kv.b, dby> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   kv(dby $$0) {
      this.a = $$0;
   }

   public dby a() {
      return this.a;
   }

   public Map<kv.b, dby> b() {
      return this.b;
   }

   public dby a(kv.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ayf.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ayf.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final kv a;

      public a(dby $$0) {
         this.a = new kv($$0);
      }

      public kv a() {
         return this.a;
      }

      public kv.a a(dby $$0) {
         this.a.b.put(kv.b.a, $$0);
         return this;
      }

      public kv.a b(dby $$0) {
         this.a.b.put(kv.b.b, $$0);
         return this;
      }

      public kv.a c(dby $$0) {
         this.a.b.put(kv.b.j, $$0);
         return this;
      }

      public kv.a d(dby $$0) {
         this.a.b.put(kv.b.c, $$0);
         return this;
      }

      public kv.a e(dby $$0) {
         this.a.b.put(kv.b.d, $$0);
         return this;
      }

      public kv.a f(dby $$0) {
         this.a.b.put(kv.b.e, $$0);
         return this;
      }

      public kv.a g(dby $$0) {
         this.a.b.put(kv.b.f, $$0);
         return this;
      }

      public kv.a h(dby $$0) {
         this.a.b.put(kv.b.g, $$0);
         return this;
      }

      public kv.a i(dby $$0) {
         this.a.b.put(kv.b.h, $$0);
         return this;
      }

      public kv.a j(dby $$0) {
         this.a.b.put(kv.b.i, $$0);
         return this;
      }

      public kv.a a(dby $$0, dby $$1) {
         this.a.b.put(kv.b.k, $$0);
         this.a.b.put(kv.b.r, $$1);
         return this;
      }

      public kv.a k(dby $$0) {
         this.a.b.put(kv.b.l, $$0);
         return this;
      }

      public kv.a l(dby $$0) {
         this.a.b.put(kv.b.m, $$0);
         return this;
      }

      public kv.a m(dby $$0) {
         this.a.b.put(kv.b.n, $$0);
         return this;
      }

      public kv.a n(dby $$0) {
         this.a.b.put(kv.b.o, $$0);
         return this;
      }

      public kv.a o(dby $$0) {
         this.a.b.put(kv.b.p, $$0);
         return this;
      }

      public kv.a p(dby $$0) {
         this.a.b.put(kv.b.q, $$0);
         return this;
      }

      public kv.a b() {
         this.a.c = false;
         return this;
      }

      public kv.a c() {
         this.a.d = false;
         return this;
      }

      public kv.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public kv.a b(String $$0) {
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
