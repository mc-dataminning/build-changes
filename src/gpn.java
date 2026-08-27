import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gpn {
   Codec<gpn> a = gpn.d.d.dispatch(gpn::a, gpn.d::a);
   gpn b = new gpn.b();

   gpn.d a();

   public static record a(int d, int e, gpn.a.a f) implements gpn {
      public static final MapCodec<gpn.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     axm.j.fieldOf("width").forGetter(gpn.a::b), axm.j.fieldOf("height").forGetter(gpn.a::c), gpn.a.a.g.fieldOf("border").forGetter(gpn.a::d)
                  )
                  .apply($$0, gpn.a::new)
         )
         .validate(gpn.a::a);

      private static DataResult<gpn.a> a(gpn.a $$0) {
         gpn.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gpn.d a() {
         return gpn.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gpn.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gpn.a.a> e = axm.j.flatComapMap($$0 -> new gpn.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gpn.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axm.i.fieldOf("left").forGetter(gpn.a.a::a),
                     axm.i.fieldOf("top").forGetter(gpn.a.a::b),
                     axm.i.fieldOf("right").forGetter(gpn.a.a::c),
                     axm.i.fieldOf("bottom").forGetter(gpn.a.a::d)
                  )
                  .apply($$0, gpn.a.a::new)
         );
         static final Codec<gpn.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gpn {
      public static final MapCodec<gpn.b> c = MapCodec.unit(gpn.b::new);

      @Override
      public gpn.d a() {
         return gpn.d.a;
      }
   }

   public static record c(int d, int e) implements gpn {
      public static final MapCodec<gpn.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axm.j.fieldOf("width").forGetter(gpn.c::b), axm.j.fieldOf("height").forGetter(gpn.c::c)).apply($$0, gpn.c::new)
      );

      @Override
      public gpn.d a() {
         return gpn.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ayx {
      a("stretch", gpn.b.c),
      b("tile", gpn.c.c),
      c("nine_slice", gpn.a.c);

      public static final Codec<gpn.d> d = ayx.a(gpn.d::values);
      private final String e;
      private final MapCodec<? extends gpn> f;

      private d(String $$0, MapCodec<? extends gpn> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gpn> a() {
         return this.f;
      }
   }
}
