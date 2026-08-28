import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class md {
   private final dij a;
   final Map<md.b, dij> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   md(dij $$0) {
      this.a = $$0;
   }

   public dij a() {
      return this.a;
   }

   public Map<md.b, dij> b() {
      return this.b;
   }

   public dij a(md.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bak.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bak.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final md a;

      public a(dij $$0) {
         this.a = new md($$0);
      }

      public md a() {
         return this.a;
      }

      public md.a a(dij $$0) {
         this.a.b.put(md.b.a, $$0);
         return this;
      }

      public md.a b(dij $$0) {
         this.a.b.put(md.b.b, $$0);
         return this;
      }

      public md.a c(dij $$0) {
         this.a.b.put(md.b.j, $$0);
         return this;
      }

      public md.a d(dij $$0) {
         this.a.b.put(md.b.c, $$0);
         return this;
      }

      public md.a e(dij $$0) {
         this.a.b.put(md.b.d, $$0);
         return this;
      }

      public md.a f(dij $$0) {
         this.a.b.put(md.b.e, $$0);
         return this;
      }

      public md.a g(dij $$0) {
         this.a.b.put(md.b.f, $$0);
         return this;
      }

      public md.a h(dij $$0) {
         this.a.b.put(md.b.g, $$0);
         return this;
      }

      public md.a i(dij $$0) {
         this.a.b.put(md.b.h, $$0);
         return this;
      }

      public md.a j(dij $$0) {
         this.a.b.put(md.b.i, $$0);
         return this;
      }

      public md.a a(dij $$0, dij $$1) {
         this.a.b.put(md.b.k, $$0);
         this.a.b.put(md.b.r, $$1);
         return this;
      }

      public md.a k(dij $$0) {
         this.a.b.put(md.b.l, $$0);
         return this;
      }

      public md.a l(dij $$0) {
         this.a.b.put(md.b.m, $$0);
         return this;
      }

      public md.a m(dij $$0) {
         this.a.b.put(md.b.n, $$0);
         return this;
      }

      public md.a n(dij $$0) {
         this.a.b.put(md.b.o, $$0);
         return this;
      }

      public md.a o(dij $$0) {
         this.a.b.put(md.b.p, $$0);
         return this;
      }

      public md.a p(dij $$0) {
         this.a.b.put(md.b.q, $$0);
         return this;
      }

      public md.a b() {
         this.a.c = false;
         return this;
      }

      public md.a c() {
         this.a.d = false;
         return this;
      }

      public md.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public md.a b(String $$0) {
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

      private b(final String $$0) {
         this.s = $$0;
      }

      public String a() {
         return this.s;
      }
   }
}
