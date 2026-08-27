import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class nz {
   public static final nz.a a = a(nx::a, nw.c);
   public static final nz.a b = a(nx::a, nw.d);
   public static final nz.a c = a(nx::a, nw.e);
   public static final nz.a d = a(nx::k, nw.j);
   public static final nz.a e = a(nx::k, nw.k);
   public static final nz.a f = a(nx::q, nw.n);
   public static final nz.a g = a(nx::l, nw.m);
   public static final nz.a h = a(nx::B, nw.p);
   public static final nz.a i = a(nx::A, nw.q);
   public static final nz.a j = a(nx::f, nw.aw);
   public static final nz.a k = a(nx::g, nw.ax);
   public static final nz.a l = a(nx::g, nw.ay);
   public static final nz.a m = a(nx::g, nw.az);
   public static final nz.a n = a(nx::g, nw.aA);
   public static final nz.a o = a(nx::i, nw.aD);
   public static final nz.a p = a(nx::j, nw.aB);
   public static final nz.a q = a(nx::u, nw.aa);
   public static final nz.a r = a(nx::D, nw.aS);
   public static final nz.a s = a(nx::a, nw.ad);
   public static final nz.a t = a(nx::x, nw.bd);
   public static final nz.a u = a(nx::x, nw.be);
   public static final nz.a v = a(nx::b, nw.bk);
   public static final nz.a w = a(nx::n, nw.j);
   public static final nz.a x = a(nx::n, nw.k);
   public static final nz.a y = a(nx::r, nw.n);
   public static final nz.a z = a(nx::s, nw.j);
   private final nx A;
   private final nv B;

   private nz(nx $$0, nv $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public nv a() {
      return this.B;
   }

   public nx b() {
      return this.A;
   }

   public nz a(Consumer<nx> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akn a(dea $$0, BiConsumer<akn, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akn a(dea $$0, String $$1, BiConsumer<akn, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static nz.a a(Function<dea, nx> $$0, nv $$1) {
      return $$2 -> new nz($$0.apply($$2), $$1);
   }

   public static nz a(akn $$0) {
      return new nz(nx.b($$0), nw.c);
   }

   @FunctionalInterface
   public interface a {
      nz get(dea var1);

      default akn create(dea $$0, BiConsumer<akn, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akn createWithSuffix(dea $$0, String $$1, BiConsumer<akn, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default nz.a updateTexture(Consumer<nx> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
