import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ly {
   private final dhj a;
   final Map<ly.b, dhj> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   ly(dhj $$0) {
      this.a = $$0;
   }

   public dhj a() {
      return this.a;
   }

   public Map<ly.b, dhj> b() {
      return this.b;
   }

   public dhj a(ly.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return baa.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return baa.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final ly a;

      public a(dhj $$0) {
         this.a = new ly($$0);
      }

      public ly a() {
         return this.a;
      }

      public ly.a a(dhj $$0) {
         this.a.b.put(ly.b.a, $$0);
         return this;
      }

      public ly.a b(dhj $$0) {
         this.a.b.put(ly.b.b, $$0);
         return this;
      }

      public ly.a c(dhj $$0) {
         this.a.b.put(ly.b.j, $$0);
         return this;
      }

      public ly.a d(dhj $$0) {
         this.a.b.put(ly.b.c, $$0);
         return this;
      }

      public ly.a e(dhj $$0) {
         this.a.b.put(ly.b.d, $$0);
         return this;
      }

      public ly.a f(dhj $$0) {
         this.a.b.put(ly.b.e, $$0);
         return this;
      }

      public ly.a g(dhj $$0) {
         this.a.b.put(ly.b.f, $$0);
         return this;
      }

      public ly.a h(dhj $$0) {
         this.a.b.put(ly.b.g, $$0);
         return this;
      }

      public ly.a i(dhj $$0) {
         this.a.b.put(ly.b.h, $$0);
         return this;
      }

      public ly.a j(dhj $$0) {
         this.a.b.put(ly.b.i, $$0);
         return this;
      }

      public ly.a a(dhj $$0, dhj $$1) {
         this.a.b.put(ly.b.k, $$0);
         this.a.b.put(ly.b.r, $$1);
         return this;
      }

      public ly.a k(dhj $$0) {
         this.a.b.put(ly.b.l, $$0);
         return this;
      }

      public ly.a l(dhj $$0) {
         this.a.b.put(ly.b.m, $$0);
         return this;
      }

      public ly.a m(dhj $$0) {
         this.a.b.put(ly.b.n, $$0);
         return this;
      }

      public ly.a n(dhj $$0) {
         this.a.b.put(ly.b.o, $$0);
         return this;
      }

      public ly.a o(dhj $$0) {
         this.a.b.put(ly.b.p, $$0);
         return this;
      }

      public ly.a p(dhj $$0) {
         this.a.b.put(ly.b.q, $$0);
         return this;
      }

      public ly.a b() {
         this.a.c = false;
         return this;
      }

      public ly.a c() {
         this.a.d = false;
         return this;
      }

      public ly.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public ly.a b(String $$0) {
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
