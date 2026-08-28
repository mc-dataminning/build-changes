import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class lu {
   private final dff a;
   final Map<lu.b, dff> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   lu(dff $$0) {
      this.a = $$0;
   }

   public dff a() {
      return this.a;
   }

   public Map<lu.b, dff> b() {
      return this.b;
   }

   public dff a(lu.b $$0) {
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
      private final lu a;

      public a(dff $$0) {
         this.a = new lu($$0);
      }

      public lu a() {
         return this.a;
      }

      public lu.a a(dff $$0) {
         this.a.b.put(lu.b.a, $$0);
         return this;
      }

      public lu.a b(dff $$0) {
         this.a.b.put(lu.b.b, $$0);
         return this;
      }

      public lu.a c(dff $$0) {
         this.a.b.put(lu.b.j, $$0);
         return this;
      }

      public lu.a d(dff $$0) {
         this.a.b.put(lu.b.c, $$0);
         return this;
      }

      public lu.a e(dff $$0) {
         this.a.b.put(lu.b.d, $$0);
         return this;
      }

      public lu.a f(dff $$0) {
         this.a.b.put(lu.b.e, $$0);
         return this;
      }

      public lu.a g(dff $$0) {
         this.a.b.put(lu.b.f, $$0);
         return this;
      }

      public lu.a h(dff $$0) {
         this.a.b.put(lu.b.g, $$0);
         return this;
      }

      public lu.a i(dff $$0) {
         this.a.b.put(lu.b.h, $$0);
         return this;
      }

      public lu.a j(dff $$0) {
         this.a.b.put(lu.b.i, $$0);
         return this;
      }

      public lu.a a(dff $$0, dff $$1) {
         this.a.b.put(lu.b.k, $$0);
         this.a.b.put(lu.b.r, $$1);
         return this;
      }

      public lu.a k(dff $$0) {
         this.a.b.put(lu.b.l, $$0);
         return this;
      }

      public lu.a l(dff $$0) {
         this.a.b.put(lu.b.m, $$0);
         return this;
      }

      public lu.a m(dff $$0) {
         this.a.b.put(lu.b.n, $$0);
         return this;
      }

      public lu.a n(dff $$0) {
         this.a.b.put(lu.b.o, $$0);
         return this;
      }

      public lu.a o(dff $$0) {
         this.a.b.put(lu.b.p, $$0);
         return this;
      }

      public lu.a p(dff $$0) {
         this.a.b.put(lu.b.q, $$0);
         return this;
      }

      public lu.a b() {
         this.a.c = false;
         return this;
      }

      public lu.a c() {
         this.a.d = false;
         return this;
      }

      public lu.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public lu.a b(String $$0) {
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
