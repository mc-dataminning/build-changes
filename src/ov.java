import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ov {
   public static final ov.a a = a(ot::a, os.c);
   public static final ov.a b = a(ot::a, os.d);
   public static final ov.a c = a(ot::a, os.e);
   public static final ov.a d = a(ot::l, os.j);
   public static final ov.a e = a(ot::l, os.k);
   public static final ov.a f = a(ot::r, os.n);
   public static final ov.a g = a(ot::m, os.m);
   public static final ov.a h = a(ot::C, os.p);
   public static final ov.a i = a(ot::B, os.q);
   public static final ov.a j = a(ot::g, os.aw);
   public static final ov.a k = a(ot::d, os.ax);
   public static final ov.a l = a(ot::h, os.ay);
   public static final ov.a m = a(ot::h, os.az);
   public static final ov.a n = a(ot::h, os.aA);
   public static final ov.a o = a(ot::h, os.aB);
   public static final ov.a p = a(ot::j, os.aE);
   public static final ov.a q = a(ot::k, os.aC);
   public static final ov.a r = a(ot::v, os.aa);
   public static final ov.a s = a(ot::E, os.aT);
   public static final ov.a t = a(ot::a, os.ad);
   public static final ov.a u = a(ot::y, os.be);
   public static final ov.a v = a(ot::y, os.bf);
   public static final ov.a w = a(ot::b, os.bp);
   public static final ov.a x = a(ot::o, os.j);
   public static final ov.a y = a(ot::o, os.k);
   public static final ov.a z = a(ot::s, os.n);
   public static final ov.a A = a(ot::t, os.j);
   private final ot B;
   private final or C;

   private ov(ot $$0, or $$1) {
      this.B = $$0;
      this.C = $$1;
   }

   public or a() {
      return this.C;
   }

   public ot b() {
      return this.B;
   }

   public ov a(Consumer<ot> $$0) {
      $$0.accept(this.B);
      return this;
   }

   public alz a(dke $$0, BiConsumer<alz, Supplier<JsonElement>> $$1) {
      return this.C.a($$0, this.B, $$1);
   }

   public alz a(dke $$0, String $$1, BiConsumer<alz, Supplier<JsonElement>> $$2) {
      return this.C.a($$0, $$1, this.B, $$2);
   }

   private static ov.a a(Function<dke, ot> $$0, or $$1) {
      return $$2 -> new ov($$0.apply($$2), $$1);
   }

   public static ov a(alz $$0) {
      return new ov(ot.b($$0), os.c);
   }

   @FunctionalInterface
   public interface a {
      ov get(dke var1);

      default alz create(dke $$0, BiConsumer<alz, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alz createWithSuffix(dke $$0, String $$1, BiConsumer<alz, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ov.a updateTexture(Consumer<ot> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
