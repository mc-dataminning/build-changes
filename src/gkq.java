import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gkq {
   Codec<gkq> a = gkq.d.d.dispatch(gkq::a, gkq.d::a);
   gkq b = new gkq.b();

   gkq.d a();

   public static record a(int d, int e, gkq.a.a f) implements gkq {
      public static final Codec<gkq.a> c = awe.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     awe.k.fieldOf("width").forGetter(gkq.a::b), awe.k.fieldOf("height").forGetter(gkq.a::c), gkq.a.a.g.fieldOf("border").forGetter(gkq.a::d)
                  )
                  .apply($$0, gkq.a::new)
         ),
         gkq.a::a
      );

      private static DataResult<gkq.a> a(gkq.a $$0) {
         gkq.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gkq.d a() {
         return gkq.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gkq.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gkq.a.a> e = awe.k.flatComapMap($$0 -> new gkq.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gkq.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     awe.j.fieldOf("left").forGetter(gkq.a.a::a),
                     awe.j.fieldOf("top").forGetter(gkq.a.a::b),
                     awe.j.fieldOf("right").forGetter(gkq.a.a::c),
                     awe.j.fieldOf("bottom").forGetter(gkq.a.a::d)
                  )
                  .apply($$0, gkq.a.a::new)
         );
         static final Codec<gkq.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gkq.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gkq {
      public static final Codec<gkq.b> c = Codec.unit(gkq.b::new);

      @Override
      public gkq.d a() {
         return gkq.d.a;
      }
   }

   public static record c(int d, int e) implements gkq {
      public static final Codec<gkq.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.k.fieldOf("width").forGetter(gkq.c::b), awe.k.fieldOf("height").forGetter(gkq.c::c)).apply($$0, gkq.c::new)
      );

      @Override
      public gkq.d a() {
         return gkq.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements axq {
      a("stretch", gkq.b.c),
      b("tile", gkq.c.c),
      c("nine_slice", gkq.a.c);

      public static final Codec<gkq.d> d = axq.a(gkq.d::values);
      private final String e;
      private final Codec<? extends gkq> f;

      private d(String $$0, Codec<? extends gkq> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gkq> a() {
         return this.f;
      }
   }
}
