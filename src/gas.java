import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gas {
   Codec<gas> a = gas.d.d.dispatch(gas::a, gas.d::a);
   gas b = new gas.b();

   gas.d a();

   public static record a(int d, int e, gas.a.a f) implements gas {
      public static final Codec<gas.a> c = arj.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arj.j.fieldOf("width").forGetter(gas.a::b), arj.j.fieldOf("height").forGetter(gas.a::c), gas.a.a.g.fieldOf("border").forGetter(gas.a::d)
                  )
                  .apply($$0, gas.a::new)
         ),
         gas.a::a
      );

      private static DataResult<gas.a> a(gas.a $$0) {
         gas.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gas.d a() {
         return gas.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gas.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gas.a.a> e = arj.j.flatComapMap($$0 -> new gas.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gas.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arj.i.fieldOf("left").forGetter(gas.a.a::a),
                     arj.i.fieldOf("top").forGetter(gas.a.a::b),
                     arj.i.fieldOf("right").forGetter(gas.a.a::c),
                     arj.i.fieldOf("bottom").forGetter(gas.a.a::d)
                  )
                  .apply($$0, gas.a.a::new)
         );
         static final Codec<gas.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gas.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gas {
      public static final Codec<gas.b> c = Codec.unit(gas.b::new);

      @Override
      public gas.d a() {
         return gas.d.a;
      }
   }

   public static record c(int d, int e) implements gas {
      public static final Codec<gas.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arj.j.fieldOf("width").forGetter(gas.c::b), arj.j.fieldOf("height").forGetter(gas.c::c)).apply($$0, gas.c::new)
      );

      @Override
      public gas.d a() {
         return gas.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements asu {
      a("stretch", gas.b.c),
      b("tile", gas.c.c),
      c("nine_slice", gas.a.c);

      public static final Codec<gas.d> d = asu.a(gas.d::values);
      private final String e;
      private final Codec<? extends gas> f;

      private d(String $$0, Codec<? extends gas> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gas> a() {
         return this.f;
      }
   }
}
