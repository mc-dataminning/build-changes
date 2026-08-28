import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hik {
   Codec<hik> a = hik.d.d.dispatch(hik::a, hik.d::a);
   hik b = new hik.b();

   hik.d a();

   public static record a(int d, int e, hik.a.a f, boolean g) implements hik {
      public static final MapCodec<hik.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ays.m.fieldOf("width").forGetter(hik.a::b),
                     ays.m.fieldOf("height").forGetter(hik.a::c),
                     hik.a.a.g.fieldOf("border").forGetter(hik.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hik.a::e)
                  )
                  .apply($$0, hik.a::new)
         )
         .validate(hik.a::a);

      private static DataResult<hik.a> a(hik.a $$0) {
         hik.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hik.d a() {
         return hik.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hik.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hik.a.a> e = ays.m.flatComapMap($$0 -> new hik.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hik.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ays.l.fieldOf("left").forGetter(hik.a.a::a),
                     ays.l.fieldOf("top").forGetter(hik.a.a::b),
                     ays.l.fieldOf("right").forGetter(hik.a.a::c),
                     ays.l.fieldOf("bottom").forGetter(hik.a.a::d)
                  )
                  .apply($$0, hik.a.a::new)
         );
         static final Codec<hik.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hik {
      public static final MapCodec<hik.b> c = MapCodec.unit(hik.b::new);

      @Override
      public hik.d a() {
         return hik.d.a;
      }
   }

   public static record c(int d, int e) implements hik {
      public static final MapCodec<hik.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ays.m.fieldOf("width").forGetter(hik.c::b), ays.m.fieldOf("height").forGetter(hik.c::c)).apply($$0, hik.c::new)
      );

      @Override
      public hik.d a() {
         return hik.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bag {
      a("stretch", hik.b.c),
      b("tile", hik.c.c),
      c("nine_slice", hik.a.c);

      public static final Codec<hik.d> d = bag.a(hik.d::values);
      private final String e;
      private final MapCodec<? extends hik> f;

      private d(final String $$0, final MapCodec<? extends hik> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hik> a() {
         return this.f;
      }
   }
}
