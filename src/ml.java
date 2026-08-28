import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ml {
   private final dne a;
   final Map<ml.b, dne> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   ml(dne $$0) {
      this.a = $$0;
   }

   public dne a() {
      return this.a;
   }

   public Map<ml.b, dne> b() {
      return this.b;
   }

   public dne a(ml.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bap.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bap.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final ml a;

      public a(dne $$0) {
         this.a = new ml($$0);
      }

      public ml a() {
         return this.a;
      }

      public ml.a a(dne $$0) {
         this.a.b.put(ml.b.a, $$0);
         return this;
      }

      public ml.a b(dne $$0) {
         this.a.b.put(ml.b.b, $$0);
         return this;
      }

      public ml.a c(dne $$0) {
         this.a.b.put(ml.b.j, $$0);
         return this;
      }

      public ml.a d(dne $$0) {
         this.a.b.put(ml.b.c, $$0);
         return this;
      }

      public ml.a e(dne $$0) {
         this.a.b.put(ml.b.d, $$0);
         return this;
      }

      public ml.a f(dne $$0) {
         this.a.b.put(ml.b.e, $$0);
         return this;
      }

      public ml.a g(dne $$0) {
         this.a.b.put(ml.b.f, $$0);
         return this;
      }

      public ml.a h(dne $$0) {
         this.a.b.put(ml.b.g, $$0);
         return this;
      }

      public ml.a i(dne $$0) {
         this.a.b.put(ml.b.h, $$0);
         return this;
      }

      public ml.a j(dne $$0) {
         this.a.b.put(ml.b.i, $$0);
         return this;
      }

      public ml.a a(dne $$0, dne $$1) {
         this.a.b.put(ml.b.k, $$0);
         this.a.b.put(ml.b.r, $$1);
         return this;
      }

      public ml.a k(dne $$0) {
         this.a.b.put(ml.b.l, $$0);
         return this;
      }

      public ml.a l(dne $$0) {
         this.a.b.put(ml.b.m, $$0);
         return this;
      }

      public ml.a m(dne $$0) {
         this.a.b.put(ml.b.n, $$0);
         return this;
      }

      public ml.a n(dne $$0) {
         this.a.b.put(ml.b.o, $$0);
         return this;
      }

      public ml.a o(dne $$0) {
         this.a.b.put(ml.b.p, $$0);
         return this;
      }

      public ml.a p(dne $$0) {
         this.a.b.put(ml.b.q, $$0);
         return this;
      }

      public ml.a b() {
         this.a.c = false;
         return this;
      }

      public ml.a c() {
         this.a.d = false;
         return this;
      }

      public ml.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public ml.a b(String $$0) {
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
