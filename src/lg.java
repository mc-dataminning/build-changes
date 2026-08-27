import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class lg {
   private final dcv a;
   final Map<lg.b, dcv> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   lg(dcv $$0) {
      this.a = $$0;
   }

   public dcv a() {
      return this.a;
   }

   public Map<lg.b, dcv> b() {
      return this.b;
   }

   public dcv a(lg.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ayr.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ayr.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final lg a;

      public a(dcv $$0) {
         this.a = new lg($$0);
      }

      public lg a() {
         return this.a;
      }

      public lg.a a(dcv $$0) {
         this.a.b.put(lg.b.a, $$0);
         return this;
      }

      public lg.a b(dcv $$0) {
         this.a.b.put(lg.b.b, $$0);
         return this;
      }

      public lg.a c(dcv $$0) {
         this.a.b.put(lg.b.j, $$0);
         return this;
      }

      public lg.a d(dcv $$0) {
         this.a.b.put(lg.b.c, $$0);
         return this;
      }

      public lg.a e(dcv $$0) {
         this.a.b.put(lg.b.d, $$0);
         return this;
      }

      public lg.a f(dcv $$0) {
         this.a.b.put(lg.b.e, $$0);
         return this;
      }

      public lg.a g(dcv $$0) {
         this.a.b.put(lg.b.f, $$0);
         return this;
      }

      public lg.a h(dcv $$0) {
         this.a.b.put(lg.b.g, $$0);
         return this;
      }

      public lg.a i(dcv $$0) {
         this.a.b.put(lg.b.h, $$0);
         return this;
      }

      public lg.a j(dcv $$0) {
         this.a.b.put(lg.b.i, $$0);
         return this;
      }

      public lg.a a(dcv $$0, dcv $$1) {
         this.a.b.put(lg.b.k, $$0);
         this.a.b.put(lg.b.r, $$1);
         return this;
      }

      public lg.a k(dcv $$0) {
         this.a.b.put(lg.b.l, $$0);
         return this;
      }

      public lg.a l(dcv $$0) {
         this.a.b.put(lg.b.m, $$0);
         return this;
      }

      public lg.a m(dcv $$0) {
         this.a.b.put(lg.b.n, $$0);
         return this;
      }

      public lg.a n(dcv $$0) {
         this.a.b.put(lg.b.o, $$0);
         return this;
      }

      public lg.a o(dcv $$0) {
         this.a.b.put(lg.b.p, $$0);
         return this;
      }

      public lg.a p(dcv $$0) {
         this.a.b.put(lg.b.q, $$0);
         return this;
      }

      public lg.a b() {
         this.a.c = false;
         return this;
      }

      public lg.a c() {
         this.a.d = false;
         return this;
      }

      public lg.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public lg.a b(String $$0) {
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
