import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hko {
   Codec<hko> a = hko.d.d.dispatch(hko::a, hko.d::a);
   hko b = new hko.b();

   hko.d a();

   public static record a(int d, int e, hko.a.a f, boolean g) implements hko {
      public static final MapCodec<hko.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayu.m.fieldOf("width").forGetter(hko.a::b),
                     ayu.m.fieldOf("height").forGetter(hko.a::c),
                     hko.a.a.g.fieldOf("border").forGetter(hko.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hko.a::e)
                  )
                  .apply($$0, hko.a::new)
         )
         .validate(hko.a::a);

      private static DataResult<hko.a> a(hko.a $$0) {
         hko.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hko.d a() {
         return hko.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hko.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hko.a.a> e = ayu.m.flatComapMap($$0 -> new hko.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hko.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayu.l.fieldOf("left").forGetter(hko.a.a::a),
                     ayu.l.fieldOf("top").forGetter(hko.a.a::b),
                     ayu.l.fieldOf("right").forGetter(hko.a.a::c),
                     ayu.l.fieldOf("bottom").forGetter(hko.a.a::d)
                  )
                  .apply($$0, hko.a.a::new)
         );
         static final Codec<hko.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hko {
      public static final MapCodec<hko.b> c = MapCodec.unit(hko.b::new);

      @Override
      public hko.d a() {
         return hko.d.a;
      }
   }

   public static record c(int d, int e) implements hko {
      public static final MapCodec<hko.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(hko.c::b), ayu.m.fieldOf("height").forGetter(hko.c::c)).apply($$0, hko.c::new)
      );

      @Override
      public hko.d a() {
         return hko.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bak {
      a("stretch", hko.b.c),
      b("tile", hko.c.c),
      c("nine_slice", hko.a.c);

      public static final Codec<hko.d> d = bak.a(hko.d::values);
      private final String e;
      private final MapCodec<? extends hko> f;

      private d(final String $$0, final MapCodec<? extends hko> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hko> a() {
         return this.f;
      }
   }
}
