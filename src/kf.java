import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kf {
   private final cvz a;
   final Map<kf.b, cvz> b = Maps.newHashMap();
   chb c = chd.g;
   boolean d = true;
   boolean e = true;
   @Nullable
   String f;
   @Nullable
   String g;

   kf(cvz $$0) {
      this.a = $$0;
   }

   public cvz a() {
      return this.a;
   }

   public Map<kf.b, cvz> b() {
      return this.b;
   }

   public cvz a(kf.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.d;
   }

   public boolean a(chb $$0) {
      return this.e && this.c.a($$0);
   }

   public Optional<String> d() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public Optional<String> e() {
      return ac.b(this.g) ? Optional.empty() : Optional.of(this.g);
   }

   public static class a {
      private final kf a;

      public a(cvz $$0) {
         this.a = new kf($$0);
      }

      public kf a() {
         return this.a;
      }

      public kf.a a(cvz $$0) {
         this.a.b.put(kf.b.a, $$0);
         return this;
      }

      public kf.a b(cvz $$0) {
         this.a.b.put(kf.b.b, $$0);
         return this;
      }

      public kf.a c(cvz $$0) {
         this.a.b.put(kf.b.j, $$0);
         return this;
      }

      public kf.a d(cvz $$0) {
         this.a.b.put(kf.b.c, $$0);
         return this;
      }

      public kf.a e(cvz $$0) {
         this.a.b.put(kf.b.d, $$0);
         return this;
      }

      public kf.a f(cvz $$0) {
         this.a.b.put(kf.b.e, $$0);
         return this;
      }

      public kf.a g(cvz $$0) {
         this.a.b.put(kf.b.f, $$0);
         return this;
      }

      public kf.a h(cvz $$0) {
         this.a.b.put(kf.b.g, $$0);
         return this;
      }

      public kf.a i(cvz $$0) {
         this.a.b.put(kf.b.h, $$0);
         return this;
      }

      public kf.a j(cvz $$0) {
         this.a.b.put(kf.b.i, $$0);
         return this;
      }

      public kf.a a(cvz $$0, cvz $$1) {
         this.a.b.put(kf.b.k, $$0);
         this.a.b.put(kf.b.r, $$1);
         return this;
      }

      public kf.a k(cvz $$0) {
         this.a.b.put(kf.b.l, $$0);
         return this;
      }

      public kf.a l(cvz $$0) {
         this.a.b.put(kf.b.m, $$0);
         return this;
      }

      public kf.a m(cvz $$0) {
         this.a.b.put(kf.b.n, $$0);
         return this;
      }

      public kf.a n(cvz $$0) {
         this.a.b.put(kf.b.o, $$0);
         return this;
      }

      public kf.a o(cvz $$0) {
         this.a.b.put(kf.b.p, $$0);
         return this;
      }

      public kf.a p(cvz $$0) {
         this.a.b.put(kf.b.q, $$0);
         return this;
      }

      public kf.a b() {
         this.a.d = false;
         return this;
      }

      public kf.a c() {
         this.a.e = false;
         return this;
      }

      public kf.a a(cgz... $$0) {
         this.a.c = chd.e.a($$0);
         return this;
      }

      public kf.a a(String $$0) {
         this.a.f = $$0;
         return this;
      }

      public kf.a b(String $$0) {
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
