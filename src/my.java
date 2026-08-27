import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class my {
   public static final my.a a = a(mw::a, mv.c);
   public static final my.a b = a(mw::a, mv.d);
   public static final my.a c = a(mw::a, mv.e);
   public static final my.a d = a(mw::k, mv.j);
   public static final my.a e = a(mw::k, mv.k);
   public static final my.a f = a(mw::q, mv.n);
   public static final my.a g = a(mw::l, mv.m);
   public static final my.a h = a(mw::B, mv.p);
   public static final my.a i = a(mw::A, mv.q);
   public static final my.a j = a(mw::f, mv.aw);
   public static final my.a k = a(mw::g, mv.ax);
   public static final my.a l = a(mw::g, mv.ay);
   public static final my.a m = a(mw::g, mv.az);
   public static final my.a n = a(mw::g, mv.aA);
   public static final my.a o = a(mw::i, mv.aD);
   public static final my.a p = a(mw::j, mv.aB);
   public static final my.a q = a(mw::u, mv.aa);
   public static final my.a r = a(mw::D, mv.aS);
   public static final my.a s = a(mw::a, mv.ad);
   public static final my.a t = a(mw::x, mv.bd);
   public static final my.a u = a(mw::x, mv.be);
   public static final my.a v = a(mw::b, mv.bk);
   public static final my.a w = a(mw::n, mv.j);
   public static final my.a x = a(mw::n, mv.k);
   public static final my.a y = a(mw::r, mv.n);
   public static final my.a z = a(mw::s, mv.j);
   private final mw A;
   private final mu B;

   private my(mw $$0, mu $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public mu a() {
      return this.B;
   }

   public mw b() {
      return this.A;
   }

   public my a(Consumer<mw> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public ajh a(daa $$0, BiConsumer<ajh, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public ajh a(daa $$0, String $$1, BiConsumer<ajh, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static my.a a(Function<daa, mw> $$0, mu $$1) {
      return $$2 -> new my($$0.apply($$2), $$1);
   }

   public static my a(ajh $$0) {
      return new my(mw.b($$0), mv.c);
   }

   @FunctionalInterface
   public interface a {
      my get(daa var1);

      default ajh create(daa $$0, BiConsumer<ajh, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ajh createWithSuffix(daa $$0, String $$1, BiConsumer<ajh, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default my.a updateTexture(Consumer<mw> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
