import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface grx {
   Codec<grx> a = grx.d.d.dispatch(grx::a, grx.d::a);
   grx b = new grx.b();

   grx.d a();

   public static record a(int d, int e, grx.a.a f) implements grx {
      public static final MapCodec<grx.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     axv.l.fieldOf("width").forGetter(grx.a::b), axv.l.fieldOf("height").forGetter(grx.a::c), grx.a.a.g.fieldOf("border").forGetter(grx.a::d)
                  )
                  .apply($$0, grx.a::new)
         )
         .validate(grx.a::a);

      private static DataResult<grx.a> a(grx.a $$0) {
         grx.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public grx.d a() {
         return grx.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public grx.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<grx.a.a> e = axv.l.flatComapMap($$0 -> new grx.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<grx.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axv.k.fieldOf("left").forGetter(grx.a.a::a),
                     axv.k.fieldOf("top").forGetter(grx.a.a::b),
                     axv.k.fieldOf("right").forGetter(grx.a.a::c),
                     axv.k.fieldOf("bottom").forGetter(grx.a.a::d)
                  )
                  .apply($$0, grx.a.a::new)
         );
         static final Codec<grx.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements grx {
      public static final MapCodec<grx.b> c = MapCodec.unit(grx.b::new);

      @Override
      public grx.d a() {
         return grx.d.a;
      }
   }

   public static record c(int d, int e) implements grx {
      public static final MapCodec<grx.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axv.l.fieldOf("width").forGetter(grx.c::b), axv.l.fieldOf("height").forGetter(grx.c::c)).apply($$0, grx.c::new)
      );

      @Override
      public grx.d a() {
         return grx.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azj {
      a("stretch", grx.b.c),
      b("tile", grx.c.c),
      c("nine_slice", grx.a.c);

      public static final Codec<grx.d> d = azj.a(grx.d::values);
      private final String e;
      private final MapCodec<? extends grx> f;

      private d(final String $$0, final MapCodec<? extends grx> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends grx> a() {
         return this.f;
      }
   }
}
