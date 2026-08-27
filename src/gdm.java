import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gdm {
   Codec<gdm> a = gdm.d.d.dispatch(gdm::a, gdm.d::a);
   gdm b = new gdm.b();

   gdm.d a();

   public static record a(int d, int e, gdm.a.a f) implements gdm {
      public static final Codec<gdm.a> c = asu.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asu.j.fieldOf("width").forGetter(gdm.a::b), asu.j.fieldOf("height").forGetter(gdm.a::c), gdm.a.a.g.fieldOf("border").forGetter(gdm.a::d)
                  )
                  .apply($$0, gdm.a::new)
         ),
         gdm.a::a
      );

      private static DataResult<gdm.a> a(gdm.a $$0) {
         gdm.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gdm.d a() {
         return gdm.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gdm.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gdm.a.a> e = asu.j.flatComapMap($$0 -> new gdm.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gdm.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asu.i.fieldOf("left").forGetter(gdm.a.a::a),
                     asu.i.fieldOf("top").forGetter(gdm.a.a::b),
                     asu.i.fieldOf("right").forGetter(gdm.a.a::c),
                     asu.i.fieldOf("bottom").forGetter(gdm.a.a::d)
                  )
                  .apply($$0, gdm.a.a::new)
         );
         static final Codec<gdm.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gdm.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gdm {
      public static final Codec<gdm.b> c = Codec.unit(gdm.b::new);

      @Override
      public gdm.d a() {
         return gdm.d.a;
      }
   }

   public static record c(int d, int e) implements gdm {
      public static final Codec<gdm.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(asu.j.fieldOf("width").forGetter(gdm.c::b), asu.j.fieldOf("height").forGetter(gdm.c::c)).apply($$0, gdm.c::new)
      );

      @Override
      public gdm.d a() {
         return gdm.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements aug {
      a("stretch", gdm.b.c),
      b("tile", gdm.c.c),
      c("nine_slice", gdm.a.c);

      public static final Codec<gdm.d> d = aug.a(gdm.d::values);
      private final String e;
      private final Codec<? extends gdm> f;

      private d(String $$0, Codec<? extends gdm> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gdm> a() {
         return this.f;
      }
   }
}
