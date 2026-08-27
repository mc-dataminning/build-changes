import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gbs {
   Codec<gbs> a = gbs.d.d.dispatch(gbs::a, gbs.d::a);
   gbs b = new gbs.b();

   gbs.d a();

   public static record a(int d, int e, gbs.a.a f) implements gbs {
      public static final Codec<gbs.a> c = asg.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asg.j.fieldOf("width").forGetter(gbs.a::b), asg.j.fieldOf("height").forGetter(gbs.a::c), gbs.a.a.g.fieldOf("border").forGetter(gbs.a::d)
                  )
                  .apply($$0, gbs.a::new)
         ),
         gbs.a::a
      );

      private static DataResult<gbs.a> a(gbs.a $$0) {
         gbs.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gbs.d a() {
         return gbs.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gbs.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gbs.a.a> e = asg.j.flatComapMap($$0 -> new gbs.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gbs.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asg.i.fieldOf("left").forGetter(gbs.a.a::a),
                     asg.i.fieldOf("top").forGetter(gbs.a.a::b),
                     asg.i.fieldOf("right").forGetter(gbs.a.a::c),
                     asg.i.fieldOf("bottom").forGetter(gbs.a.a::d)
                  )
                  .apply($$0, gbs.a.a::new)
         );
         static final Codec<gbs.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gbs.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gbs {
      public static final Codec<gbs.b> c = Codec.unit(gbs.b::new);

      @Override
      public gbs.d a() {
         return gbs.d.a;
      }
   }

   public static record c(int d, int e) implements gbs {
      public static final Codec<gbs.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(asg.j.fieldOf("width").forGetter(gbs.c::b), asg.j.fieldOf("height").forGetter(gbs.c::c)).apply($$0, gbs.c::new)
      );

      @Override
      public gbs.d a() {
         return gbs.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements atr {
      a("stretch", gbs.b.c),
      b("tile", gbs.c.c),
      c("nine_slice", gbs.a.c);

      public static final Codec<gbs.d> d = atr.a(gbs.d::values);
      private final String e;
      private final Codec<? extends gbs> f;

      private d(String $$0, Codec<? extends gbs> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gbs> a() {
         return this.f;
      }
   }
}
