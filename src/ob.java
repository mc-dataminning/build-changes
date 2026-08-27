import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ob {
   public static final ob.a a = a(nz::a, ny.c);
   public static final ob.a b = a(nz::a, ny.d);
   public static final ob.a c = a(nz::a, ny.e);
   public static final ob.a d = a(nz::k, ny.j);
   public static final ob.a e = a(nz::k, ny.k);
   public static final ob.a f = a(nz::q, ny.n);
   public static final ob.a g = a(nz::l, ny.m);
   public static final ob.a h = a(nz::B, ny.p);
   public static final ob.a i = a(nz::A, ny.q);
   public static final ob.a j = a(nz::f, ny.aw);
   public static final ob.a k = a(nz::g, ny.ax);
   public static final ob.a l = a(nz::g, ny.ay);
   public static final ob.a m = a(nz::g, ny.az);
   public static final ob.a n = a(nz::g, ny.aA);
   public static final ob.a o = a(nz::i, ny.aD);
   public static final ob.a p = a(nz::j, ny.aB);
   public static final ob.a q = a(nz::u, ny.aa);
   public static final ob.a r = a(nz::D, ny.aS);
   public static final ob.a s = a(nz::a, ny.ad);
   public static final ob.a t = a(nz::x, ny.bh);
   public static final ob.a u = a(nz::x, ny.bi);
   public static final ob.a v = a(nz::b, ny.bo);
   public static final ob.a w = a(nz::n, ny.j);
   public static final ob.a x = a(nz::n, ny.k);
   public static final ob.a y = a(nz::r, ny.n);
   public static final ob.a z = a(nz::s, ny.j);
   private final nz A;
   private final nx B;

   private ob(nz $$0, nx $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public nx a() {
      return this.B;
   }

   public nz b() {
      return this.A;
   }

   public ob a(Consumer<nz> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akt a(dfc $$0, BiConsumer<akt, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akt a(dfc $$0, String $$1, BiConsumer<akt, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static ob.a a(Function<dfc, nz> $$0, nx $$1) {
      return $$2 -> new ob($$0.apply($$2), $$1);
   }

   public static ob a(akt $$0) {
      return new ob(nz.b($$0), ny.c);
   }

   @FunctionalInterface
   public interface a {
      ob get(dfc var1);

      default akt create(dfc $$0, BiConsumer<akt, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akt createWithSuffix(dfc $$0, String $$1, BiConsumer<akt, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ob.a updateTexture(Consumer<nz> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
