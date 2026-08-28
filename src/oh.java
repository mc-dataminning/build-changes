import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class oh {
   public static final oh.a a = a(of::a, oe.c);
   public static final oh.a b = a(of::a, oe.d);
   public static final oh.a c = a(of::a, oe.e);
   public static final oh.a d = a(of::k, oe.j);
   public static final oh.a e = a(of::k, oe.k);
   public static final oh.a f = a(of::q, oe.n);
   public static final oh.a g = a(of::l, oe.m);
   public static final oh.a h = a(of::B, oe.p);
   public static final oh.a i = a(of::A, oe.q);
   public static final oh.a j = a(of::f, oe.aw);
   public static final oh.a k = a(of::g, oe.ax);
   public static final oh.a l = a(of::g, oe.ay);
   public static final oh.a m = a(of::g, oe.az);
   public static final oh.a n = a(of::g, oe.aA);
   public static final oh.a o = a(of::i, oe.aD);
   public static final oh.a p = a(of::j, oe.aB);
   public static final oh.a q = a(of::u, oe.aa);
   public static final oh.a r = a(of::D, oe.aS);
   public static final oh.a s = a(of::a, oe.ad);
   public static final oh.a t = a(of::x, oe.bd);
   public static final oh.a u = a(of::x, oe.be);
   public static final oh.a v = a(of::b, oe.bk);
   public static final oh.a w = a(of::n, oe.j);
   public static final oh.a x = a(of::n, oe.k);
   public static final oh.a y = a(of::r, oe.n);
   public static final oh.a z = a(of::s, oe.j);
   private final of A;
   private final od B;

   private oh(of $$0, od $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public od a() {
      return this.B;
   }

   public of b() {
      return this.A;
   }

   public oh a(Consumer<of> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akr a(dfy $$0, BiConsumer<akr, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akr a(dfy $$0, String $$1, BiConsumer<akr, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static oh.a a(Function<dfy, of> $$0, od $$1) {
      return $$2 -> new oh($$0.apply($$2), $$1);
   }

   public static oh a(akr $$0) {
      return new oh(of.b($$0), oe.c);
   }

   @FunctionalInterface
   public interface a {
      oh get(dfy var1);

      default akr create(dfy $$0, BiConsumer<akr, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akr createWithSuffix(dfy $$0, String $$1, BiConsumer<akr, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default oh.a updateTexture(Consumer<of> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
