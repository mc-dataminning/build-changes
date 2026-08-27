import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class nk {
   public static final nk.a a = a(ni::a, nh.c);
   public static final nk.a b = a(ni::a, nh.d);
   public static final nk.a c = a(ni::a, nh.e);
   public static final nk.a d = a(ni::k, nh.j);
   public static final nk.a e = a(ni::k, nh.k);
   public static final nk.a f = a(ni::q, nh.n);
   public static final nk.a g = a(ni::l, nh.m);
   public static final nk.a h = a(ni::B, nh.p);
   public static final nk.a i = a(ni::A, nh.q);
   public static final nk.a j = a(ni::f, nh.aw);
   public static final nk.a k = a(ni::g, nh.ax);
   public static final nk.a l = a(ni::g, nh.ay);
   public static final nk.a m = a(ni::g, nh.az);
   public static final nk.a n = a(ni::g, nh.aA);
   public static final nk.a o = a(ni::i, nh.aD);
   public static final nk.a p = a(ni::j, nh.aB);
   public static final nk.a q = a(ni::u, nh.aa);
   public static final nk.a r = a(ni::D, nh.aS);
   public static final nk.a s = a(ni::a, nh.ad);
   public static final nk.a t = a(ni::x, nh.bd);
   public static final nk.a u = a(ni::x, nh.be);
   public static final nk.a v = a(ni::b, nh.bk);
   public static final nk.a w = a(ni::n, nh.j);
   public static final nk.a x = a(ni::n, nh.k);
   public static final nk.a y = a(ni::r, nh.n);
   public static final nk.a z = a(ni::s, nh.j);
   private final ni A;
   private final ng B;

   private nk(ni $$0, ng $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public ng a() {
      return this.B;
   }

   public ni b() {
      return this.A;
   }

   public nk a(Consumer<ni> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ajt a(dby $$0, BiConsumer<ajt, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ajt a(dby $$0, String $$1, BiConsumer<ajt, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static nk.a a(Function<dby, ni> $$0, ng $$1) {
      return $$2 -> new nk($$0.apply($$2), $$1);
   }

   public static nk a(ajt $$0) {
      return new nk(ni.b($$0), nh.c);
   }

   @FunctionalInterface
   public interface a {
      nk get(dby var1);

      default ajt create(dby $$0, BiConsumer<ajt, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ajt createWithSuffix(dby $$0, String $$1, BiConsumer<ajt, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default nk.a updateTexture(Consumer<ni> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
