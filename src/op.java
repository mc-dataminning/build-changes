import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class op {
   public static final op.a a = a(on::a, om.c);
   public static final op.a b = a(on::a, om.d);
   public static final op.a c = a(on::a, om.e);
   public static final op.a d = a(on::k, om.j);
   public static final op.a e = a(on::k, om.k);
   public static final op.a f = a(on::q, om.n);
   public static final op.a g = a(on::l, om.m);
   public static final op.a h = a(on::B, om.p);
   public static final op.a i = a(on::A, om.q);
   public static final op.a j = a(on::f, om.aw);
   public static final op.a k = a(on::g, om.ax);
   public static final op.a l = a(on::g, om.ay);
   public static final op.a m = a(on::g, om.az);
   public static final op.a n = a(on::g, om.aA);
   public static final op.a o = a(on::i, om.aD);
   public static final op.a p = a(on::j, om.aB);
   public static final op.a q = a(on::u, om.aa);
   public static final op.a r = a(on::D, om.aS);
   public static final op.a s = a(on::a, om.ad);
   public static final op.a t = a(on::x, om.bd);
   public static final op.a u = a(on::x, om.be);
   public static final op.a v = a(on::b, om.bm);
   public static final op.a w = a(on::n, om.j);
   public static final op.a x = a(on::n, om.k);
   public static final op.a y = a(on::r, om.n);
   public static final op.a z = a(on::s, om.j);
   private final on A;
   private final ol B;

   private op(on $$0, ol $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public ol a() {
      return this.B;
   }

   public on b() {
      return this.A;
   }

   public op a(Consumer<on> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ali a(die $$0, BiConsumer<ali, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ali a(die $$0, String $$1, BiConsumer<ali, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static op.a a(Function<die, on> $$0, ol $$1) {
      return $$2 -> new op($$0.apply($$2), $$1);
   }

   public static op a(ali $$0) {
      return new op(on.b($$0), om.c);
   }

   @FunctionalInterface
   public interface a {
      op get(die var1);

      default ali create(die $$0, BiConsumer<ali, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ali createWithSuffix(die $$0, String $$1, BiConsumer<ali, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default op.a updateTexture(Consumer<on> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
