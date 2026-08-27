import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kh {
   private final cwy a;
   final Map<kh.b, cwy> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   kh(cwy $$0) {
      this.a = $$0;
   }

   public cwy a() {
      return this.a;
   }

   public Map<kh.b, cwy> b() {
      return this.b;
   }

   public cwy a(kh.b $$0) {
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
      private final kh a;

      public a(cwy $$0) {
         this.a = new kh($$0);
      }

      public kh a() {
         return this.a;
      }

      public kh.a a(cwy $$0) {
         this.a.b.put(kh.b.a, $$0);
         return this;
      }

      public kh.a b(cwy $$0) {
         this.a.b.put(kh.b.b, $$0);
         return this;
      }

      public kh.a c(cwy $$0) {
         this.a.b.put(kh.b.j, $$0);
         return this;
      }

      public kh.a d(cwy $$0) {
         this.a.b.put(kh.b.c, $$0);
         return this;
      }

      public kh.a e(cwy $$0) {
         this.a.b.put(kh.b.d, $$0);
         return this;
      }

      public kh.a f(cwy $$0) {
         this.a.b.put(kh.b.e, $$0);
         return this;
      }

      public kh.a g(cwy $$0) {
         this.a.b.put(kh.b.f, $$0);
         return this;
      }

      public kh.a h(cwy $$0) {
         this.a.b.put(kh.b.g, $$0);
         return this;
      }

      public kh.a i(cwy $$0) {
         this.a.b.put(kh.b.h, $$0);
         return this;
      }

      public kh.a j(cwy $$0) {
         this.a.b.put(kh.b.i, $$0);
         return this;
      }

      public kh.a a(cwy $$0, cwy $$1) {
         this.a.b.put(kh.b.k, $$0);
         this.a.b.put(kh.b.r, $$1);
         return this;
      }

      public kh.a k(cwy $$0) {
         this.a.b.put(kh.b.l, $$0);
         return this;
      }

      public kh.a l(cwy $$0) {
         this.a.b.put(kh.b.m, $$0);
         return this;
      }

      public kh.a m(cwy $$0) {
         this.a.b.put(kh.b.n, $$0);
         return this;
      }

      public kh.a n(cwy $$0) {
         this.a.b.put(kh.b.o, $$0);
         return this;
      }

      public kh.a o(cwy $$0) {
         this.a.b.put(kh.b.p, $$0);
         return this;
      }

      public kh.a p(cwy $$0) {
         this.a.b.put(kh.b.q, $$0);
         return this;
      }

      public kh.a b() {
         this.a.c = false;
         return this;
      }

      public kh.a c() {
         this.a.d = false;
         return this;
      }

      public kh.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public kh.a b(String $$0) {
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
