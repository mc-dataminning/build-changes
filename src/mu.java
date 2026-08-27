import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class mu {
   public static final mu.a a = a(ms::a, mr.c);
   public static final mu.a b = a(ms::a, mr.d);
   public static final mu.a c = a(ms::a, mr.e);
   public static final mu.a d = a(ms::k, mr.j);
   public static final mu.a e = a(ms::k, mr.k);
   public static final mu.a f = a(ms::q, mr.n);
   public static final mu.a g = a(ms::l, mr.m);
   public static final mu.a h = a(ms::B, mr.p);
   public static final mu.a i = a(ms::A, mr.q);
   public static final mu.a j = a(ms::f, mr.aw);
   public static final mu.a k = a(ms::g, mr.ax);
   public static final mu.a l = a(ms::g, mr.ay);
   public static final mu.a m = a(ms::g, mr.az);
   public static final mu.a n = a(ms::g, mr.aA);
   public static final mu.a o = a(ms::i, mr.aD);
   public static final mu.a p = a(ms::j, mr.aB);
   public static final mu.a q = a(ms::u, mr.aa);
   public static final mu.a r = a(ms::D, mr.aS);
   public static final mu.a s = a(ms::a, mr.ad);
   public static final mu.a t = a(ms::x, mr.bd);
   public static final mu.a u = a(ms::x, mr.be);
   public static final mu.a v = a(ms::b, mr.bk);
   public static final mu.a w = a(ms::n, mr.j);
   public static final mu.a x = a(ms::n, mr.k);
   public static final mu.a y = a(ms::r, mr.n);
   public static final mu.a z = a(ms::s, mr.j);
   private final ms A;
   private final mq B;

   private mu(ms $$0, mq $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public mq a() {
      return this.B;
   }

   public ms b() {
      return this.A;
   }

   public mu a(Consumer<ms> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public aiy a(cys $$0, BiConsumer<aiy, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public aiy a(cys $$0, String $$1, BiConsumer<aiy, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static mu.a a(Function<cys, ms> $$0, mq $$1) {
      return $$2 -> new mu($$0.apply($$2), $$1);
   }

   public static mu a(aiy $$0) {
      return new mu(ms.b($$0), mr.c);
   }

   @FunctionalInterface
   public interface a {
      mu get(cys var1);

      default aiy create(cys $$0, BiConsumer<aiy, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aiy createWithSuffix(cys $$0, String $$1, BiConsumer<aiy, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default mu.a updateTexture(Consumer<ms> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
