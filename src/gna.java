import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gna {
   Codec<gna> a = gna.d.d.dispatch(gna::a, gna.d::a);
   gna b = new gna.b();

   gna.d a();

   public static record a(int d, int e, gna.a.a f) implements gna {
      public static final Codec<gna.a> c = aws.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aws.j.fieldOf("width").forGetter(gna.a::b), aws.j.fieldOf("height").forGetter(gna.a::c), gna.a.a.g.fieldOf("border").forGetter(gna.a::d)
                  )
                  .apply($$0, gna.a::new)
         ),
         gna.a::a
      );

      private static DataResult<gna.a> a(gna.a $$0) {
         gna.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gna.d a() {
         return gna.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gna.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gna.a.a> e = aws.j.flatComapMap($$0 -> new gna.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gna.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aws.i.fieldOf("left").forGetter(gna.a.a::a),
                     aws.i.fieldOf("top").forGetter(gna.a.a::b),
                     aws.i.fieldOf("right").forGetter(gna.a.a::c),
                     aws.i.fieldOf("bottom").forGetter(gna.a.a::d)
                  )
                  .apply($$0, gna.a.a::new)
         );
         static final Codec<gna.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gna.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gna {
      public static final Codec<gna.b> c = Codec.unit(gna.b::new);

      @Override
      public gna.d a() {
         return gna.d.a;
      }
   }

   public static record c(int d, int e) implements gna {
      public static final Codec<gna.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aws.j.fieldOf("width").forGetter(gna.c::b), aws.j.fieldOf("height").forGetter(gna.c::c)).apply($$0, gna.c::new)
      );

      @Override
      public gna.d a() {
         return gna.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements aye {
      a("stretch", gna.b.c),
      b("tile", gna.c.c),
      c("nine_slice", gna.a.c);

      public static final Codec<gna.d> d = aye.a(gna.d::values);
      private final String e;
      private final Codec<? extends gna> f;

      private d(String $$0, Codec<? extends gna> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gna> a() {
         return this.f;
      }
   }
}
