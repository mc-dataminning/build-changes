import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class mi {
   public static final mi.a a = a(mg::a, mf.c);
   public static final mi.a b = a(mg::a, mf.d);
   public static final mi.a c = a(mg::k, mf.i);
   public static final mi.a d = a(mg::k, mf.j);
   public static final mi.a e = a(mg::q, mf.m);
   public static final mi.a f = a(mg::l, mf.l);
   public static final mi.a g = a(mg::B, mf.n);
   public static final mi.a h = a(mg::A, mf.o);
   public static final mi.a i = a(mg::f, mf.au);
   public static final mi.a j = a(mg::g, mf.av);
   public static final mi.a k = a(mg::g, mf.aw);
   public static final mi.a l = a(mg::g, mf.ax);
   public static final mi.a m = a(mg::g, mf.ay);
   public static final mi.a n = a(mg::i, mf.aB);
   public static final mi.a o = a(mg::j, mf.az);
   public static final mi.a p = a(mg::u, mf.Y);
   public static final mi.a q = a(mg::D, mf.aQ);
   public static final mi.a r = a(mg::a, mf.ab);
   public static final mi.a s = a(mg::x, mf.bb);
   public static final mi.a t = a(mg::x, mf.bc);
   public static final mi.a u = a(mg::b, mf.bi);
   public static final mi.a v = a(mg::n, mf.i);
   public static final mi.a w = a(mg::n, mf.j);
   public static final mi.a x = a(mg::r, mf.m);
   public static final mi.a y = a(mg::s, mf.i);
   private final mg z;
   private final me A;

   private mi(mg $$0, me $$1) {
      this.z = $$0;
      this.A = $$1;
   }

   public me a() {
      return this.A;
   }

   public mg b() {
      return this.z;
   }

   public mi a(Consumer<mg> $$0) {
      $$0.accept(this.z);
      return this;
   }

   public afw a(cua $$0, BiConsumer<afw, Supplier<JsonElement>> $$1) {
      return this.A.a($$0, this.z, $$1);
   }

   public afw a(cua $$0, String $$1, BiConsumer<afw, Supplier<JsonElement>> $$2) {
      return this.A.a($$0, $$1, this.z, $$2);
   }

   private static mi.a a(Function<cua, mg> $$0, me $$1) {
      return $$2 -> new mi($$0.apply($$2), $$1);
   }

   public static mi a(afw $$0) {
      return new mi(mg.b($$0), mf.c);
   }

   @FunctionalInterface
   public interface a {
      mi get(cua var1);

      default afw create(cua $$0, BiConsumer<afw, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default afw createWithSuffix(cua $$0, String $$1, BiConsumer<afw, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default mi.a updateTexture(Consumer<mg> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
