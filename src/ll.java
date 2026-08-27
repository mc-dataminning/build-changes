import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ll {
   public static final ll.a a = a(lj::a, li.c);
   public static final ll.a b = a(lj::a, li.d);
   public static final ll.a c = a(lj::k, li.i);
   public static final ll.a d = a(lj::k, li.j);
   public static final ll.a e = a(lj::q, li.m);
   public static final ll.a f = a(lj::l, li.l);
   public static final ll.a g = a(lj::B, li.n);
   public static final ll.a h = a(lj::A, li.o);
   public static final ll.a i = a(lj::f, li.au);
   public static final ll.a j = a(lj::g, li.av);
   public static final ll.a k = a(lj::g, li.aw);
   public static final ll.a l = a(lj::g, li.ax);
   public static final ll.a m = a(lj::g, li.ay);
   public static final ll.a n = a(lj::i, li.aB);
   public static final ll.a o = a(lj::j, li.az);
   public static final ll.a p = a(lj::u, li.Y);
   public static final ll.a q = a(lj::D, li.aQ);
   public static final ll.a r = a(lj::a, li.ab);
   public static final ll.a s = a(lj::x, li.bb);
   public static final ll.a t = a(lj::x, li.bc);
   public static final ll.a u = a(lj::b, li.bi);
   public static final ll.a v = a(lj::n, li.i);
   public static final ll.a w = a(lj::n, li.j);
   public static final ll.a x = a(lj::r, li.m);
   public static final ll.a y = a(lj::s, li.i);
   private final lj z;
   private final lh A;

   private ll(lj $$0, lh $$1) {
      this.z = $$0;
      this.A = $$1;
   }

   public lh a() {
      return this.A;
   }

   public lj b() {
      return this.z;
   }

   public ll a(Consumer<lj> $$0) {
      $$0.accept(this.z);
      return this;
   }

   public aew a(csv $$0, BiConsumer<aew, Supplier<JsonElement>> $$1) {
      return this.A.a($$0, this.z, $$1);
   }

   public aew a(csv $$0, String $$1, BiConsumer<aew, Supplier<JsonElement>> $$2) {
      return this.A.a($$0, $$1, this.z, $$2);
   }

   private static ll.a a(Function<csv, lj> $$0, lh $$1) {
      return $$2 -> new ll($$0.apply($$2), $$1);
   }

   public static ll a(aew $$0) {
      return new ll(lj.b($$0), li.c);
   }

   @FunctionalInterface
   public interface a {
      ll get(csv var1);

      default aew create(csv $$0, BiConsumer<aew, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aew createWithSuffix(csv $$0, String $$1, BiConsumer<aew, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ll.a updateTexture(Consumer<lj> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
