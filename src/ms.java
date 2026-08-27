import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ms {
   public static final ms.a a = a(mq::a, mp.c);
   public static final ms.a b = a(mq::a, mp.d);
   public static final ms.a c = a(mq::a, mp.e);
   public static final ms.a d = a(mq::k, mp.j);
   public static final ms.a e = a(mq::k, mp.k);
   public static final ms.a f = a(mq::q, mp.n);
   public static final ms.a g = a(mq::l, mp.m);
   public static final ms.a h = a(mq::B, mp.p);
   public static final ms.a i = a(mq::A, mp.q);
   public static final ms.a j = a(mq::f, mp.aw);
   public static final ms.a k = a(mq::g, mp.ax);
   public static final ms.a l = a(mq::g, mp.ay);
   public static final ms.a m = a(mq::g, mp.az);
   public static final ms.a n = a(mq::g, mp.aA);
   public static final ms.a o = a(mq::i, mp.aD);
   public static final ms.a p = a(mq::j, mp.aB);
   public static final ms.a q = a(mq::u, mp.aa);
   public static final ms.a r = a(mq::D, mp.aS);
   public static final ms.a s = a(mq::a, mp.ad);
   public static final ms.a t = a(mq::x, mp.bd);
   public static final ms.a u = a(mq::x, mp.be);
   public static final ms.a v = a(mq::b, mp.bk);
   public static final ms.a w = a(mq::n, mp.j);
   public static final ms.a x = a(mq::n, mp.k);
   public static final ms.a y = a(mq::r, mp.n);
   public static final ms.a z = a(mq::s, mp.j);
   private final mq A;
   private final mo B;

   private ms(mq $$0, mo $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public mo a() {
      return this.B;
   }

   public mq b() {
      return this.A;
   }

   public ms a(Consumer<mq> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ahg a(cwp $$0, BiConsumer<ahg, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ahg a(cwp $$0, String $$1, BiConsumer<ahg, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static ms.a a(Function<cwp, mq> $$0, mo $$1) {
      return $$2 -> new ms($$0.apply($$2), $$1);
   }

   public static ms a(ahg $$0) {
      return new ms(mq.b($$0), mp.c);
   }

   @FunctionalInterface
   public interface a {
      ms get(cwp var1);

      default ahg create(cwp $$0, BiConsumer<ahg, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ahg createWithSuffix(cwp $$0, String $$1, BiConsumer<ahg, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ms.a updateTexture(Consumer<mq> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
