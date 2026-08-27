import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kh {
   private final cwj a;
   final Map<kh.b, cwj> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   kh(cwj $$0) {
      this.a = $$0;
   }

   public cwj a() {
      return this.a;
   }

   public Map<kh.b, cwj> b() {
      return this.b;
   }

   public cwj a(kh.b $$0) {
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

      public a(cwj $$0) {
         this.a = new kh($$0);
      }

      public kh a() {
         return this.a;
      }

      public kh.a a(cwj $$0) {
         this.a.b.put(kh.b.a, $$0);
         return this;
      }

      public kh.a b(cwj $$0) {
         this.a.b.put(kh.b.b, $$0);
         return this;
      }

      public kh.a c(cwj $$0) {
         this.a.b.put(kh.b.j, $$0);
         return this;
      }

      public kh.a d(cwj $$0) {
         this.a.b.put(kh.b.c, $$0);
         return this;
      }

      public kh.a e(cwj $$0) {
         this.a.b.put(kh.b.d, $$0);
         return this;
      }

      public kh.a f(cwj $$0) {
         this.a.b.put(kh.b.e, $$0);
         return this;
      }

      public kh.a g(cwj $$0) {
         this.a.b.put(kh.b.f, $$0);
         return this;
      }

      public kh.a h(cwj $$0) {
         this.a.b.put(kh.b.g, $$0);
         return this;
      }

      public kh.a i(cwj $$0) {
         this.a.b.put(kh.b.h, $$0);
         return this;
      }

      public kh.a j(cwj $$0) {
         this.a.b.put(kh.b.i, $$0);
         return this;
      }

      public kh.a a(cwj $$0, cwj $$1) {
         this.a.b.put(kh.b.k, $$0);
         this.a.b.put(kh.b.r, $$1);
         return this;
      }

      public kh.a k(cwj $$0) {
         this.a.b.put(kh.b.l, $$0);
         return this;
      }

      public kh.a l(cwj $$0) {
         this.a.b.put(kh.b.m, $$0);
         return this;
      }

      public kh.a m(cwj $$0) {
         this.a.b.put(kh.b.n, $$0);
         return this;
      }

      public kh.a n(cwj $$0) {
         this.a.b.put(kh.b.o, $$0);
         return this;
      }

      public kh.a o(cwj $$0) {
         this.a.b.put(kh.b.p, $$0);
         return this;
      }

      public kh.a p(cwj $$0) {
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
