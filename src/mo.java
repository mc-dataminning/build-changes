import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class mo {
   public static final mo.a a = a(mm::a, ml.c);
   public static final mo.a b = a(mm::a, ml.d);
   public static final mo.a c = a(mm::k, ml.i);
   public static final mo.a d = a(mm::k, ml.j);
   public static final mo.a e = a(mm::q, ml.m);
   public static final mo.a f = a(mm::l, ml.l);
   public static final mo.a g = a(mm::B, ml.n);
   public static final mo.a h = a(mm::A, ml.o);
   public static final mo.a i = a(mm::f, ml.au);
   public static final mo.a j = a(mm::g, ml.av);
   public static final mo.a k = a(mm::g, ml.aw);
   public static final mo.a l = a(mm::g, ml.ax);
   public static final mo.a m = a(mm::g, ml.ay);
   public static final mo.a n = a(mm::i, ml.aB);
   public static final mo.a o = a(mm::j, ml.az);
   public static final mo.a p = a(mm::u, ml.Y);
   public static final mo.a q = a(mm::D, ml.aQ);
   public static final mo.a r = a(mm::a, ml.ab);
   public static final mo.a s = a(mm::x, ml.bb);
   public static final mo.a t = a(mm::x, ml.bc);
   public static final mo.a u = a(mm::b, ml.bi);
   public static final mo.a v = a(mm::n, ml.i);
   public static final mo.a w = a(mm::n, ml.j);
   public static final mo.a x = a(mm::r, ml.m);
   public static final mo.a y = a(mm::s, ml.i);
   private final mm z;
   private final mk A;

   private mo(mm $$0, mk $$1) {
      this.z = $$0;
      this.A = $$1;
   }

   public mk a() {
      return this.A;
   }

   public mm b() {
      return this.z;
   }

   public mo a(Consumer<mm> $$0) {
      $$0.accept(this.z);
      return this;
   }

   public agm a(cvf $$0, BiConsumer<agm, Supplier<JsonElement>> $$1) {
      return this.A.a($$0, this.z, $$1);
   }

   public agm a(cvf $$0, String $$1, BiConsumer<agm, Supplier<JsonElement>> $$2) {
      return this.A.a($$0, $$1, this.z, $$2);
   }

   private static mo.a a(Function<cvf, mm> $$0, mk $$1) {
      return $$2 -> new mo($$0.apply($$2), $$1);
   }

   public static mo a(agm $$0) {
      return new mo(mm.b($$0), ml.c);
   }

   @FunctionalInterface
   public interface a {
      mo get(cvf var1);

      default agm create(cvf $$0, BiConsumer<agm, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default agm createWithSuffix(cvf $$0, String $$1, BiConsumer<agm, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default mo.a updateTexture(Consumer<mm> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
