import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class mw {
   public static final mw.a a = a(mu::a, mt.c);
   public static final mw.a b = a(mu::a, mt.d);
   public static final mw.a c = a(mu::a, mt.e);
   public static final mw.a d = a(mu::k, mt.j);
   public static final mw.a e = a(mu::k, mt.k);
   public static final mw.a f = a(mu::q, mt.n);
   public static final mw.a g = a(mu::l, mt.m);
   public static final mw.a h = a(mu::B, mt.p);
   public static final mw.a i = a(mu::A, mt.q);
   public static final mw.a j = a(mu::f, mt.aw);
   public static final mw.a k = a(mu::g, mt.ax);
   public static final mw.a l = a(mu::g, mt.ay);
   public static final mw.a m = a(mu::g, mt.az);
   public static final mw.a n = a(mu::g, mt.aA);
   public static final mw.a o = a(mu::i, mt.aD);
   public static final mw.a p = a(mu::j, mt.aB);
   public static final mw.a q = a(mu::u, mt.aa);
   public static final mw.a r = a(mu::D, mt.aS);
   public static final mw.a s = a(mu::a, mt.ad);
   public static final mw.a t = a(mu::x, mt.bd);
   public static final mw.a u = a(mu::x, mt.be);
   public static final mw.a v = a(mu::b, mt.bk);
   public static final mw.a w = a(mu::n, mt.j);
   public static final mw.a x = a(mu::n, mt.k);
   public static final mw.a y = a(mu::r, mt.n);
   public static final mw.a z = a(mu::s, mt.j);
   private final mu A;
   private final ms B;

   private mw(mu $$0, ms $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public ms a() {
      return this.B;
   }

   public mu b() {
      return this.A;
   }

   public mw a(Consumer<mu> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ajc a(czf $$0, BiConsumer<ajc, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ajc a(czf $$0, String $$1, BiConsumer<ajc, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static mw.a a(Function<czf, mu> $$0, ms $$1) {
      return $$2 -> new mw($$0.apply($$2), $$1);
   }

   public static mw a(ajc $$0) {
      return new mw(mu.b($$0), mt.c);
   }

   @FunctionalInterface
   public interface a {
      mw get(czf var1);

      default ajc create(czf $$0, BiConsumer<ajc, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ajc createWithSuffix(czf $$0, String $$1, BiConsumer<ajc, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default mw.a updateTexture(Consumer<mu> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
