import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hhj {
   Codec<hhj> a = hhj.d.d.dispatch(hhj::a, hhj.d::a);
   hhj b = new hhj.b();

   hhj.d a();

   public static record a(int d, int e, hhj.a.a f, boolean g) implements hhj {
      public static final MapCodec<hhj.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayi.m.fieldOf("width").forGetter(hhj.a::b),
                     ayi.m.fieldOf("height").forGetter(hhj.a::c),
                     hhj.a.a.g.fieldOf("border").forGetter(hhj.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hhj.a::e)
                  )
                  .apply($$0, hhj.a::new)
         )
         .validate(hhj.a::a);

      private static DataResult<hhj.a> a(hhj.a $$0) {
         hhj.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hhj.d a() {
         return hhj.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hhj.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hhj.a.a> e = ayi.m.flatComapMap($$0 -> new hhj.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hhj.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayi.l.fieldOf("left").forGetter(hhj.a.a::a),
                     ayi.l.fieldOf("top").forGetter(hhj.a.a::b),
                     ayi.l.fieldOf("right").forGetter(hhj.a.a::c),
                     ayi.l.fieldOf("bottom").forGetter(hhj.a.a::d)
                  )
                  .apply($$0, hhj.a.a::new)
         );
         static final Codec<hhj.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hhj {
      public static final MapCodec<hhj.b> c = MapCodec.unit(hhj.b::new);

      @Override
      public hhj.d a() {
         return hhj.d.a;
      }
   }

   public static record c(int d, int e) implements hhj {
      public static final MapCodec<hhj.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(hhj.c::b), ayi.m.fieldOf("height").forGetter(hhj.c::c)).apply($$0, hhj.c::new)
      );

      @Override
      public hhj.d a() {
         return hhj.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azv {
      a("stretch", hhj.b.c),
      b("tile", hhj.c.c),
      c("nine_slice", hhj.a.c);

      public static final Codec<hhj.d> d = azv.a(hhj.d::values);
      private final String e;
      private final MapCodec<? extends hhj> f;

      private d(final String $$0, final MapCodec<? extends hhj> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hhj> a() {
         return this.f;
      }
   }
}
