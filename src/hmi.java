import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hmi {
   Codec<hmi> a = hmi.d.d.dispatch(hmi::a, hmi.d::a);
   hmi b = new hmi.b();

   hmi.d a();

   public static record a(int d, int e, hmi.a.a f, boolean g) implements hmi {
      public static final MapCodec<hmi.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     azg.m.fieldOf("width").forGetter(hmi.a::b),
                     azg.m.fieldOf("height").forGetter(hmi.a::c),
                     hmi.a.a.g.fieldOf("border").forGetter(hmi.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hmi.a::e)
                  )
                  .apply($$0, hmi.a::new)
         )
         .validate(hmi.a::a);

      private static DataResult<hmi.a> a(hmi.a $$0) {
         hmi.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hmi.d a() {
         return hmi.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hmi.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hmi.a.a> e = azg.m.flatComapMap($$0 -> new hmi.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hmi.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     azg.l.fieldOf("left").forGetter(hmi.a.a::a),
                     azg.l.fieldOf("top").forGetter(hmi.a.a::b),
                     azg.l.fieldOf("right").forGetter(hmi.a.a::c),
                     azg.l.fieldOf("bottom").forGetter(hmi.a.a::d)
                  )
                  .apply($$0, hmi.a.a::new)
         );
         static final Codec<hmi.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hmi {
      public static final MapCodec<hmi.b> c = MapCodec.unit(hmi.b::new);

      @Override
      public hmi.d a() {
         return hmi.d.a;
      }
   }

   public static record c(int d, int e) implements hmi {
      public static final MapCodec<hmi.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(azg.m.fieldOf("width").forGetter(hmi.c::b), azg.m.fieldOf("height").forGetter(hmi.c::c)).apply($$0, hmi.c::new)
      );

      @Override
      public hmi.d a() {
         return hmi.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bax {
      a("stretch", hmi.b.c),
      b("tile", hmi.c.c),
      c("nine_slice", hmi.a.c);

      public static final Codec<hmi.d> d = bax.a(hmi.d::values);
      private final String e;
      private final MapCodec<? extends hmi> f;

      private d(final String $$0, final MapCodec<? extends hmi> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hmi> a() {
         return this.f;
      }
   }
}
