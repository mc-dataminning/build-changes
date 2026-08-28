import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class oq {
   public static final oq.a a = a(oo::a, on.c);
   public static final oq.a b = a(oo::a, on.d);
   public static final oq.a c = a(oo::a, on.e);
   public static final oq.a d = a(oo::k, on.j);
   public static final oq.a e = a(oo::k, on.k);
   public static final oq.a f = a(oo::q, on.n);
   public static final oq.a g = a(oo::l, on.m);
   public static final oq.a h = a(oo::B, on.p);
   public static final oq.a i = a(oo::A, on.q);
   public static final oq.a j = a(oo::f, on.aw);
   public static final oq.a k = a(oo::g, on.ax);
   public static final oq.a l = a(oo::g, on.ay);
   public static final oq.a m = a(oo::g, on.az);
   public static final oq.a n = a(oo::g, on.aA);
   public static final oq.a o = a(oo::i, on.aD);
   public static final oq.a p = a(oo::j, on.aB);
   public static final oq.a q = a(oo::u, on.aa);
   public static final oq.a r = a(oo::D, on.aS);
   public static final oq.a s = a(oo::a, on.ad);
   public static final oq.a t = a(oo::x, on.bd);
   public static final oq.a u = a(oo::x, on.be);
   public static final oq.a v = a(oo::b, on.bo);
   public static final oq.a w = a(oo::n, on.j);
   public static final oq.a x = a(oo::n, on.k);
   public static final oq.a y = a(oo::r, on.n);
   public static final oq.a z = a(oo::s, on.j);
   private final oo A;
   private final om B;

   private oq(oo $$0, om $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public om a() {
      return this.B;
   }

   public oo b() {
      return this.A;
   }

   public oq a(Consumer<oo> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public all a(dij $$0, BiConsumer<all, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public all a(dij $$0, String $$1, BiConsumer<all, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static oq.a a(Function<dij, oo> $$0, om $$1) {
      return $$2 -> new oq($$0.apply($$2), $$1);
   }

   public static oq a(all $$0) {
      return new oq(oo.b($$0), on.c);
   }

   @FunctionalInterface
   public interface a {
      oq get(dij var1);

      default all create(dij $$0, BiConsumer<all, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default all createWithSuffix(dij $$0, String $$1, BiConsumer<all, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default oq.a updateTexture(Consumer<oo> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
