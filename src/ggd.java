import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface ggd {
   Codec<ggd> a = ggd.d.d.dispatch(ggd::a, ggd.d::a);
   ggd b = new ggd.b();

   ggd.d a();

   public static record a(int d, int e, ggd.a.a f) implements ggd {
      public static final Codec<ggd.a> c = atv.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atv.j.fieldOf("width").forGetter(ggd.a::b), atv.j.fieldOf("height").forGetter(ggd.a::c), ggd.a.a.g.fieldOf("border").forGetter(ggd.a::d)
                  )
                  .apply($$0, ggd.a::new)
         ),
         ggd.a::a
      );

      private static DataResult<ggd.a> a(ggd.a $$0) {
         ggd.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public ggd.d a() {
         return ggd.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public ggd.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<ggd.a.a> e = atv.j.flatComapMap($$0 -> new ggd.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<ggd.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atv.i.fieldOf("left").forGetter(ggd.a.a::a),
                     atv.i.fieldOf("top").forGetter(ggd.a.a::b),
                     atv.i.fieldOf("right").forGetter(ggd.a.a::c),
                     atv.i.fieldOf("bottom").forGetter(ggd.a.a::d)
                  )
                  .apply($$0, ggd.a.a::new)
         );
         static final Codec<ggd.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (ggd.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements ggd {
      public static final Codec<ggd.b> c = Codec.unit(ggd.b::new);

      @Override
      public ggd.d a() {
         return ggd.d.a;
      }
   }

   public static record c(int d, int e) implements ggd {
      public static final Codec<ggd.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(atv.j.fieldOf("width").forGetter(ggd.c::b), atv.j.fieldOf("height").forGetter(ggd.c::c)).apply($$0, ggd.c::new)
      );

      @Override
      public ggd.d a() {
         return ggd.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements avj {
      a("stretch", ggd.b.c),
      b("tile", ggd.c.c),
      c("nine_slice", ggd.a.c);

      public static final Codec<ggd.d> d = avj.a(ggd.d::values);
      private final String e;
      private final Codec<? extends ggd> f;

      private d(String $$0, Codec<? extends ggd> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends ggd> a() {
         return this.f;
      }
   }
}
