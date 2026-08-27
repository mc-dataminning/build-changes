import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gjq {
   Codec<gjq> a = gjq.d.d.dispatch(gjq::a, gjq.d::a);
   gjq b = new gjq.b();

   gjq.d a();

   public static record a(int d, int e, gjq.a.a f) implements gjq {
      public static final Codec<gjq.a> c = avu.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avu.k.fieldOf("width").forGetter(gjq.a::b), avu.k.fieldOf("height").forGetter(gjq.a::c), gjq.a.a.g.fieldOf("border").forGetter(gjq.a::d)
                  )
                  .apply($$0, gjq.a::new)
         ),
         gjq.a::a
      );

      private static DataResult<gjq.a> a(gjq.a $$0) {
         gjq.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gjq.d a() {
         return gjq.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gjq.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gjq.a.a> e = avu.k.flatComapMap($$0 -> new gjq.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gjq.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avu.j.fieldOf("left").forGetter(gjq.a.a::a),
                     avu.j.fieldOf("top").forGetter(gjq.a.a::b),
                     avu.j.fieldOf("right").forGetter(gjq.a.a::c),
                     avu.j.fieldOf("bottom").forGetter(gjq.a.a::d)
                  )
                  .apply($$0, gjq.a.a::new)
         );
         static final Codec<gjq.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gjq.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gjq {
      public static final Codec<gjq.b> c = Codec.unit(gjq.b::new);

      @Override
      public gjq.d a() {
         return gjq.d.a;
      }
   }

   public static record c(int d, int e) implements gjq {
      public static final Codec<gjq.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.k.fieldOf("width").forGetter(gjq.c::b), avu.k.fieldOf("height").forGetter(gjq.c::c)).apply($$0, gjq.c::new)
      );

      @Override
      public gjq.d a() {
         return gjq.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements axg {
      a("stretch", gjq.b.c),
      b("tile", gjq.c.c),
      c("nine_slice", gjq.a.c);

      public static final Codec<gjq.d> d = axg.a(gjq.d::values);
      private final String e;
      private final Codec<? extends gjq> f;

      private d(String $$0, Codec<? extends gjq> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gjq> a() {
         return this.f;
      }
   }
}
