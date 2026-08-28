import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class og {
   public static final og.a a = a(oe::a, od.c);
   public static final og.a b = a(oe::a, od.d);
   public static final og.a c = a(oe::a, od.e);
   public static final og.a d = a(oe::k, od.j);
   public static final og.a e = a(oe::k, od.k);
   public static final og.a f = a(oe::q, od.n);
   public static final og.a g = a(oe::l, od.m);
   public static final og.a h = a(oe::B, od.p);
   public static final og.a i = a(oe::A, od.q);
   public static final og.a j = a(oe::f, od.aw);
   public static final og.a k = a(oe::g, od.ax);
   public static final og.a l = a(oe::g, od.ay);
   public static final og.a m = a(oe::g, od.az);
   public static final og.a n = a(oe::g, od.aA);
   public static final og.a o = a(oe::i, od.aD);
   public static final og.a p = a(oe::j, od.aB);
   public static final og.a q = a(oe::u, od.aa);
   public static final og.a r = a(oe::D, od.aS);
   public static final og.a s = a(oe::a, od.ad);
   public static final og.a t = a(oe::x, od.bd);
   public static final og.a u = a(oe::x, od.be);
   public static final og.a v = a(oe::b, od.bk);
   public static final og.a w = a(oe::n, od.j);
   public static final og.a x = a(oe::n, od.k);
   public static final og.a y = a(oe::r, od.n);
   public static final og.a z = a(oe::s, od.j);
   private final oe A;
   private final oc B;

   private og(oe $$0, oc $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public oc a() {
      return this.B;
   }

   public oe b() {
      return this.A;
   }

   public og a(Consumer<oe> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akq a(dfw $$0, BiConsumer<akq, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akq a(dfw $$0, String $$1, BiConsumer<akq, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static og.a a(Function<dfw, oe> $$0, oc $$1) {
      return $$2 -> new og($$0.apply($$2), $$1);
   }

   public static og a(akq $$0) {
      return new og(oe.b($$0), od.c);
   }

   @FunctionalInterface
   public interface a {
      og get(dfw var1);

      default akq create(dfw $$0, BiConsumer<akq, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akq createWithSuffix(dfw $$0, String $$1, BiConsumer<akq, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default og.a updateTexture(Consumer<oe> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
