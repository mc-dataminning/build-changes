import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface ggc {
   Codec<ggc> a = ggc.d.d.dispatch(ggc::a, ggc.d::a);
   ggc b = new ggc.b();

   ggc.d a();

   public static record a(int d, int e, ggc.a.a f) implements ggc {
      public static final Codec<ggc.a> c = atv.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atv.j.fieldOf("width").forGetter(ggc.a::b), atv.j.fieldOf("height").forGetter(ggc.a::c), ggc.a.a.g.fieldOf("border").forGetter(ggc.a::d)
                  )
                  .apply($$0, ggc.a::new)
         ),
         ggc.a::a
      );

      private static DataResult<ggc.a> a(ggc.a $$0) {
         ggc.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public ggc.d a() {
         return ggc.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public ggc.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<ggc.a.a> e = atv.j.flatComapMap($$0 -> new ggc.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<ggc.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atv.i.fieldOf("left").forGetter(ggc.a.a::a),
                     atv.i.fieldOf("top").forGetter(ggc.a.a::b),
                     atv.i.fieldOf("right").forGetter(ggc.a.a::c),
                     atv.i.fieldOf("bottom").forGetter(ggc.a.a::d)
                  )
                  .apply($$0, ggc.a.a::new)
         );
         static final Codec<ggc.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (ggc.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements ggc {
      public static final Codec<ggc.b> c = Codec.unit(ggc.b::new);

      @Override
      public ggc.d a() {
         return ggc.d.a;
      }
   }

   public static record c(int d, int e) implements ggc {
      public static final Codec<ggc.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(atv.j.fieldOf("width").forGetter(ggc.c::b), atv.j.fieldOf("height").forGetter(ggc.c::c)).apply($$0, ggc.c::new)
      );

      @Override
      public ggc.d a() {
         return ggc.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements avj {
      a("stretch", ggc.b.c),
      b("tile", ggc.c.c),
      c("nine_slice", ggc.a.c);

      public static final Codec<ggc.d> d = avj.a(ggc.d::values);
      private final String e;
      private final Codec<? extends ggc> f;

      private d(String $$0, Codec<? extends ggc> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends ggc> a() {
         return this.f;
      }
   }
}
