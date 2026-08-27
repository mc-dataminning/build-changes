import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class nw {
   public static final nw.a a = a(nu::a, nt.c);
   public static final nw.a b = a(nu::a, nt.d);
   public static final nw.a c = a(nu::a, nt.e);
   public static final nw.a d = a(nu::k, nt.j);
   public static final nw.a e = a(nu::k, nt.k);
   public static final nw.a f = a(nu::q, nt.n);
   public static final nw.a g = a(nu::l, nt.m);
   public static final nw.a h = a(nu::B, nt.p);
   public static final nw.a i = a(nu::A, nt.q);
   public static final nw.a j = a(nu::f, nt.aw);
   public static final nw.a k = a(nu::g, nt.ax);
   public static final nw.a l = a(nu::g, nt.ay);
   public static final nw.a m = a(nu::g, nt.az);
   public static final nw.a n = a(nu::g, nt.aA);
   public static final nw.a o = a(nu::i, nt.aD);
   public static final nw.a p = a(nu::j, nt.aB);
   public static final nw.a q = a(nu::u, nt.aa);
   public static final nw.a r = a(nu::D, nt.aS);
   public static final nw.a s = a(nu::a, nt.ad);
   public static final nw.a t = a(nu::x, nt.bd);
   public static final nw.a u = a(nu::x, nt.be);
   public static final nw.a v = a(nu::b, nt.bk);
   public static final nw.a w = a(nu::n, nt.j);
   public static final nw.a x = a(nu::n, nt.k);
   public static final nw.a y = a(nu::r, nt.n);
   public static final nw.a z = a(nu::s, nt.j);
   private final nu A;
   private final ns B;

   private nw(nu $$0, ns $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public ns a() {
      return this.B;
   }

   public nu b() {
      return this.A;
   }

   public nw a(Consumer<nu> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akh a(dde $$0, BiConsumer<akh, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akh a(dde $$0, String $$1, BiConsumer<akh, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static nw.a a(Function<dde, nu> $$0, ns $$1) {
      return $$2 -> new nw($$0.apply($$2), $$1);
   }

   public static nw a(akh $$0) {
      return new nw(nu.b($$0), nt.c);
   }

   @FunctionalInterface
   public interface a {
      nw get(dde var1);

      default akh create(dde $$0, BiConsumer<akh, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akh createWithSuffix(dde $$0, String $$1, BiConsumer<akh, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default nw.a updateTexture(Consumer<nu> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
