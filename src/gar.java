import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gar {
   Codec<gar> a = gar.d.d.dispatch(gar::a, gar.d::a);
   gar b = new gar.b();

   gar.d a();

   public static record a(int d, int e, gar.a.a f) implements gar {
      public static final Codec<gar.a> c = arb.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arb.j.fieldOf("width").forGetter(gar.a::b), arb.j.fieldOf("height").forGetter(gar.a::c), gar.a.a.g.fieldOf("border").forGetter(gar.a::d)
                  )
                  .apply($$0, gar.a::new)
         ),
         gar.a::a
      );

      private static DataResult<gar.a> a(gar.a $$0) {
         gar.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gar.d a() {
         return gar.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gar.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gar.a.a> e = arb.j.flatComapMap($$0 -> new gar.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gar.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arb.i.fieldOf("left").forGetter(gar.a.a::a),
                     arb.i.fieldOf("top").forGetter(gar.a.a::b),
                     arb.i.fieldOf("right").forGetter(gar.a.a::c),
                     arb.i.fieldOf("bottom").forGetter(gar.a.a::d)
                  )
                  .apply($$0, gar.a.a::new)
         );
         static final Codec<gar.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gar.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gar {
      public static final Codec<gar.b> c = Codec.unit(gar.b::new);

      @Override
      public gar.d a() {
         return gar.d.a;
      }
   }

   public static record c(int d, int e) implements gar {
      public static final Codec<gar.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arb.j.fieldOf("width").forGetter(gar.c::b), arb.j.fieldOf("height").forGetter(gar.c::c)).apply($$0, gar.c::new)
      );

      @Override
      public gar.d a() {
         return gar.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ask {
      a("stretch", gar.b.c),
      b("tile", gar.c.c),
      c("nine_slice", gar.a.c);

      public static final Codec<gar.d> d = ask.a(gar.d::values);
      private final String e;
      private final Codec<? extends gar> f;

      private d(String $$0, Codec<? extends gar> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gar> a() {
         return this.f;
      }
   }
}
