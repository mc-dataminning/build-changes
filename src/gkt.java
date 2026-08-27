import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gkt {
   Codec<gkt> a = gkt.d.d.dispatch(gkt::a, gkt.d::a);
   gkt b = new gkt.b();

   gkt.d a();

   public static record a(int d, int e, gkt.a.a f) implements gkt {
      public static final Codec<gkt.a> c = awe.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     awe.k.fieldOf("width").forGetter(gkt.a::b), awe.k.fieldOf("height").forGetter(gkt.a::c), gkt.a.a.g.fieldOf("border").forGetter(gkt.a::d)
                  )
                  .apply($$0, gkt.a::new)
         ),
         gkt.a::a
      );

      private static DataResult<gkt.a> a(gkt.a $$0) {
         gkt.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gkt.d a() {
         return gkt.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gkt.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gkt.a.a> e = awe.k.flatComapMap($$0 -> new gkt.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gkt.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     awe.j.fieldOf("left").forGetter(gkt.a.a::a),
                     awe.j.fieldOf("top").forGetter(gkt.a.a::b),
                     awe.j.fieldOf("right").forGetter(gkt.a.a::c),
                     awe.j.fieldOf("bottom").forGetter(gkt.a.a::d)
                  )
                  .apply($$0, gkt.a.a::new)
         );
         static final Codec<gkt.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gkt.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gkt {
      public static final Codec<gkt.b> c = Codec.unit(gkt.b::new);

      @Override
      public gkt.d a() {
         return gkt.d.a;
      }
   }

   public static record c(int d, int e) implements gkt {
      public static final Codec<gkt.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.k.fieldOf("width").forGetter(gkt.c::b), awe.k.fieldOf("height").forGetter(gkt.c::c)).apply($$0, gkt.c::new)
      );

      @Override
      public gkt.d a() {
         return gkt.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements axq {
      a("stretch", gkt.b.c),
      b("tile", gkt.c.c),
      c("nine_slice", gkt.a.c);

      public static final Codec<gkt.d> d = axq.a(gkt.d::values);
      private final String e;
      private final Codec<? extends gkt> f;

      private d(String $$0, Codec<? extends gkt> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gkt> a() {
         return this.f;
      }
   }
}
