import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class nv {
   public static final nv.a a = a(nt::a, ns.c);
   public static final nv.a b = a(nt::a, ns.d);
   public static final nv.a c = a(nt::a, ns.e);
   public static final nv.a d = a(nt::k, ns.j);
   public static final nv.a e = a(nt::k, ns.k);
   public static final nv.a f = a(nt::q, ns.n);
   public static final nv.a g = a(nt::l, ns.m);
   public static final nv.a h = a(nt::B, ns.p);
   public static final nv.a i = a(nt::A, ns.q);
   public static final nv.a j = a(nt::f, ns.aw);
   public static final nv.a k = a(nt::g, ns.ax);
   public static final nv.a l = a(nt::g, ns.ay);
   public static final nv.a m = a(nt::g, ns.az);
   public static final nv.a n = a(nt::g, ns.aA);
   public static final nv.a o = a(nt::i, ns.aD);
   public static final nv.a p = a(nt::j, ns.aB);
   public static final nv.a q = a(nt::u, ns.aa);
   public static final nv.a r = a(nt::D, ns.aS);
   public static final nv.a s = a(nt::a, ns.ad);
   public static final nv.a t = a(nt::x, ns.bd);
   public static final nv.a u = a(nt::x, ns.be);
   public static final nv.a v = a(nt::b, ns.bk);
   public static final nv.a w = a(nt::n, ns.j);
   public static final nv.a x = a(nt::n, ns.k);
   public static final nv.a y = a(nt::r, ns.n);
   public static final nv.a z = a(nt::s, ns.j);
   private final nt A;
   private final nr B;

   private nv(nt $$0, nr $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public nr a() {
      return this.B;
   }

   public nt b() {
      return this.A;
   }

   public nv a(Consumer<nt> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akf a(dcv $$0, BiConsumer<akf, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akf a(dcv $$0, String $$1, BiConsumer<akf, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static nv.a a(Function<dcv, nt> $$0, nr $$1) {
      return $$2 -> new nv($$0.apply($$2), $$1);
   }

   public static nv a(akf $$0) {
      return new nv(nt.b($$0), ns.c);
   }

   @FunctionalInterface
   public interface a {
      nv get(dcv var1);

      default akf create(dcv $$0, BiConsumer<akf, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akf createWithSuffix(dcv $$0, String $$1, BiConsumer<akf, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default nv.a updateTexture(Consumer<nt> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
