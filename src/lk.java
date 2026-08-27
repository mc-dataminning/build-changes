import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class lk {
   public static final lk.a a = a(li::a, lh.c);
   public static final lk.a b = a(li::a, lh.d);
   public static final lk.a c = a(li::k, lh.i);
   public static final lk.a d = a(li::k, lh.j);
   public static final lk.a e = a(li::q, lh.m);
   public static final lk.a f = a(li::l, lh.l);
   public static final lk.a g = a(li::B, lh.n);
   public static final lk.a h = a(li::A, lh.o);
   public static final lk.a i = a(li::f, lh.au);
   public static final lk.a j = a(li::g, lh.av);
   public static final lk.a k = a(li::g, lh.aw);
   public static final lk.a l = a(li::g, lh.ax);
   public static final lk.a m = a(li::g, lh.ay);
   public static final lk.a n = a(li::i, lh.aB);
   public static final lk.a o = a(li::j, lh.az);
   public static final lk.a p = a(li::u, lh.Y);
   public static final lk.a q = a(li::D, lh.aQ);
   public static final lk.a r = a(li::a, lh.ab);
   public static final lk.a s = a(li::x, lh.bb);
   public static final lk.a t = a(li::x, lh.bc);
   public static final lk.a u = a(li::b, lh.bi);
   public static final lk.a v = a(li::n, lh.i);
   public static final lk.a w = a(li::n, lh.j);
   public static final lk.a x = a(li::r, lh.m);
   public static final lk.a y = a(li::s, lh.i);
   private final li z;
   private final lg A;

   private lk(li $$0, lg $$1) {
      this.z = $$0;
      this.A = $$1;
   }

   public lg a() {
      return this.A;
   }

   public li b() {
      return this.z;
   }

   public lk a(Consumer<li> $$0) {
      $$0.accept(this.z);
      return this;
   }

   public aep a(csk $$0, BiConsumer<aep, Supplier<JsonElement>> $$1) {
      return this.A.a($$0, this.z, $$1);
   }

   public aep a(csk $$0, String $$1, BiConsumer<aep, Supplier<JsonElement>> $$2) {
      return this.A.a($$0, $$1, this.z, $$2);
   }

   private static lk.a a(Function<csk, li> $$0, lg $$1) {
      return $$2 -> new lk($$0.apply($$2), $$1);
   }

   public static lk a(aep $$0) {
      return new lk(li.b($$0), lh.c);
   }

   @FunctionalInterface
   public interface a {
      lk get(csk var1);

      default aep create(csk $$0, BiConsumer<aep, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aep createWithSuffix(csk $$0, String $$1, BiConsumer<aep, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default lk.a updateTexture(Consumer<li> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
