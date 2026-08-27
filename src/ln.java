import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ln {
   public static final ln.a a = a(ll::a, lk.c);
   public static final ln.a b = a(ll::a, lk.d);
   public static final ln.a c = a(ll::k, lk.i);
   public static final ln.a d = a(ll::k, lk.j);
   public static final ln.a e = a(ll::q, lk.m);
   public static final ln.a f = a(ll::l, lk.l);
   public static final ln.a g = a(ll::B, lk.n);
   public static final ln.a h = a(ll::A, lk.o);
   public static final ln.a i = a(ll::f, lk.au);
   public static final ln.a j = a(ll::g, lk.av);
   public static final ln.a k = a(ll::g, lk.aw);
   public static final ln.a l = a(ll::g, lk.ax);
   public static final ln.a m = a(ll::g, lk.ay);
   public static final ln.a n = a(ll::i, lk.aB);
   public static final ln.a o = a(ll::j, lk.az);
   public static final ln.a p = a(ll::u, lk.Y);
   public static final ln.a q = a(ll::D, lk.aQ);
   public static final ln.a r = a(ll::a, lk.ab);
   public static final ln.a s = a(ll::x, lk.bb);
   public static final ln.a t = a(ll::x, lk.bc);
   public static final ln.a u = a(ll::b, lk.bi);
   public static final ln.a v = a(ll::n, lk.i);
   public static final ln.a w = a(ll::n, lk.j);
   public static final ln.a x = a(ll::r, lk.m);
   public static final ln.a y = a(ll::s, lk.i);
   private final ll z;
   private final lj A;

   private ln(ll $$0, lj $$1) {
      this.z = $$0;
      this.A = $$1;
   }

   public lj a() {
      return this.A;
   }

   public ll b() {
      return this.z;
   }

   public ln a(Consumer<ll> $$0) {
      $$0.accept(this.z);
      return this;
   }

   public aey a(csx $$0, BiConsumer<aey, Supplier<JsonElement>> $$1) {
      return this.A.a($$0, this.z, $$1);
   }

   public aey a(csx $$0, String $$1, BiConsumer<aey, Supplier<JsonElement>> $$2) {
      return this.A.a($$0, $$1, this.z, $$2);
   }

   private static ln.a a(Function<csx, ll> $$0, lj $$1) {
      return $$2 -> new ln($$0.apply($$2), $$1);
   }

   public static ln a(aey $$0) {
      return new ln(ll.b($$0), lk.c);
   }

   @FunctionalInterface
   public interface a {
      ln get(csx var1);

      default aey create(csx $$0, BiConsumer<aey, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aey createWithSuffix(csx $$0, String $$1, BiConsumer<aey, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ln.a updateTexture(Consumer<ll> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
