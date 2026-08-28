import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gzw {
   Codec<gzw> a = gzw.d.d.dispatch(gzw::a, gzw.d::a);
   gzw b = new gzw.b();

   gzw.d a();

   public static record a(int d, int e, gzw.a.a f, boolean g) implements gzw {
      public static final MapCodec<gzw.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayt.m.fieldOf("width").forGetter(gzw.a::b),
                     ayt.m.fieldOf("height").forGetter(gzw.a::c),
                     gzw.a.a.g.fieldOf("border").forGetter(gzw.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(gzw.a::e)
                  )
                  .apply($$0, gzw.a::new)
         )
         .validate(gzw.a::a);

      private static DataResult<gzw.a> a(gzw.a $$0) {
         gzw.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gzw.d a() {
         return gzw.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gzw.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gzw.a.a> e = ayt.m.flatComapMap($$0 -> new gzw.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gzw.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayt.l.fieldOf("left").forGetter(gzw.a.a::a),
                     ayt.l.fieldOf("top").forGetter(gzw.a.a::b),
                     ayt.l.fieldOf("right").forGetter(gzw.a.a::c),
                     ayt.l.fieldOf("bottom").forGetter(gzw.a.a::d)
                  )
                  .apply($$0, gzw.a.a::new)
         );
         static final Codec<gzw.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gzw {
      public static final MapCodec<gzw.b> c = MapCodec.unit(gzw.b::new);

      @Override
      public gzw.d a() {
         return gzw.d.a;
      }
   }

   public static record c(int d, int e) implements gzw {
      public static final MapCodec<gzw.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayt.m.fieldOf("width").forGetter(gzw.c::b), ayt.m.fieldOf("height").forGetter(gzw.c::c)).apply($$0, gzw.c::new)
      );

      @Override
      public gzw.d a() {
         return gzw.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bag {
      a("stretch", gzw.b.c),
      b("tile", gzw.c.c),
      c("nine_slice", gzw.a.c);

      public static final Codec<gzw.d> d = bag.a(gzw.d::values);
      private final String e;
      private final MapCodec<? extends gzw> f;

      private d(final String $$0, final MapCodec<? extends gzw> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gzw> a() {
         return this.f;
      }
   }
}
