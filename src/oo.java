import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class oo {
   public static final oo.a a = a(om::a, ol.c);
   public static final oo.a b = a(om::a, ol.d);
   public static final oo.a c = a(om::a, ol.e);
   public static final oo.a d = a(om::k, ol.j);
   public static final oo.a e = a(om::k, ol.k);
   public static final oo.a f = a(om::q, ol.n);
   public static final oo.a g = a(om::l, ol.m);
   public static final oo.a h = a(om::B, ol.p);
   public static final oo.a i = a(om::A, ol.q);
   public static final oo.a j = a(om::f, ol.aw);
   public static final oo.a k = a(om::g, ol.ax);
   public static final oo.a l = a(om::g, ol.ay);
   public static final oo.a m = a(om::g, ol.az);
   public static final oo.a n = a(om::g, ol.aA);
   public static final oo.a o = a(om::i, ol.aD);
   public static final oo.a p = a(om::j, ol.aB);
   public static final oo.a q = a(om::u, ol.aa);
   public static final oo.a r = a(om::D, ol.aS);
   public static final oo.a s = a(om::a, ol.ad);
   public static final oo.a t = a(om::x, ol.bd);
   public static final oo.a u = a(om::x, ol.be);
   public static final oo.a v = a(om::b, ol.bm);
   public static final oo.a w = a(om::n, ol.j);
   public static final oo.a x = a(om::n, ol.k);
   public static final oo.a y = a(om::r, ol.n);
   public static final oo.a z = a(om::s, ol.j);
   private final om A;
   private final ok B;

   private oo(om $$0, ok $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public ok a() {
      return this.B;
   }

   public om b() {
      return this.A;
   }

   public oo a(Consumer<om> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public alh a(dhy $$0, BiConsumer<alh, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public alh a(dhy $$0, String $$1, BiConsumer<alh, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static oo.a a(Function<dhy, om> $$0, ok $$1) {
      return $$2 -> new oo($$0.apply($$2), $$1);
   }

   public static oo a(alh $$0) {
      return new oo(om.b($$0), ol.c);
   }

   @FunctionalInterface
   public interface a {
      oo get(dhy var1);

      default alh create(dhy $$0, BiConsumer<alh, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alh createWithSuffix(dhy $$0, String $$1, BiConsumer<alh, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default oo.a updateTexture(Consumer<om> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
