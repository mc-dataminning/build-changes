import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gdr {
   Codec<gdr> a = gdr.d.d.dispatch(gdr::a, gdr.d::a);
   gdr b = new gdr.b();

   gdr.d a();

   public static record a(int d, int e, gdr.a.a f) implements gdr {
      public static final Codec<gdr.a> c = asy.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asy.j.fieldOf("width").forGetter(gdr.a::b), asy.j.fieldOf("height").forGetter(gdr.a::c), gdr.a.a.g.fieldOf("border").forGetter(gdr.a::d)
                  )
                  .apply($$0, gdr.a::new)
         ),
         gdr.a::a
      );

      private static DataResult<gdr.a> a(gdr.a $$0) {
         gdr.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gdr.d a() {
         return gdr.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gdr.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gdr.a.a> e = asy.j.flatComapMap($$0 -> new gdr.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gdr.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asy.i.fieldOf("left").forGetter(gdr.a.a::a),
                     asy.i.fieldOf("top").forGetter(gdr.a.a::b),
                     asy.i.fieldOf("right").forGetter(gdr.a.a::c),
                     asy.i.fieldOf("bottom").forGetter(gdr.a.a::d)
                  )
                  .apply($$0, gdr.a.a::new)
         );
         static final Codec<gdr.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gdr.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gdr {
      public static final Codec<gdr.b> c = Codec.unit(gdr.b::new);

      @Override
      public gdr.d a() {
         return gdr.d.a;
      }
   }

   public static record c(int d, int e) implements gdr {
      public static final Codec<gdr.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(asy.j.fieldOf("width").forGetter(gdr.c::b), asy.j.fieldOf("height").forGetter(gdr.c::c)).apply($$0, gdr.c::new)
      );

      @Override
      public gdr.d a() {
         return gdr.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements auk {
      a("stretch", gdr.b.c),
      b("tile", gdr.c.c),
      c("nine_slice", gdr.a.c);

      public static final Codec<gdr.d> d = auk.a(gdr.d::values);
      private final String e;
      private final Codec<? extends gdr> f;

      private d(String $$0, Codec<? extends gdr> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gdr> a() {
         return this.f;
      }
   }
}
