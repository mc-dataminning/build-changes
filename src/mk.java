import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class mk {
   public static final mk.a a = a(mi::a, mh.c);
   public static final mk.a b = a(mi::a, mh.d);
   public static final mk.a c = a(mi::k, mh.i);
   public static final mk.a d = a(mi::k, mh.j);
   public static final mk.a e = a(mi::q, mh.m);
   public static final mk.a f = a(mi::l, mh.l);
   public static final mk.a g = a(mi::B, mh.n);
   public static final mk.a h = a(mi::A, mh.o);
   public static final mk.a i = a(mi::f, mh.au);
   public static final mk.a j = a(mi::g, mh.av);
   public static final mk.a k = a(mi::g, mh.aw);
   public static final mk.a l = a(mi::g, mh.ax);
   public static final mk.a m = a(mi::g, mh.ay);
   public static final mk.a n = a(mi::i, mh.aB);
   public static final mk.a o = a(mi::j, mh.az);
   public static final mk.a p = a(mi::u, mh.Y);
   public static final mk.a q = a(mi::D, mh.aQ);
   public static final mk.a r = a(mi::a, mh.ab);
   public static final mk.a s = a(mi::x, mh.bb);
   public static final mk.a t = a(mi::x, mh.bc);
   public static final mk.a u = a(mi::b, mh.bi);
   public static final mk.a v = a(mi::n, mh.i);
   public static final mk.a w = a(mi::n, mh.j);
   public static final mk.a x = a(mi::r, mh.m);
   public static final mk.a y = a(mi::s, mh.i);
   private final mi z;
   private final mg A;

   private mk(mi $$0, mg $$1) {
      this.z = $$0;
      this.A = $$1;
   }

   public mg a() {
      return this.A;
   }

   public mi b() {
      return this.z;
   }

   public mk a(Consumer<mi> $$0) {
      $$0.accept(this.z);
      return this;
   }

   public agi a(cva $$0, BiConsumer<agi, Supplier<JsonElement>> $$1) {
      return this.A.a($$0, this.z, $$1);
   }

   public agi a(cva $$0, String $$1, BiConsumer<agi, Supplier<JsonElement>> $$2) {
      return this.A.a($$0, $$1, this.z, $$2);
   }

   private static mk.a a(Function<cva, mi> $$0, mg $$1) {
      return $$2 -> new mk($$0.apply($$2), $$1);
   }

   public static mk a(agi $$0) {
      return new mk(mi.b($$0), mh.c);
   }

   @FunctionalInterface
   public interface a {
      mk get(cva var1);

      default agi create(cva $$0, BiConsumer<agi, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default agi createWithSuffix(cva $$0, String $$1, BiConsumer<agi, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default mk.a updateTexture(Consumer<mi> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
