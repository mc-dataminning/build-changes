import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class jf {
   private final csl a;
   final Map<jf.b, csl> b = Maps.newHashMap();
   cdu c = cdw.f;
   boolean d = true;
   boolean e = true;
   @Nullable
   String f;
   @Nullable
   String g;

   jf(csl $$0) {
      this.a = $$0;
   }

   public csl a() {
      return this.a;
   }

   public Map<jf.b, csl> b() {
      return this.b;
   }

   public csl a(jf.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.d;
   }

   public boolean a(cdu $$0) {
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

      public a(csl $$0) {
         this.a = new jf($$0);
      }

      public jf a() {
         return this.a;
      }

      public jf.a a(csl $$0) {
         this.a.b.put(jf.b.a, $$0);
         return this;
      }

      public jf.a b(csl $$0) {
         this.a.b.put(jf.b.b, $$0);
         return this;
      }

      public jf.a c(csl $$0) {
         this.a.b.put(jf.b.j, $$0);
         return this;
      }

      public jf.a d(csl $$0) {
         this.a.b.put(jf.b.c, $$0);
         return this;
      }

      public jf.a e(csl $$0) {
         this.a.b.put(jf.b.d, $$0);
         return this;
      }

      public jf.a f(csl $$0) {
         this.a.b.put(jf.b.e, $$0);
         return this;
      }

      public jf.a g(csl $$0) {
         this.a.b.put(jf.b.f, $$0);
         return this;
      }

      public jf.a h(csl $$0) {
         this.a.b.put(jf.b.g, $$0);
         return this;
      }

      public jf.a i(csl $$0) {
         this.a.b.put(jf.b.h, $$0);
         return this;
      }

      public jf.a j(csl $$0) {
         this.a.b.put(jf.b.i, $$0);
         return this;
      }

      public jf.a a(csl $$0, csl $$1) {
         this.a.b.put(jf.b.k, $$0);
         this.a.b.put(jf.b.r, $$1);
         return this;
      }

      public jf.a k(csl $$0) {
         this.a.b.put(jf.b.l, $$0);
         return this;
      }

      public jf.a l(csl $$0) {
         this.a.b.put(jf.b.m, $$0);
         return this;
      }

      public jf.a m(csl $$0) {
         this.a.b.put(jf.b.n, $$0);
         return this;
      }

      public jf.a n(csl $$0) {
         this.a.b.put(jf.b.o, $$0);
         return this;
      }

      public jf.a o(csl $$0) {
         this.a.b.put(jf.b.p, $$0);
         return this;
      }

      public jf.a p(csl $$0) {
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

      public jf.a a(cds... $$0) {
         this.a.c = cdw.d.a($$0);
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
