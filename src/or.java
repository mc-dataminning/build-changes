import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class or {
   public static final or.a a = a(op::a, oo.c);
   public static final or.a b = a(op::a, oo.d);
   public static final or.a c = a(op::a, oo.e);
   public static final or.a d = a(op::n, oo.j);
   public static final or.a e = a(op::n, oo.k);
   public static final or.a f = a(op::t, oo.n);
   public static final or.a g = a(op::o, oo.m);
   public static final or.a h = a(op::E, oo.p);
   public static final or.a i = a(op::D, oo.q);
   public static final or.a j = a(op::i, oo.ay);
   public static final or.a k = a(op::d, oo.az);
   public static final or.a l = a(op::j, oo.aA);
   public static final or.a m = a(op::j, oo.aB);
   public static final or.a n = a(op::j, oo.aC);
   public static final or.a o = a(op::j, oo.aD);
   public static final or.a p = a(op::l, oo.aG);
   public static final or.a q = a(op::m, oo.aE);
   public static final or.a r = a(op::x, oo.aa);
   public static final or.a s = a(op::G, oo.aV);
   public static final or.a t = a(op::a, oo.ad);
   public static final or.a u = a(op::A, oo.bg);
   public static final or.a v = a(op::A, oo.bh);
   public static final or.a w = a(op::b, oo.br);
   public static final or.a x = a(op::q, oo.j);
   public static final or.a y = a(op::q, oo.k);
   public static final or.a z = a(op::u, oo.n);
   public static final or.a A = a(op::v, oo.j);
   private final op B;
   private final on C;

   private or(op $$0, on $$1) {
      this.B = $$0;
      this.C = $$1;
   }

   public on a() {
      return this.C;
   }

   public op b() {
      return this.B;
   }

   public or a(Consumer<op> $$0) {
      $$0.accept(this.B);
      return this;
   }

   public alp a(dkd $$0, BiConsumer<alp, Supplier<JsonElement>> $$1) {
      return this.C.a($$0, this.B, $$1);
   }

   public alp a(dkd $$0, String $$1, BiConsumer<alp, Supplier<JsonElement>> $$2) {
      return this.C.a($$0, $$1, this.B, $$2);
   }

   private static or.a a(Function<dkd, op> $$0, on $$1) {
      return $$2 -> new or($$0.apply($$2), $$1);
   }

   public static or a(alp $$0) {
      return new or(op.b($$0), oo.c);
   }

   @FunctionalInterface
   public interface a {
      or get(dkd var1);

      default alp create(dkd $$0, BiConsumer<alp, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alp createWithSuffix(dkd $$0, String $$1, BiConsumer<alp, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default or.a updateTexture(Consumer<op> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
