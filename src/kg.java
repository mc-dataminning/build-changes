import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kg {
   private final cvf a;
   final Map<kg.b, cvf> b = Maps.newHashMap();
   cgi c = cgk.g;
   boolean d = true;
   boolean e = true;
   @Nullable
   String f;
   @Nullable
   String g;

   kg(cvf $$0) {
      this.a = $$0;
   }

   public cvf a() {
      return this.a;
   }

   public Map<kg.b, cvf> b() {
      return this.b;
   }

   public cvf a(kg.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.d;
   }

   public boolean a(cgi $$0) {
      return this.e && this.c.a($$0);
   }

   public Optional<String> d() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public Optional<String> e() {
      return ac.b(this.g) ? Optional.empty() : Optional.of(this.g);
   }

   public static class a {
      private final kg a;

      public a(cvf $$0) {
         this.a = new kg($$0);
      }

      public kg a() {
         return this.a;
      }

      public kg.a a(cvf $$0) {
         this.a.b.put(kg.b.a, $$0);
         return this;
      }

      public kg.a b(cvf $$0) {
         this.a.b.put(kg.b.b, $$0);
         return this;
      }

      public kg.a c(cvf $$0) {
         this.a.b.put(kg.b.j, $$0);
         return this;
      }

      public kg.a d(cvf $$0) {
         this.a.b.put(kg.b.c, $$0);
         return this;
      }

      public kg.a e(cvf $$0) {
         this.a.b.put(kg.b.d, $$0);
         return this;
      }

      public kg.a f(cvf $$0) {
         this.a.b.put(kg.b.e, $$0);
         return this;
      }

      public kg.a g(cvf $$0) {
         this.a.b.put(kg.b.f, $$0);
         return this;
      }

      public kg.a h(cvf $$0) {
         this.a.b.put(kg.b.g, $$0);
         return this;
      }

      public kg.a i(cvf $$0) {
         this.a.b.put(kg.b.h, $$0);
         return this;
      }

      public kg.a j(cvf $$0) {
         this.a.b.put(kg.b.i, $$0);
         return this;
      }

      public kg.a a(cvf $$0, cvf $$1) {
         this.a.b.put(kg.b.k, $$0);
         this.a.b.put(kg.b.r, $$1);
         return this;
      }

      public kg.a k(cvf $$0) {
         this.a.b.put(kg.b.l, $$0);
         return this;
      }

      public kg.a l(cvf $$0) {
         this.a.b.put(kg.b.m, $$0);
         return this;
      }

      public kg.a m(cvf $$0) {
         this.a.b.put(kg.b.n, $$0);
         return this;
      }

      public kg.a n(cvf $$0) {
         this.a.b.put(kg.b.o, $$0);
         return this;
      }

      public kg.a o(cvf $$0) {
         this.a.b.put(kg.b.p, $$0);
         return this;
      }

      public kg.a p(cvf $$0) {
         this.a.b.put(kg.b.q, $$0);
         return this;
      }

      public kg.a b() {
         this.a.d = false;
         return this;
      }

      public kg.a c() {
         this.a.e = false;
         return this;
      }

      public kg.a a(cgg... $$0) {
         this.a.c = cgk.e.a($$0);
         return this;
      }

      public kg.a a(String $$0) {
         this.a.f = $$0;
         return this;
      }

      public kg.a b(String $$0) {
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
