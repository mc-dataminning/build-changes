import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class mh {
   private final dku a;
   final Map<mh.b, dku> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   mh(dku $$0) {
      this.a = $$0;
   }

   public dku a() {
      return this.a;
   }

   public Map<mh.b, dku> b() {
      return this.b;
   }

   public dku a(mh.b $$0) {
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
      private final mh a;

      public a(dku $$0) {
         this.a = new mh($$0);
      }

      public mh a() {
         return this.a;
      }

      public mh.a a(dku $$0) {
         this.a.b.put(mh.b.a, $$0);
         return this;
      }

      public mh.a b(dku $$0) {
         this.a.b.put(mh.b.b, $$0);
         return this;
      }

      public mh.a c(dku $$0) {
         this.a.b.put(mh.b.j, $$0);
         return this;
      }

      public mh.a d(dku $$0) {
         this.a.b.put(mh.b.c, $$0);
         return this;
      }

      public mh.a e(dku $$0) {
         this.a.b.put(mh.b.d, $$0);
         return this;
      }

      public mh.a f(dku $$0) {
         this.a.b.put(mh.b.e, $$0);
         return this;
      }

      public mh.a g(dku $$0) {
         this.a.b.put(mh.b.f, $$0);
         return this;
      }

      public mh.a h(dku $$0) {
         this.a.b.put(mh.b.g, $$0);
         return this;
      }

      public mh.a i(dku $$0) {
         this.a.b.put(mh.b.h, $$0);
         return this;
      }

      public mh.a j(dku $$0) {
         this.a.b.put(mh.b.i, $$0);
         return this;
      }

      public mh.a a(dku $$0, dku $$1) {
         this.a.b.put(mh.b.k, $$0);
         this.a.b.put(mh.b.r, $$1);
         return this;
      }

      public mh.a k(dku $$0) {
         this.a.b.put(mh.b.l, $$0);
         return this;
      }

      public mh.a l(dku $$0) {
         this.a.b.put(mh.b.m, $$0);
         return this;
      }

      public mh.a m(dku $$0) {
         this.a.b.put(mh.b.n, $$0);
         return this;
      }

      public mh.a n(dku $$0) {
         this.a.b.put(mh.b.o, $$0);
         return this;
      }

      public mh.a o(dku $$0) {
         this.a.b.put(mh.b.p, $$0);
         return this;
      }

      public mh.a p(dku $$0) {
         this.a.b.put(mh.b.q, $$0);
         return this;
      }

      public mh.a b() {
         this.a.c = false;
         return this;
      }

      public mh.a c() {
         this.a.d = false;
         return this;
      }

      public mh.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public mh.a b(String $$0) {
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
