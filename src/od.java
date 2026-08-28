import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class od {
   public static final od.a a = a(ob::a, oa.c);
   public static final od.a b = a(ob::a, oa.d);
   public static final od.a c = a(ob::a, oa.e);
   public static final od.a d = a(ob::k, oa.j);
   public static final od.a e = a(ob::k, oa.k);
   public static final od.a f = a(ob::q, oa.n);
   public static final od.a g = a(ob::l, oa.m);
   public static final od.a h = a(ob::B, oa.p);
   public static final od.a i = a(ob::A, oa.q);
   public static final od.a j = a(ob::f, oa.aw);
   public static final od.a k = a(ob::g, oa.ax);
   public static final od.a l = a(ob::g, oa.ay);
   public static final od.a m = a(ob::g, oa.az);
   public static final od.a n = a(ob::g, oa.aA);
   public static final od.a o = a(ob::i, oa.aD);
   public static final od.a p = a(ob::j, oa.aB);
   public static final od.a q = a(ob::u, oa.aa);
   public static final od.a r = a(ob::D, oa.aS);
   public static final od.a s = a(ob::a, oa.ad);
   public static final od.a t = a(ob::x, oa.bd);
   public static final od.a u = a(ob::x, oa.be);
   public static final od.a v = a(ob::b, oa.bk);
   public static final od.a w = a(ob::n, oa.j);
   public static final od.a x = a(ob::n, oa.k);
   public static final od.a y = a(ob::r, oa.n);
   public static final od.a z = a(ob::s, oa.j);
   private final ob A;
   private final nz B;

   private od(ob $$0, nz $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public nz a() {
      return this.B;
   }

   public ob b() {
      return this.A;
   }

   public od a(Consumer<ob> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akk a(dfh $$0, BiConsumer<akk, Supplier<JsonElement>> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akk a(dfh $$0, String $$1, BiConsumer<akk, Supplier<JsonElement>> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static od.a a(Function<dfh, ob> $$0, nz $$1) {
      return $$2 -> new od($$0.apply($$2), $$1);
   }

   public static od a(akk $$0) {
      return new od(ob.b($$0), oa.c);
   }

   @FunctionalInterface
   public interface a {
      od get(dfh var1);

      default akk create(dfh $$0, BiConsumer<akk, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akk createWithSuffix(dfh $$0, String $$1, BiConsumer<akk, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default od.a updateTexture(Consumer<ob> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
