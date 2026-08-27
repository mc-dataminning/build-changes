import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class jh {
   private final csq a;
   final Map<jh.b, csq> b = Maps.newHashMap();
   cdx c = cdz.f;
   boolean d = true;
   boolean e = true;
   @Nullable
   String f;
   @Nullable
   String g;

   jh(csq $$0) {
      this.a = $$0;
   }

   public csq a() {
      return this.a;
   }

   public Map<jh.b, csq> b() {
      return this.b;
   }

   public csq a(jh.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.d;
   }

   public boolean a(cdx $$0) {
      return this.e && this.c.a($$0);
   }

   public Optional<String> d() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public Optional<String> e() {
      return ac.b(this.g) ? Optional.empty() : Optional.of(this.g);
   }

   public static class a {
      private final jh a;

      public a(csq $$0) {
         this.a = new jh($$0);
      }

      public jh a() {
         return this.a;
      }

      public jh.a a(csq $$0) {
         this.a.b.put(jh.b.a, $$0);
         return this;
      }

      public jh.a b(csq $$0) {
         this.a.b.put(jh.b.b, $$0);
         return this;
      }

      public jh.a c(csq $$0) {
         this.a.b.put(jh.b.j, $$0);
         return this;
      }

      public jh.a d(csq $$0) {
         this.a.b.put(jh.b.c, $$0);
         return this;
      }

      public jh.a e(csq $$0) {
         this.a.b.put(jh.b.d, $$0);
         return this;
      }

      public jh.a f(csq $$0) {
         this.a.b.put(jh.b.e, $$0);
         return this;
      }

      public jh.a g(csq $$0) {
         this.a.b.put(jh.b.f, $$0);
         return this;
      }

      public jh.a h(csq $$0) {
         this.a.b.put(jh.b.g, $$0);
         return this;
      }

      public jh.a i(csq $$0) {
         this.a.b.put(jh.b.h, $$0);
         return this;
      }

      public jh.a j(csq $$0) {
         this.a.b.put(jh.b.i, $$0);
         return this;
      }

      public jh.a a(csq $$0, csq $$1) {
         this.a.b.put(jh.b.k, $$0);
         this.a.b.put(jh.b.r, $$1);
         return this;
      }

      public jh.a k(csq $$0) {
         this.a.b.put(jh.b.l, $$0);
         return this;
      }

      public jh.a l(csq $$0) {
         this.a.b.put(jh.b.m, $$0);
         return this;
      }

      public jh.a m(csq $$0) {
         this.a.b.put(jh.b.n, $$0);
         return this;
      }

      public jh.a n(csq $$0) {
         this.a.b.put(jh.b.o, $$0);
         return this;
      }

      public jh.a o(csq $$0) {
         this.a.b.put(jh.b.p, $$0);
         return this;
      }

      public jh.a p(csq $$0) {
         this.a.b.put(jh.b.q, $$0);
         return this;
      }

      public jh.a b() {
         this.a.d = false;
         return this;
      }

      public jh.a c() {
         this.a.e = false;
         return this;
      }

      public jh.a a(cdv... $$0) {
         this.a.c = cdz.d.a($$0);
         return this;
      }

      public jh.a a(String $$0) {
         this.a.f = $$0;
         return this;
      }

      public jh.a b(String $$0) {
         this.a.g = $$0;
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
