import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface ham {
   Codec<ham> a = ham.d.d.dispatch(ham::a, ham.d::a);
   ham b = new ham.b();

   ham.d a();

   public static record a(int d, int e, ham.a.a f, boolean g) implements ham {
      public static final MapCodec<ham.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayw.m.fieldOf("width").forGetter(ham.a::b),
                     ayw.m.fieldOf("height").forGetter(ham.a::c),
                     ham.a.a.g.fieldOf("border").forGetter(ham.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(ham.a::e)
                  )
                  .apply($$0, ham.a::new)
         )
         .validate(ham.a::a);

      private static DataResult<ham.a> a(ham.a $$0) {
         ham.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public ham.d a() {
         return ham.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public ham.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<ham.a.a> e = ayw.m.flatComapMap($$0 -> new ham.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<ham.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayw.l.fieldOf("left").forGetter(ham.a.a::a),
                     ayw.l.fieldOf("top").forGetter(ham.a.a::b),
                     ayw.l.fieldOf("right").forGetter(ham.a.a::c),
                     ayw.l.fieldOf("bottom").forGetter(ham.a.a::d)
                  )
                  .apply($$0, ham.a.a::new)
         );
         static final Codec<ham.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements ham {
      public static final MapCodec<ham.b> c = MapCodec.unit(ham.b::new);

      @Override
      public ham.d a() {
         return ham.d.a;
      }
   }

   public static record c(int d, int e) implements ham {
      public static final MapCodec<ham.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayw.m.fieldOf("width").forGetter(ham.c::b), ayw.m.fieldOf("height").forGetter(ham.c::c)).apply($$0, ham.c::new)
      );

      @Override
      public ham.d a() {
         return ham.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements baj {
      a("stretch", ham.b.c),
      b("tile", ham.c.c),
      c("nine_slice", ham.a.c);

      public static final Codec<ham.d> d = baj.a(ham.d::values);
      private final String e;
      private final MapCodec<? extends ham> f;

      private d(final String $$0, final MapCodec<? extends ham> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends ham> a() {
         return this.f;
      }
   }
}
