import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class lj {
   public static final lj.a a = a(lh::a, lg.c);
   public static final lj.a b = a(lh::a, lg.d);
   public static final lj.a c = a(lh::k, lg.i);
   public static final lj.a d = a(lh::k, lg.j);
   public static final lj.a e = a(lh::q, lg.m);
   public static final lj.a f = a(lh::l, lg.l);
   public static final lj.a g = a(lh::B, lg.n);
   public static final lj.a h = a(lh::A, lg.o);
   public static final lj.a i = a(lh::f, lg.au);
   public static final lj.a j = a(lh::g, lg.av);
   public static final lj.a k = a(lh::g, lg.aw);
   public static final lj.a l = a(lh::g, lg.ax);
   public static final lj.a m = a(lh::g, lg.ay);
   public static final lj.a n = a(lh::i, lg.aB);
   public static final lj.a o = a(lh::j, lg.az);
   public static final lj.a p = a(lh::u, lg.Y);
   public static final lj.a q = a(lh::D, lg.aQ);
   public static final lj.a r = a(lh::a, lg.ab);
   public static final lj.a s = a(lh::x, lg.bb);
   public static final lj.a t = a(lh::x, lg.bc);
   public static final lj.a u = a(lh::b, lg.bi);
   public static final lj.a v = a(lh::n, lg.i);
   public static final lj.a w = a(lh::n, lg.j);
   public static final lj.a x = a(lh::r, lg.m);
   public static final lj.a y = a(lh::s, lg.i);
   private final lh z;
   private final lf A;

   private lj(lh $$0, lf $$1) {
      this.z = $$0;
      this.A = $$1;
   }

   public lf a() {
      return this.A;
   }

   public lh b() {
      return this.z;
   }

   public lj a(Consumer<lh> $$0) {
      $$0.accept(this.z);
      return this;
   }

   public aer a(csm $$0, BiConsumer<aer, Supplier<JsonElement>> $$1) {
      return this.A.a($$0, this.z, $$1);
   }

   public aer a(csm $$0, String $$1, BiConsumer<aer, Supplier<JsonElement>> $$2) {
      return this.A.a($$0, $$1, this.z, $$2);
   }

   private static lj.a a(Function<csm, lh> $$0, lf $$1) {
      return $$2 -> new lj($$0.apply($$2), $$1);
   }

   public static lj a(aer $$0) {
      return new lj(lh.b($$0), lg.c);
   }

   @FunctionalInterface
   public interface a {
      lj get(csm var1);

      default aer create(csm $$0, BiConsumer<aer, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aer createWithSuffix(csm $$0, String $$1, BiConsumer<aer, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default lj.a updateTexture(Consumer<lh> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
