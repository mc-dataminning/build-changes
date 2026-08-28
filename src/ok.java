import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ok {
   public static final ok.a a = a(oi::a, oh.c);
   public static final ok.a b = a(oi::a, oh.d);
   public static final ok.a c = a(oi::a, oh.e);
   public static final ok.a d = a(oi::k, oh.j);
   public static final ok.a e = a(oi::k, oh.k);
   public static final ok.a f = a(oi::q, oh.n);
   public static final ok.a g = a(oi::l, oh.m);
   public static final ok.a h = a(oi::B, oh.p);
   public static final ok.a i = a(oi::A, oh.q);
   public static final ok.a j = a(oi::f, oh.aw);
   public static final ok.a k = a(oi::g, oh.ax);
   public static final ok.a l = a(oi::g, oh.ay);
   public static final ok.a m = a(oi::g, oh.az);
   public static final ok.a n = a(oi::g, oh.aA);
   public static final ok.a o = a(oi::i, oh.aD);
   public static final ok.a p = a(oi::j, oh.aB);
   public static final ok.a q = a(oi::u, oh.aa);
   public static final ok.a r = a(oi::D, oh.aS);
   public static final ok.a s = a(oi::a, oh.ad);
   public static final ok.a t = a(oi::x, oh.bd);
   public static final ok.a u = a(oi::x, oh.be);
   public static final ok.a v = a(oi::b, oh.bk);
   public static final ok.a w = a(oi::n, oh.j);
   public static final ok.a x = a(oi::n, oh.k);
   public static final ok.a y = a(oi::r, oh.n);
   public static final ok.a z = a(oi::s, oh.j);
   private final oi A;
   private final og B;

   private ok(oi $$0, og $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public og a() {
      return this.B;
   }

   public oi b() {
      return this.A;
   }

   public ok a(Consumer<oi> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public alf a(dfa $$0, BiConsumer<alf, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public alf a(dfa $$0, String $$1, BiConsumer<alf, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static ok.a a(Function<dfa, oi> $$0, og $$1) {
      return $$2 -> new ok($$0.apply($$2), $$1);
   }

   public static ok a(alf $$0) {
      return new ok(oi.b($$0), oh.c);
   }

   @FunctionalInterface
   public interface a {
      ok get(dfa var1);

      default alf create(dfa $$0, BiConsumer<alf, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alf createWithSuffix(dfa $$0, String $$1, BiConsumer<alf, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ok.a updateTexture(Consumer<oi> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
