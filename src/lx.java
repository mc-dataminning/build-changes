import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class lx {
   private final dfw a;
   final Map<lx.b, dfw> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   lx(dfw $$0) {
      this.a = $$0;
   }

   public dfw a() {
      return this.a;
   }

   public Map<lx.b, dfw> b() {
      return this.b;
   }

   public dfw a(lx.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return azk.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return azk.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final lx a;

      public a(dfw $$0) {
         this.a = new lx($$0);
      }

      public lx a() {
         return this.a;
      }

      public lx.a a(dfw $$0) {
         this.a.b.put(lx.b.a, $$0);
         return this;
      }

      public lx.a b(dfw $$0) {
         this.a.b.put(lx.b.b, $$0);
         return this;
      }

      public lx.a c(dfw $$0) {
         this.a.b.put(lx.b.j, $$0);
         return this;
      }

      public lx.a d(dfw $$0) {
         this.a.b.put(lx.b.c, $$0);
         return this;
      }

      public lx.a e(dfw $$0) {
         this.a.b.put(lx.b.d, $$0);
         return this;
      }

      public lx.a f(dfw $$0) {
         this.a.b.put(lx.b.e, $$0);
         return this;
      }

      public lx.a g(dfw $$0) {
         this.a.b.put(lx.b.f, $$0);
         return this;
      }

      public lx.a h(dfw $$0) {
         this.a.b.put(lx.b.g, $$0);
         return this;
      }

      public lx.a i(dfw $$0) {
         this.a.b.put(lx.b.h, $$0);
         return this;
      }

      public lx.a j(dfw $$0) {
         this.a.b.put(lx.b.i, $$0);
         return this;
      }

      public lx.a a(dfw $$0, dfw $$1) {
         this.a.b.put(lx.b.k, $$0);
         this.a.b.put(lx.b.r, $$1);
         return this;
      }

      public lx.a k(dfw $$0) {
         this.a.b.put(lx.b.l, $$0);
         return this;
      }

      public lx.a l(dfw $$0) {
         this.a.b.put(lx.b.m, $$0);
         return this;
      }

      public lx.a m(dfw $$0) {
         this.a.b.put(lx.b.n, $$0);
         return this;
      }

      public lx.a n(dfw $$0) {
         this.a.b.put(lx.b.o, $$0);
         return this;
      }

      public lx.a o(dfw $$0) {
         this.a.b.put(lx.b.p, $$0);
         return this;
      }

      public lx.a p(dfw $$0) {
         this.a.b.put(lx.b.q, $$0);
         return this;
      }

      public lx.a b() {
         this.a.c = false;
         return this;
      }

      public lx.a c() {
         this.a.d = false;
         return this;
      }

      public lx.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public lx.a b(String $$0) {
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
