import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kx {
   private final dch a;
   final Map<kx.b, dch> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   kx(dch $$0) {
      this.a = $$0;
   }

   public dch a() {
      return this.a;
   }

   public Map<kx.b, dch> b() {
      return this.b;
   }

   public dch a(kx.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ayh.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ayh.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final kx a;

      public a(dch $$0) {
         this.a = new kx($$0);
      }

      public kx a() {
         return this.a;
      }

      public kx.a a(dch $$0) {
         this.a.b.put(kx.b.a, $$0);
         return this;
      }

      public kx.a b(dch $$0) {
         this.a.b.put(kx.b.b, $$0);
         return this;
      }

      public kx.a c(dch $$0) {
         this.a.b.put(kx.b.j, $$0);
         return this;
      }

      public kx.a d(dch $$0) {
         this.a.b.put(kx.b.c, $$0);
         return this;
      }

      public kx.a e(dch $$0) {
         this.a.b.put(kx.b.d, $$0);
         return this;
      }

      public kx.a f(dch $$0) {
         this.a.b.put(kx.b.e, $$0);
         return this;
      }

      public kx.a g(dch $$0) {
         this.a.b.put(kx.b.f, $$0);
         return this;
      }

      public kx.a h(dch $$0) {
         this.a.b.put(kx.b.g, $$0);
         return this;
      }

      public kx.a i(dch $$0) {
         this.a.b.put(kx.b.h, $$0);
         return this;
      }

      public kx.a j(dch $$0) {
         this.a.b.put(kx.b.i, $$0);
         return this;
      }

      public kx.a a(dch $$0, dch $$1) {
         this.a.b.put(kx.b.k, $$0);
         this.a.b.put(kx.b.r, $$1);
         return this;
      }

      public kx.a k(dch $$0) {
         this.a.b.put(kx.b.l, $$0);
         return this;
      }

      public kx.a l(dch $$0) {
         this.a.b.put(kx.b.m, $$0);
         return this;
      }

      public kx.a m(dch $$0) {
         this.a.b.put(kx.b.n, $$0);
         return this;
      }

      public kx.a n(dch $$0) {
         this.a.b.put(kx.b.o, $$0);
         return this;
      }

      public kx.a o(dch $$0) {
         this.a.b.put(kx.b.p, $$0);
         return this;
      }

      public kx.a p(dch $$0) {
         this.a.b.put(kx.b.q, $$0);
         return this;
      }

      public kx.a b() {
         this.a.c = false;
         return this;
      }

      public kx.a c() {
         this.a.d = false;
         return this;
      }

      public kx.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public kx.a b(String $$0) {
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
