import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class mq {
   public static final mq.a a = a(mo::a, mn.c);
   public static final mq.a b = a(mo::a, mn.d);
   public static final mq.a c = a(mo::a, mn.e);
   public static final mq.a d = a(mo::k, mn.j);
   public static final mq.a e = a(mo::k, mn.k);
   public static final mq.a f = a(mo::q, mn.n);
   public static final mq.a g = a(mo::l, mn.m);
   public static final mq.a h = a(mo::B, mn.p);
   public static final mq.a i = a(mo::A, mn.q);
   public static final mq.a j = a(mo::f, mn.aw);
   public static final mq.a k = a(mo::g, mn.ax);
   public static final mq.a l = a(mo::g, mn.ay);
   public static final mq.a m = a(mo::g, mn.az);
   public static final mq.a n = a(mo::g, mn.aA);
   public static final mq.a o = a(mo::i, mn.aD);
   public static final mq.a p = a(mo::j, mn.aB);
   public static final mq.a q = a(mo::u, mn.aa);
   public static final mq.a r = a(mo::D, mn.aS);
   public static final mq.a s = a(mo::a, mn.ad);
   public static final mq.a t = a(mo::x, mn.bd);
   public static final mq.a u = a(mo::x, mn.be);
   public static final mq.a v = a(mo::b, mn.bk);
   public static final mq.a w = a(mo::n, mn.j);
   public static final mq.a x = a(mo::n, mn.k);
   public static final mq.a y = a(mo::r, mn.n);
   public static final mq.a z = a(mo::s, mn.j);
   private final mo A;
   private final mm B;

   private mq(mo $$0, mm $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public mm a() {
      return this.B;
   }

   public mo b() {
      return this.A;
   }

   public mq a(Consumer<mo> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ahd a(cwj $$0, BiConsumer<ahd, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ahd a(cwj $$0, String $$1, BiConsumer<ahd, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static mq.a a(Function<cwj, mo> $$0, mm $$1) {
      return $$2 -> new mq($$0.apply($$2), $$1);
   }

   public static mq a(ahd $$0) {
      return new mq(mo.b($$0), mn.c);
   }

   @FunctionalInterface
   public interface a {
      mq get(cwj var1);

      default ahd create(cwj $$0, BiConsumer<ahd, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ahd createWithSuffix(cwj $$0, String $$1, BiConsumer<ahd, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default mq.a updateTexture(Consumer<mo> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
