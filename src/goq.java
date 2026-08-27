import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface goq {
   Codec<goq> a = goq.d.d.dispatch(goq::a, goq.d::a);
   goq b = new goq.b();

   goq.d a();

   public static record a(int d, int e, goq.a.a f) implements goq {
      public static final Codec<goq.a> c = axh.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axh.j.fieldOf("width").forGetter(goq.a::b), axh.j.fieldOf("height").forGetter(goq.a::c), goq.a.a.g.fieldOf("border").forGetter(goq.a::d)
                  )
                  .apply($$0, goq.a::new)
         ),
         goq.a::a
      );

      private static DataResult<goq.a> a(goq.a $$0) {
         goq.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public goq.d a() {
         return goq.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public goq.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<goq.a.a> e = axh.j.flatComapMap($$0 -> new goq.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<goq.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axh.i.fieldOf("left").forGetter(goq.a.a::a),
                     axh.i.fieldOf("top").forGetter(goq.a.a::b),
                     axh.i.fieldOf("right").forGetter(goq.a.a::c),
                     axh.i.fieldOf("bottom").forGetter(goq.a.a::d)
                  )
                  .apply($$0, goq.a.a::new)
         );
         static final Codec<goq.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (goq.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements goq {
      public static final Codec<goq.b> c = Codec.unit(goq.b::new);

      @Override
      public goq.d a() {
         return goq.d.a;
      }
   }

   public static record c(int d, int e) implements goq {
      public static final Codec<goq.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.j.fieldOf("width").forGetter(goq.c::b), axh.j.fieldOf("height").forGetter(goq.c::c)).apply($$0, goq.c::new)
      );

      @Override
      public goq.d a() {
         return goq.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ayt {
      a("stretch", goq.b.c),
      b("tile", goq.c.c),
      c("nine_slice", goq.a.c);

      public static final Codec<goq.d> d = ayt.a(goq.d::values);
      private final String e;
      private final Codec<? extends goq> f;

      private d(String $$0, Codec<? extends goq> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends goq> a() {
         return this.f;
      }
   }
}
