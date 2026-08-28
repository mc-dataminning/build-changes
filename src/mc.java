import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class mc {
   private final die a;
   final Map<mc.b, die> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   mc(die $$0) {
      this.a = $$0;
   }

   public die a() {
      return this.a;
   }

   public Map<mc.b, die> b() {
      return this.b;
   }

   public die a(mc.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bah.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bah.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final mc a;

      public a(die $$0) {
         this.a = new mc($$0);
      }

      public mc a() {
         return this.a;
      }

      public mc.a a(die $$0) {
         this.a.b.put(mc.b.a, $$0);
         return this;
      }

      public mc.a b(die $$0) {
         this.a.b.put(mc.b.b, $$0);
         return this;
      }

      public mc.a c(die $$0) {
         this.a.b.put(mc.b.j, $$0);
         return this;
      }

      public mc.a d(die $$0) {
         this.a.b.put(mc.b.c, $$0);
         return this;
      }

      public mc.a e(die $$0) {
         this.a.b.put(mc.b.d, $$0);
         return this;
      }

      public mc.a f(die $$0) {
         this.a.b.put(mc.b.e, $$0);
         return this;
      }

      public mc.a g(die $$0) {
         this.a.b.put(mc.b.f, $$0);
         return this;
      }

      public mc.a h(die $$0) {
         this.a.b.put(mc.b.g, $$0);
         return this;
      }

      public mc.a i(die $$0) {
         this.a.b.put(mc.b.h, $$0);
         return this;
      }

      public mc.a j(die $$0) {
         this.a.b.put(mc.b.i, $$0);
         return this;
      }

      public mc.a a(die $$0, die $$1) {
         this.a.b.put(mc.b.k, $$0);
         this.a.b.put(mc.b.r, $$1);
         return this;
      }

      public mc.a k(die $$0) {
         this.a.b.put(mc.b.l, $$0);
         return this;
      }

      public mc.a l(die $$0) {
         this.a.b.put(mc.b.m, $$0);
         return this;
      }

      public mc.a m(die $$0) {
         this.a.b.put(mc.b.n, $$0);
         return this;
      }

      public mc.a n(die $$0) {
         this.a.b.put(mc.b.o, $$0);
         return this;
      }

      public mc.a o(die $$0) {
         this.a.b.put(mc.b.p, $$0);
         return this;
      }

      public mc.a p(die $$0) {
         this.a.b.put(mc.b.q, $$0);
         return this;
      }

      public mc.a b() {
         this.a.c = false;
         return this;
      }

      public mc.a c() {
         this.a.d = false;
         return this;
      }

      public mc.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public mc.a b(String $$0) {
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
