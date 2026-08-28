import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ol {
   public static final ol.a a = a(oj::a, oi.c);
   public static final ol.a b = a(oj::a, oi.d);
   public static final ol.a c = a(oj::a, oi.e);
   public static final ol.a d = a(oj::k, oi.j);
   public static final ol.a e = a(oj::k, oi.k);
   public static final ol.a f = a(oj::q, oi.n);
   public static final ol.a g = a(oj::l, oi.m);
   public static final ol.a h = a(oj::B, oi.p);
   public static final ol.a i = a(oj::A, oi.q);
   public static final ol.a j = a(oj::f, oi.aw);
   public static final ol.a k = a(oj::g, oi.ax);
   public static final ol.a l = a(oj::g, oi.ay);
   public static final ol.a m = a(oj::g, oi.az);
   public static final ol.a n = a(oj::g, oi.aA);
   public static final ol.a o = a(oj::i, oi.aD);
   public static final ol.a p = a(oj::j, oi.aB);
   public static final ol.a q = a(oj::u, oi.aa);
   public static final ol.a r = a(oj::D, oi.aS);
   public static final ol.a s = a(oj::a, oi.ad);
   public static final ol.a t = a(oj::x, oi.bd);
   public static final ol.a u = a(oj::x, oi.be);
   public static final ol.a v = a(oj::b, oi.bm);
   public static final ol.a w = a(oj::n, oi.j);
   public static final ol.a x = a(oj::n, oi.k);
   public static final ol.a y = a(oj::r, oi.n);
   public static final ol.a z = a(oj::s, oi.j);
   private final oj A;
   private final oh B;

   private ol(oj $$0, oh $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public oh a() {
      return this.B;
   }

   public oj b() {
      return this.A;
   }

   public ol a(Consumer<oj> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ale a(dhm $$0, BiConsumer<ale, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ale a(dhm $$0, String $$1, BiConsumer<ale, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static ol.a a(Function<dhm, oj> $$0, oh $$1) {
      return $$2 -> new ol($$0.apply($$2), $$1);
   }

   public static ol a(ale $$0) {
      return new ol(oj.b($$0), oi.c);
   }

   @FunctionalInterface
   public interface a {
      ol get(dhm var1);

      default ale create(dhm $$0, BiConsumer<ale, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ale createWithSuffix(dhm $$0, String $$1, BiConsumer<ale, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ol.a updateTexture(Consumer<oj> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
