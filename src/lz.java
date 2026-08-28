import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class lz {
   private final dhm a;
   final Map<lz.b, dhm> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   lz(dhm $$0) {
      this.a = $$0;
   }

   public dhm a() {
      return this.a;
   }

   public Map<lz.b, dhm> b() {
      return this.b;
   }

   public dhm a(lz.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bac.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bac.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final lz a;

      public a(dhm $$0) {
         this.a = new lz($$0);
      }

      public lz a() {
         return this.a;
      }

      public lz.a a(dhm $$0) {
         this.a.b.put(lz.b.a, $$0);
         return this;
      }

      public lz.a b(dhm $$0) {
         this.a.b.put(lz.b.b, $$0);
         return this;
      }

      public lz.a c(dhm $$0) {
         this.a.b.put(lz.b.j, $$0);
         return this;
      }

      public lz.a d(dhm $$0) {
         this.a.b.put(lz.b.c, $$0);
         return this;
      }

      public lz.a e(dhm $$0) {
         this.a.b.put(lz.b.d, $$0);
         return this;
      }

      public lz.a f(dhm $$0) {
         this.a.b.put(lz.b.e, $$0);
         return this;
      }

      public lz.a g(dhm $$0) {
         this.a.b.put(lz.b.f, $$0);
         return this;
      }

      public lz.a h(dhm $$0) {
         this.a.b.put(lz.b.g, $$0);
         return this;
      }

      public lz.a i(dhm $$0) {
         this.a.b.put(lz.b.h, $$0);
         return this;
      }

      public lz.a j(dhm $$0) {
         this.a.b.put(lz.b.i, $$0);
         return this;
      }

      public lz.a a(dhm $$0, dhm $$1) {
         this.a.b.put(lz.b.k, $$0);
         this.a.b.put(lz.b.r, $$1);
         return this;
      }

      public lz.a k(dhm $$0) {
         this.a.b.put(lz.b.l, $$0);
         return this;
      }

      public lz.a l(dhm $$0) {
         this.a.b.put(lz.b.m, $$0);
         return this;
      }

      public lz.a m(dhm $$0) {
         this.a.b.put(lz.b.n, $$0);
         return this;
      }

      public lz.a n(dhm $$0) {
         this.a.b.put(lz.b.o, $$0);
         return this;
      }

      public lz.a o(dhm $$0) {
         this.a.b.put(lz.b.p, $$0);
         return this;
      }

      public lz.a p(dhm $$0) {
         this.a.b.put(lz.b.q, $$0);
         return this;
      }

      public lz.a b() {
         this.a.c = false;
         return this;
      }

      public lz.a c() {
         this.a.d = false;
         return this;
      }

      public lz.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public lz.a b(String $$0) {
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
