import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class mo {
   public static final mo.a a = a(mm::a, ml.c);
   public static final mo.a b = a(mm::a, ml.d);
   public static final mo.a c = a(mm::a, ml.e);
   public static final mo.a d = a(mm::k, ml.j);
   public static final mo.a e = a(mm::k, ml.k);
   public static final mo.a f = a(mm::q, ml.n);
   public static final mo.a g = a(mm::l, ml.m);
   public static final mo.a h = a(mm::B, ml.p);
   public static final mo.a i = a(mm::A, ml.q);
   public static final mo.a j = a(mm::f, ml.aw);
   public static final mo.a k = a(mm::g, ml.ax);
   public static final mo.a l = a(mm::g, ml.ay);
   public static final mo.a m = a(mm::g, ml.az);
   public static final mo.a n = a(mm::g, ml.aA);
   public static final mo.a o = a(mm::i, ml.aD);
   public static final mo.a p = a(mm::j, ml.aB);
   public static final mo.a q = a(mm::u, ml.aa);
   public static final mo.a r = a(mm::D, ml.aS);
   public static final mo.a s = a(mm::a, ml.ad);
   public static final mo.a t = a(mm::x, ml.bd);
   public static final mo.a u = a(mm::x, ml.be);
   public static final mo.a v = a(mm::b, ml.bk);
   public static final mo.a w = a(mm::n, ml.j);
   public static final mo.a x = a(mm::n, ml.k);
   public static final mo.a y = a(mm::r, ml.n);
   public static final mo.a z = a(mm::s, ml.j);
   private final mm A;
   private final mk B;

   private mo(mm $$0, mk $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public mk a() {
      return this.B;
   }

   public mm b() {
      return this.A;
   }

   public mo a(Consumer<mm> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public agt a(cvz $$0, BiConsumer<agt, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public agt a(cvz $$0, String $$1, BiConsumer<agt, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static mo.a a(Function<cvz, mm> $$0, mk $$1) {
      return $$2 -> new mo($$0.apply($$2), $$1);
   }

   public static mo a(agt $$0) {
      return new mo(mm.b($$0), ml.c);
   }

   @FunctionalInterface
   public interface a {
      mo get(cvz var1);

      default agt create(cvz $$0, BiConsumer<agt, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default agt createWithSuffix(cvz $$0, String $$1, BiConsumer<agt, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default mo.a updateTexture(Consumer<mm> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
