import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ly {
   private final dgv a;
   final Map<ly.b, dgv> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   ly(dgv $$0) {
      this.a = $$0;
   }

   public dgv a() {
      return this.a;
   }

   public Map<ly.b, dgv> b() {
      return this.b;
   }

   public dgv a(ly.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return azz.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return azz.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final ly a;

      public a(dgv $$0) {
         this.a = new ly($$0);
      }

      public ly a() {
         return this.a;
      }

      public ly.a a(dgv $$0) {
         this.a.b.put(ly.b.a, $$0);
         return this;
      }

      public ly.a b(dgv $$0) {
         this.a.b.put(ly.b.b, $$0);
         return this;
      }

      public ly.a c(dgv $$0) {
         this.a.b.put(ly.b.j, $$0);
         return this;
      }

      public ly.a d(dgv $$0) {
         this.a.b.put(ly.b.c, $$0);
         return this;
      }

      public ly.a e(dgv $$0) {
         this.a.b.put(ly.b.d, $$0);
         return this;
      }

      public ly.a f(dgv $$0) {
         this.a.b.put(ly.b.e, $$0);
         return this;
      }

      public ly.a g(dgv $$0) {
         this.a.b.put(ly.b.f, $$0);
         return this;
      }

      public ly.a h(dgv $$0) {
         this.a.b.put(ly.b.g, $$0);
         return this;
      }

      public ly.a i(dgv $$0) {
         this.a.b.put(ly.b.h, $$0);
         return this;
      }

      public ly.a j(dgv $$0) {
         this.a.b.put(ly.b.i, $$0);
         return this;
      }

      public ly.a a(dgv $$0, dgv $$1) {
         this.a.b.put(ly.b.k, $$0);
         this.a.b.put(ly.b.r, $$1);
         return this;
      }

      public ly.a k(dgv $$0) {
         this.a.b.put(ly.b.l, $$0);
         return this;
      }

      public ly.a l(dgv $$0) {
         this.a.b.put(ly.b.m, $$0);
         return this;
      }

      public ly.a m(dgv $$0) {
         this.a.b.put(ly.b.n, $$0);
         return this;
      }

      public ly.a n(dgv $$0) {
         this.a.b.put(ly.b.o, $$0);
         return this;
      }

      public ly.a o(dgv $$0) {
         this.a.b.put(ly.b.p, $$0);
         return this;
      }

      public ly.a p(dgv $$0) {
         this.a.b.put(ly.b.q, $$0);
         return this;
      }

      public ly.a b() {
         this.a.c = false;
         return this;
      }

      public ly.a c() {
         this.a.d = false;
         return this;
      }

      public ly.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public ly.a b(String $$0) {
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
