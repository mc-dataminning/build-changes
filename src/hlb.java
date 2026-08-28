import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hlb {
   Codec<hlb> a = hlb.d.d.dispatch(hlb::a, hlb.d::a);
   hlb b = new hlb.b();

   hlb.d a();

   public static record a(int d, int e, hlb.a.a f, boolean g) implements hlb {
      public static final MapCodec<hlb.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayu.m.fieldOf("width").forGetter(hlb.a::b),
                     ayu.m.fieldOf("height").forGetter(hlb.a::c),
                     hlb.a.a.g.fieldOf("border").forGetter(hlb.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hlb.a::e)
                  )
                  .apply($$0, hlb.a::new)
         )
         .validate(hlb.a::a);

      private static DataResult<hlb.a> a(hlb.a $$0) {
         hlb.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hlb.d a() {
         return hlb.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hlb.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hlb.a.a> e = ayu.m.flatComapMap($$0 -> new hlb.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hlb.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayu.l.fieldOf("left").forGetter(hlb.a.a::a),
                     ayu.l.fieldOf("top").forGetter(hlb.a.a::b),
                     ayu.l.fieldOf("right").forGetter(hlb.a.a::c),
                     ayu.l.fieldOf("bottom").forGetter(hlb.a.a::d)
                  )
                  .apply($$0, hlb.a.a::new)
         );
         static final Codec<hlb.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hlb {
      public static final MapCodec<hlb.b> c = MapCodec.unit(hlb.b::new);

      @Override
      public hlb.d a() {
         return hlb.d.a;
      }
   }

   public static record c(int d, int e) implements hlb {
      public static final MapCodec<hlb.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(hlb.c::b), ayu.m.fieldOf("height").forGetter(hlb.c::c)).apply($$0, hlb.c::new)
      );

      @Override
      public hlb.d a() {
         return hlb.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bak {
      a("stretch", hlb.b.c),
      b("tile", hlb.c.c),
      c("nine_slice", hlb.a.c);

      public static final Codec<hlb.d> d = bak.a(hlb.d::values);
      private final String e;
      private final MapCodec<? extends hlb> f;

      private d(final String $$0, final MapCodec<? extends hlb> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hlb> a() {
         return this.f;
      }
   }
}
