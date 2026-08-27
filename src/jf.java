import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class jf {
   private final csm a;
   final Map<jf.b, csm> b = Maps.newHashMap();
   cdv c = cdx.f;
   boolean d = true;
   boolean e = true;
   @Nullable
   String f;
   @Nullable
   String g;

   jf(csm $$0) {
      this.a = $$0;
   }

   public csm a() {
      return this.a;
   }

   public Map<jf.b, csm> b() {
      return this.b;
   }

   public csm a(jf.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.d;
   }

   public boolean a(cdv $$0) {
      return this.e && this.c.a($$0);
   }

   public Optional<String> d() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public Optional<String> e() {
      return ac.b(this.g) ? Optional.empty() : Optional.of(this.g);
   }

   public static class a {
      private final jf a;

      public a(csm $$0) {
         this.a = new jf($$0);
      }

      public jf a() {
         return this.a;
      }

      public jf.a a(csm $$0) {
         this.a.b.put(jf.b.a, $$0);
         return this;
      }

      public jf.a b(csm $$0) {
         this.a.b.put(jf.b.b, $$0);
         return this;
      }

      public jf.a c(csm $$0) {
         this.a.b.put(jf.b.j, $$0);
         return this;
      }

      public jf.a d(csm $$0) {
         this.a.b.put(jf.b.c, $$0);
         return this;
      }

      public jf.a e(csm $$0) {
         this.a.b.put(jf.b.d, $$0);
         return this;
      }

      public jf.a f(csm $$0) {
         this.a.b.put(jf.b.e, $$0);
         return this;
      }

      public jf.a g(csm $$0) {
         this.a.b.put(jf.b.f, $$0);
         return this;
      }

      public jf.a h(csm $$0) {
         this.a.b.put(jf.b.g, $$0);
         return this;
      }

      public jf.a i(csm $$0) {
         this.a.b.put(jf.b.h, $$0);
         return this;
      }

      public jf.a j(csm $$0) {
         this.a.b.put(jf.b.i, $$0);
         return this;
      }

      public jf.a a(csm $$0, csm $$1) {
         this.a.b.put(jf.b.k, $$0);
         this.a.b.put(jf.b.r, $$1);
         return this;
      }

      public jf.a k(csm $$0) {
         this.a.b.put(jf.b.l, $$0);
         return this;
      }

      public jf.a l(csm $$0) {
         this.a.b.put(jf.b.m, $$0);
         return this;
      }

      public jf.a m(csm $$0) {
         this.a.b.put(jf.b.n, $$0);
         return this;
      }

      public jf.a n(csm $$0) {
         this.a.b.put(jf.b.o, $$0);
         return this;
      }

      public jf.a o(csm $$0) {
         this.a.b.put(jf.b.p, $$0);
         return this;
      }

      public jf.a p(csm $$0) {
         this.a.b.put(jf.b.q, $$0);
         return this;
      }

      public jf.a b() {
         this.a.d = false;
         return this;
      }

      public jf.a c() {
         this.a.e = false;
         return this;
      }

      public jf.a a(cdt... $$0) {
         this.a.c = cdx.d.a($$0);
         return this;
      }

      public jf.a a(String $$0) {
         this.a.f = $$0;
         return this;
      }

      public jf.a b(String $$0) {
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
