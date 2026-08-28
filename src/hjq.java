import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hjq {
   Codec<hjq> a = hjq.d.d.dispatch(hjq::a, hjq.d::a);
   hjq b = new hjq.b();

   hjq.d a();

   public static record a(int d, int e, hjq.a.a f, boolean g) implements hjq {
      public static final MapCodec<hjq.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ays.m.fieldOf("width").forGetter(hjq.a::b),
                     ays.m.fieldOf("height").forGetter(hjq.a::c),
                     hjq.a.a.g.fieldOf("border").forGetter(hjq.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hjq.a::e)
                  )
                  .apply($$0, hjq.a::new)
         )
         .validate(hjq.a::a);

      private static DataResult<hjq.a> a(hjq.a $$0) {
         hjq.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hjq.d a() {
         return hjq.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hjq.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hjq.a.a> e = ays.m.flatComapMap($$0 -> new hjq.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hjq.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ays.l.fieldOf("left").forGetter(hjq.a.a::a),
                     ays.l.fieldOf("top").forGetter(hjq.a.a::b),
                     ays.l.fieldOf("right").forGetter(hjq.a.a::c),
                     ays.l.fieldOf("bottom").forGetter(hjq.a.a::d)
                  )
                  .apply($$0, hjq.a.a::new)
         );
         static final Codec<hjq.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hjq {
      public static final MapCodec<hjq.b> c = MapCodec.unit(hjq.b::new);

      @Override
      public hjq.d a() {
         return hjq.d.a;
      }
   }

   public static record c(int d, int e) implements hjq {
      public static final MapCodec<hjq.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ays.m.fieldOf("width").forGetter(hjq.c::b), ays.m.fieldOf("height").forGetter(hjq.c::c)).apply($$0, hjq.c::new)
      );

      @Override
      public hjq.d a() {
         return hjq.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bai {
      a("stretch", hjq.b.c),
      b("tile", hjq.c.c),
      c("nine_slice", hjq.a.c);

      public static final Codec<hjq.d> d = bai.a(hjq.d::values);
      private final String e;
      private final MapCodec<? extends hjq> f;

      private d(final String $$0, final MapCodec<? extends hjq> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hjq> a() {
         return this.f;
      }
   }
}
