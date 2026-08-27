import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class lh {
   private final dde a;
   final Map<lh.b, dde> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   lh(dde $$0) {
      this.a = $$0;
   }

   public dde a() {
      return this.a;
   }

   public Map<lh.b, dde> b() {
      return this.b;
   }

   public dde a(lh.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ayu.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ayu.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final lh a;

      public a(dde $$0) {
         this.a = new lh($$0);
      }

      public lh a() {
         return this.a;
      }

      public lh.a a(dde $$0) {
         this.a.b.put(lh.b.a, $$0);
         return this;
      }

      public lh.a b(dde $$0) {
         this.a.b.put(lh.b.b, $$0);
         return this;
      }

      public lh.a c(dde $$0) {
         this.a.b.put(lh.b.j, $$0);
         return this;
      }

      public lh.a d(dde $$0) {
         this.a.b.put(lh.b.c, $$0);
         return this;
      }

      public lh.a e(dde $$0) {
         this.a.b.put(lh.b.d, $$0);
         return this;
      }

      public lh.a f(dde $$0) {
         this.a.b.put(lh.b.e, $$0);
         return this;
      }

      public lh.a g(dde $$0) {
         this.a.b.put(lh.b.f, $$0);
         return this;
      }

      public lh.a h(dde $$0) {
         this.a.b.put(lh.b.g, $$0);
         return this;
      }

      public lh.a i(dde $$0) {
         this.a.b.put(lh.b.h, $$0);
         return this;
      }

      public lh.a j(dde $$0) {
         this.a.b.put(lh.b.i, $$0);
         return this;
      }

      public lh.a a(dde $$0, dde $$1) {
         this.a.b.put(lh.b.k, $$0);
         this.a.b.put(lh.b.r, $$1);
         return this;
      }

      public lh.a k(dde $$0) {
         this.a.b.put(lh.b.l, $$0);
         return this;
      }

      public lh.a l(dde $$0) {
         this.a.b.put(lh.b.m, $$0);
         return this;
      }

      public lh.a m(dde $$0) {
         this.a.b.put(lh.b.n, $$0);
         return this;
      }

      public lh.a n(dde $$0) {
         this.a.b.put(lh.b.o, $$0);
         return this;
      }

      public lh.a o(dde $$0) {
         this.a.b.put(lh.b.p, $$0);
         return this;
      }

      public lh.a p(dde $$0) {
         this.a.b.put(lh.b.q, $$0);
         return this;
      }

      public lh.a b() {
         this.a.c = false;
         return this;
      }

      public lh.a c() {
         this.a.d = false;
         return this;
      }

      public lh.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public lh.a b(String $$0) {
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
