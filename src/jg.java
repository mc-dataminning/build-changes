import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class jg {
   private final csk a;
   final Map<jg.b, csk> b = Maps.newHashMap();
   cdt c = cdv.f;
   boolean d = true;
   boolean e = true;
   @Nullable
   String f;
   @Nullable
   String g;

   jg(csk $$0) {
      this.a = $$0;
   }

   public csk a() {
      return this.a;
   }

   public Map<jg.b, csk> b() {
      return this.b;
   }

   public csk a(jg.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.d;
   }

   public boolean a(cdt $$0) {
      return this.e && this.c.a($$0);
   }

   public Optional<String> d() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public Optional<String> e() {
      return ac.b(this.g) ? Optional.empty() : Optional.of(this.g);
   }

   public static class a {
      private final jg a;

      public a(csk $$0) {
         this.a = new jg($$0);
      }

      public jg a() {
         return this.a;
      }

      public jg.a a(csk $$0) {
         this.a.b.put(jg.b.a, $$0);
         return this;
      }

      public jg.a b(csk $$0) {
         this.a.b.put(jg.b.b, $$0);
         return this;
      }

      public jg.a c(csk $$0) {
         this.a.b.put(jg.b.j, $$0);
         return this;
      }

      public jg.a d(csk $$0) {
         this.a.b.put(jg.b.c, $$0);
         return this;
      }

      public jg.a e(csk $$0) {
         this.a.b.put(jg.b.d, $$0);
         return this;
      }

      public jg.a f(csk $$0) {
         this.a.b.put(jg.b.e, $$0);
         return this;
      }

      public jg.a g(csk $$0) {
         this.a.b.put(jg.b.f, $$0);
         return this;
      }

      public jg.a h(csk $$0) {
         this.a.b.put(jg.b.g, $$0);
         return this;
      }

      public jg.a i(csk $$0) {
         this.a.b.put(jg.b.h, $$0);
         return this;
      }

      public jg.a j(csk $$0) {
         this.a.b.put(jg.b.i, $$0);
         return this;
      }

      public jg.a a(csk $$0, csk $$1) {
         this.a.b.put(jg.b.k, $$0);
         this.a.b.put(jg.b.r, $$1);
         return this;
      }

      public jg.a k(csk $$0) {
         this.a.b.put(jg.b.l, $$0);
         return this;
      }

      public jg.a l(csk $$0) {
         this.a.b.put(jg.b.m, $$0);
         return this;
      }

      public jg.a m(csk $$0) {
         this.a.b.put(jg.b.n, $$0);
         return this;
      }

      public jg.a n(csk $$0) {
         this.a.b.put(jg.b.o, $$0);
         return this;
      }

      public jg.a o(csk $$0) {
         this.a.b.put(jg.b.p, $$0);
         return this;
      }

      public jg.a p(csk $$0) {
         this.a.b.put(jg.b.q, $$0);
         return this;
      }

      public jg.a b() {
         this.a.d = false;
         return this;
      }

      public jg.a c() {
         this.a.e = false;
         return this;
      }

      public jg.a a(cdr... $$0) {
         this.a.c = cdv.d.a($$0);
         return this;
      }

      public jg.a a(String $$0) {
         this.a.f = $$0;
         return this;
      }

      public jg.a b(String $$0) {
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
