import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gik {
   Codec<gik> a = gik.d.d.dispatch(gik::a, gik.d::a);
   gik b = new gik.b();

   gik.d a();

   public static record a(int d, int e, gik.a.a f) implements gik {
      public static final Codec<gik.a> c = avp.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avp.j.fieldOf("width").forGetter(gik.a::b), avp.j.fieldOf("height").forGetter(gik.a::c), gik.a.a.g.fieldOf("border").forGetter(gik.a::d)
                  )
                  .apply($$0, gik.a::new)
         ),
         gik.a::a
      );

      private static DataResult<gik.a> a(gik.a $$0) {
         gik.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gik.d a() {
         return gik.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gik.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gik.a.a> e = avp.j.flatComapMap($$0 -> new gik.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gik.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avp.i.fieldOf("left").forGetter(gik.a.a::a),
                     avp.i.fieldOf("top").forGetter(gik.a.a::b),
                     avp.i.fieldOf("right").forGetter(gik.a.a::c),
                     avp.i.fieldOf("bottom").forGetter(gik.a.a::d)
                  )
                  .apply($$0, gik.a.a::new)
         );
         static final Codec<gik.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gik.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gik {
      public static final Codec<gik.b> c = Codec.unit(gik.b::new);

      @Override
      public gik.d a() {
         return gik.d.a;
      }
   }

   public static record c(int d, int e) implements gik {
      public static final Codec<gik.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.j.fieldOf("width").forGetter(gik.c::b), avp.j.fieldOf("height").forGetter(gik.c::c)).apply($$0, gik.c::new)
      );

      @Override
      public gik.d a() {
         return gik.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements axc {
      a("stretch", gik.b.c),
      b("tile", gik.c.c),
      c("nine_slice", gik.a.c);

      public static final Codec<gik.d> d = axc.a(gik.d::values);
      private final String e;
      private final Codec<? extends gik> f;

      private d(String $$0, Codec<? extends gik> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gik> a() {
         return this.f;
      }
   }
}
