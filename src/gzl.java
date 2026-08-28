import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gzl {
   Codec<gzl> a = gzl.d.d.dispatch(gzl::a, gzl.d::a);
   gzl b = new gzl.b();

   gzl.d a();

   public static record a(int d, int e, gzl.a.a f, boolean g) implements gzl {
      public static final MapCodec<gzl.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ays.m.fieldOf("width").forGetter(gzl.a::b),
                     ays.m.fieldOf("height").forGetter(gzl.a::c),
                     gzl.a.a.g.fieldOf("border").forGetter(gzl.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(gzl.a::e)
                  )
                  .apply($$0, gzl.a::new)
         )
         .validate(gzl.a::a);

      private static DataResult<gzl.a> a(gzl.a $$0) {
         gzl.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gzl.d a() {
         return gzl.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gzl.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gzl.a.a> e = ays.m.flatComapMap($$0 -> new gzl.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gzl.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ays.l.fieldOf("left").forGetter(gzl.a.a::a),
                     ays.l.fieldOf("top").forGetter(gzl.a.a::b),
                     ays.l.fieldOf("right").forGetter(gzl.a.a::c),
                     ays.l.fieldOf("bottom").forGetter(gzl.a.a::d)
                  )
                  .apply($$0, gzl.a.a::new)
         );
         static final Codec<gzl.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gzl {
      public static final MapCodec<gzl.b> c = MapCodec.unit(gzl.b::new);

      @Override
      public gzl.d a() {
         return gzl.d.a;
      }
   }

   public static record c(int d, int e) implements gzl {
      public static final MapCodec<gzl.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ays.m.fieldOf("width").forGetter(gzl.c::b), ays.m.fieldOf("height").forGetter(gzl.c::c)).apply($$0, gzl.c::new)
      );

      @Override
      public gzl.d a() {
         return gzl.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements baf {
      a("stretch", gzl.b.c),
      b("tile", gzl.c.c),
      c("nine_slice", gzl.a.c);

      public static final Codec<gzl.d> d = baf.a(gzl.d::values);
      private final String e;
      private final MapCodec<? extends gzl> f;

      private d(final String $$0, final MapCodec<? extends gzl> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gzl> a() {
         return this.f;
      }
   }
}
