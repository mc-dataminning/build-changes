import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class md {
   private final diq a;
   final Map<md.b, diq> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   md(diq $$0) {
      this.a = $$0;
   }

   public diq a() {
      return this.a;
   }

   public Map<md.b, diq> b() {
      return this.b;
   }

   public diq a(md.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return baj.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return baj.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final md a;

      public a(diq $$0) {
         this.a = new md($$0);
      }

      public md a() {
         return this.a;
      }

      public md.a a(diq $$0) {
         this.a.b.put(md.b.a, $$0);
         return this;
      }

      public md.a b(diq $$0) {
         this.a.b.put(md.b.b, $$0);
         return this;
      }

      public md.a c(diq $$0) {
         this.a.b.put(md.b.j, $$0);
         return this;
      }

      public md.a d(diq $$0) {
         this.a.b.put(md.b.c, $$0);
         return this;
      }

      public md.a e(diq $$0) {
         this.a.b.put(md.b.d, $$0);
         return this;
      }

      public md.a f(diq $$0) {
         this.a.b.put(md.b.e, $$0);
         return this;
      }

      public md.a g(diq $$0) {
         this.a.b.put(md.b.f, $$0);
         return this;
      }

      public md.a h(diq $$0) {
         this.a.b.put(md.b.g, $$0);
         return this;
      }

      public md.a i(diq $$0) {
         this.a.b.put(md.b.h, $$0);
         return this;
      }

      public md.a j(diq $$0) {
         this.a.b.put(md.b.i, $$0);
         return this;
      }

      public md.a a(diq $$0, diq $$1) {
         this.a.b.put(md.b.k, $$0);
         this.a.b.put(md.b.r, $$1);
         return this;
      }

      public md.a k(diq $$0) {
         this.a.b.put(md.b.l, $$0);
         return this;
      }

      public md.a l(diq $$0) {
         this.a.b.put(md.b.m, $$0);
         return this;
      }

      public md.a m(diq $$0) {
         this.a.b.put(md.b.n, $$0);
         return this;
      }

      public md.a n(diq $$0) {
         this.a.b.put(md.b.o, $$0);
         return this;
      }

      public md.a o(diq $$0) {
         this.a.b.put(md.b.p, $$0);
         return this;
      }

      public md.a p(diq $$0) {
         this.a.b.put(md.b.q, $$0);
         return this;
      }

      public md.a b() {
         this.a.c = false;
         return this;
      }

      public md.a c() {
         this.a.d = false;
         return this;
      }

      public md.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public md.a b(String $$0) {
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
