import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kj {
   private final cyo a;
   final Map<kj.b, cyo> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   kj(cyo $$0) {
      this.a = $$0;
   }

   public cyo a() {
      return this.a;
   }

   public Map<kj.b, cyo> b() {
      return this.b;
   }

   public cyo a(kj.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ac.b(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final kj a;

      public a(cyo $$0) {
         this.a = new kj($$0);
      }

      public kj a() {
         return this.a;
      }

      public kj.a a(cyo $$0) {
         this.a.b.put(kj.b.a, $$0);
         return this;
      }

      public kj.a b(cyo $$0) {
         this.a.b.put(kj.b.b, $$0);
         return this;
      }

      public kj.a c(cyo $$0) {
         this.a.b.put(kj.b.j, $$0);
         return this;
      }

      public kj.a d(cyo $$0) {
         this.a.b.put(kj.b.c, $$0);
         return this;
      }

      public kj.a e(cyo $$0) {
         this.a.b.put(kj.b.d, $$0);
         return this;
      }

      public kj.a f(cyo $$0) {
         this.a.b.put(kj.b.e, $$0);
         return this;
      }

      public kj.a g(cyo $$0) {
         this.a.b.put(kj.b.f, $$0);
         return this;
      }

      public kj.a h(cyo $$0) {
         this.a.b.put(kj.b.g, $$0);
         return this;
      }

      public kj.a i(cyo $$0) {
         this.a.b.put(kj.b.h, $$0);
         return this;
      }

      public kj.a j(cyo $$0) {
         this.a.b.put(kj.b.i, $$0);
         return this;
      }

      public kj.a a(cyo $$0, cyo $$1) {
         this.a.b.put(kj.b.k, $$0);
         this.a.b.put(kj.b.r, $$1);
         return this;
      }

      public kj.a k(cyo $$0) {
         this.a.b.put(kj.b.l, $$0);
         return this;
      }

      public kj.a l(cyo $$0) {
         this.a.b.put(kj.b.m, $$0);
         return this;
      }

      public kj.a m(cyo $$0) {
         this.a.b.put(kj.b.n, $$0);
         return this;
      }

      public kj.a n(cyo $$0) {
         this.a.b.put(kj.b.o, $$0);
         return this;
      }

      public kj.a o(cyo $$0) {
         this.a.b.put(kj.b.p, $$0);
         return this;
      }

      public kj.a p(cyo $$0) {
         this.a.b.put(kj.b.q, $$0);
         return this;
      }

      public kj.a b() {
         this.a.c = false;
         return this;
      }

      public kj.a c() {
         this.a.d = false;
         return this;
      }

      public kj.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public kj.a b(String $$0) {
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
