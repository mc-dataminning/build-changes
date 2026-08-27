import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class nm {
   public static final nm.a a = a(nk::a, nj.c);
   public static final nm.a b = a(nk::a, nj.d);
   public static final nm.a c = a(nk::a, nj.e);
   public static final nm.a d = a(nk::k, nj.j);
   public static final nm.a e = a(nk::k, nj.k);
   public static final nm.a f = a(nk::q, nj.n);
   public static final nm.a g = a(nk::l, nj.m);
   public static final nm.a h = a(nk::B, nj.p);
   public static final nm.a i = a(nk::A, nj.q);
   public static final nm.a j = a(nk::f, nj.aw);
   public static final nm.a k = a(nk::g, nj.ax);
   public static final nm.a l = a(nk::g, nj.ay);
   public static final nm.a m = a(nk::g, nj.az);
   public static final nm.a n = a(nk::g, nj.aA);
   public static final nm.a o = a(nk::i, nj.aD);
   public static final nm.a p = a(nk::j, nj.aB);
   public static final nm.a q = a(nk::u, nj.aa);
   public static final nm.a r = a(nk::D, nj.aS);
   public static final nm.a s = a(nk::a, nj.ad);
   public static final nm.a t = a(nk::x, nj.bd);
   public static final nm.a u = a(nk::x, nj.be);
   public static final nm.a v = a(nk::b, nj.bk);
   public static final nm.a w = a(nk::n, nj.j);
   public static final nm.a x = a(nk::n, nj.k);
   public static final nm.a y = a(nk::r, nj.n);
   public static final nm.a z = a(nk::s, nj.j);
   private final nk A;
   private final ni B;

   private nm(nk $$0, ni $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public ni a() {
      return this.B;
   }

   public nk b() {
      return this.A;
   }

   public nm a(Consumer<nk> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ajv a(dch $$0, BiConsumer<ajv, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ajv a(dch $$0, String $$1, BiConsumer<ajv, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static nm.a a(Function<dch, nk> $$0, ni $$1) {
      return $$2 -> new nm($$0.apply($$2), $$1);
   }

   public static nm a(ajv $$0) {
      return new nm(nk.b($$0), nj.c);
   }

   @FunctionalInterface
   public interface a {
      nm get(dch var1);

      default ajv create(dch $$0, BiConsumer<ajv, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ajv createWithSuffix(dch $$0, String $$1, BiConsumer<ajv, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default nm.a updateTexture(Consumer<nk> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
