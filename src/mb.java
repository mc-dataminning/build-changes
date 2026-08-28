import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class mb {
   private final dhy a;
   final Map<mb.b, dhy> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   mb(dhy $$0) {
      this.a = $$0;
   }

   public dhy a() {
      return this.a;
   }

   public Map<mb.b, dhy> b() {
      return this.b;
   }

   public dhy a(mb.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bag.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bag.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final mb a;

      public a(dhy $$0) {
         this.a = new mb($$0);
      }

      public mb a() {
         return this.a;
      }

      public mb.a a(dhy $$0) {
         this.a.b.put(mb.b.a, $$0);
         return this;
      }

      public mb.a b(dhy $$0) {
         this.a.b.put(mb.b.b, $$0);
         return this;
      }

      public mb.a c(dhy $$0) {
         this.a.b.put(mb.b.j, $$0);
         return this;
      }

      public mb.a d(dhy $$0) {
         this.a.b.put(mb.b.c, $$0);
         return this;
      }

      public mb.a e(dhy $$0) {
         this.a.b.put(mb.b.d, $$0);
         return this;
      }

      public mb.a f(dhy $$0) {
         this.a.b.put(mb.b.e, $$0);
         return this;
      }

      public mb.a g(dhy $$0) {
         this.a.b.put(mb.b.f, $$0);
         return this;
      }

      public mb.a h(dhy $$0) {
         this.a.b.put(mb.b.g, $$0);
         return this;
      }

      public mb.a i(dhy $$0) {
         this.a.b.put(mb.b.h, $$0);
         return this;
      }

      public mb.a j(dhy $$0) {
         this.a.b.put(mb.b.i, $$0);
         return this;
      }

      public mb.a a(dhy $$0, dhy $$1) {
         this.a.b.put(mb.b.k, $$0);
         this.a.b.put(mb.b.r, $$1);
         return this;
      }

      public mb.a k(dhy $$0) {
         this.a.b.put(mb.b.l, $$0);
         return this;
      }

      public mb.a l(dhy $$0) {
         this.a.b.put(mb.b.m, $$0);
         return this;
      }

      public mb.a m(dhy $$0) {
         this.a.b.put(mb.b.n, $$0);
         return this;
      }

      public mb.a n(dhy $$0) {
         this.a.b.put(mb.b.o, $$0);
         return this;
      }

      public mb.a o(dhy $$0) {
         this.a.b.put(mb.b.p, $$0);
         return this;
      }

      public mb.a p(dhy $$0) {
         this.a.b.put(mb.b.q, $$0);
         return this;
      }

      public mb.a b() {
         this.a.c = false;
         return this;
      }

      public mb.a c() {
         this.a.d = false;
         return this;
      }

      public mb.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public mb.a b(String $$0) {
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
