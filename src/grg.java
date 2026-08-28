import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface grg {
   Codec<grg> a = grg.d.d.dispatch(grg::a, grg.d::a);
   grg b = new grg.b();

   grg.d a();

   public static record a(int d, int e, grg.a.a f) implements grg {
      public static final MapCodec<grg.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     axo.l.fieldOf("width").forGetter(grg.a::b), axo.l.fieldOf("height").forGetter(grg.a::c), grg.a.a.g.fieldOf("border").forGetter(grg.a::d)
                  )
                  .apply($$0, grg.a::new)
         )
         .validate(grg.a::a);

      private static DataResult<grg.a> a(grg.a $$0) {
         grg.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public grg.d a() {
         return grg.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public grg.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<grg.a.a> e = axo.l.flatComapMap($$0 -> new grg.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<grg.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axo.k.fieldOf("left").forGetter(grg.a.a::a),
                     axo.k.fieldOf("top").forGetter(grg.a.a::b),
                     axo.k.fieldOf("right").forGetter(grg.a.a::c),
                     axo.k.fieldOf("bottom").forGetter(grg.a.a::d)
                  )
                  .apply($$0, grg.a.a::new)
         );
         static final Codec<grg.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements grg {
      public static final MapCodec<grg.b> c = MapCodec.unit(grg.b::new);

      @Override
      public grg.d a() {
         return grg.d.a;
      }
   }

   public static record c(int d, int e) implements grg {
      public static final MapCodec<grg.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axo.l.fieldOf("width").forGetter(grg.c::b), axo.l.fieldOf("height").forGetter(grg.c::c)).apply($$0, grg.c::new)
      );

      @Override
      public grg.d a() {
         return grg.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azc {
      a("stretch", grg.b.c),
      b("tile", grg.c.c),
      c("nine_slice", grg.a.c);

      public static final Codec<grg.d> d = azc.a(grg.d::values);
      private final String e;
      private final MapCodec<? extends grg> f;

      private d(final String $$0, final MapCodec<? extends grg> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends grg> a() {
         return this.f;
      }
   }
}
