import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class kc {
   private final cut a;
   final Map<kc.b, cut> b = Maps.newHashMap();
   cfv c = cfx.g;
   boolean d = true;
   boolean e = true;
   @Nullable
   String f;
   @Nullable
   String g;

   kc(cut $$0) {
      this.a = $$0;
   }

   public cut a() {
      return this.a;
   }

   public Map<kc.b, cut> b() {
      return this.b;
   }

   public cut a(kc.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.d;
   }

   public boolean a(cfv $$0) {
      return this.e && this.c.a($$0);
   }

   public Optional<String> d() {
      return ac.b(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public Optional<String> e() {
      return ac.b(this.g) ? Optional.empty() : Optional.of(this.g);
   }

   public static class a {
      private final kc a;

      public a(cut $$0) {
         this.a = new kc($$0);
      }

      public kc a() {
         return this.a;
      }

      public kc.a a(cut $$0) {
         this.a.b.put(kc.b.a, $$0);
         return this;
      }

      public kc.a b(cut $$0) {
         this.a.b.put(kc.b.b, $$0);
         return this;
      }

      public kc.a c(cut $$0) {
         this.a.b.put(kc.b.j, $$0);
         return this;
      }

      public kc.a d(cut $$0) {
         this.a.b.put(kc.b.c, $$0);
         return this;
      }

      public kc.a e(cut $$0) {
         this.a.b.put(kc.b.d, $$0);
         return this;
      }

      public kc.a f(cut $$0) {
         this.a.b.put(kc.b.e, $$0);
         return this;
      }

      public kc.a g(cut $$0) {
         this.a.b.put(kc.b.f, $$0);
         return this;
      }

      public kc.a h(cut $$0) {
         this.a.b.put(kc.b.g, $$0);
         return this;
      }

      public kc.a i(cut $$0) {
         this.a.b.put(kc.b.h, $$0);
         return this;
      }

      public kc.a j(cut $$0) {
         this.a.b.put(kc.b.i, $$0);
         return this;
      }

      public kc.a a(cut $$0, cut $$1) {
         this.a.b.put(kc.b.k, $$0);
         this.a.b.put(kc.b.r, $$1);
         return this;
      }

      public kc.a k(cut $$0) {
         this.a.b.put(kc.b.l, $$0);
         return this;
      }

      public kc.a l(cut $$0) {
         this.a.b.put(kc.b.m, $$0);
         return this;
      }

      public kc.a m(cut $$0) {
         this.a.b.put(kc.b.n, $$0);
         return this;
      }

      public kc.a n(cut $$0) {
         this.a.b.put(kc.b.o, $$0);
         return this;
      }

      public kc.a o(cut $$0) {
         this.a.b.put(kc.b.p, $$0);
         return this;
      }

      public kc.a p(cut $$0) {
         this.a.b.put(kc.b.q, $$0);
         return this;
      }

      public kc.a b() {
         this.a.d = false;
         return this;
      }

      public kc.a c() {
         this.a.e = false;
         return this;
      }

      public kc.a a(cft... $$0) {
         this.a.c = cfx.e.a($$0);
         return this;
      }

      public kc.a a(String $$0) {
         this.a.f = $$0;
         return this;
      }

      public kc.a b(String $$0) {
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
