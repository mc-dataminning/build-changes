import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface ggs {
   Codec<ggs> a = ggs.d.d.dispatch(ggs::a, ggs.d::a);
   ggs b = new ggs.b();

   ggs.d a();

   public static record a(int d, int e, ggs.a.a f) implements ggs {
      public static final Codec<ggs.a> c = atx.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atx.j.fieldOf("width").forGetter(ggs.a::b), atx.j.fieldOf("height").forGetter(ggs.a::c), ggs.a.a.g.fieldOf("border").forGetter(ggs.a::d)
                  )
                  .apply($$0, ggs.a::new)
         ),
         ggs.a::a
      );

      private static DataResult<ggs.a> a(ggs.a $$0) {
         ggs.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public ggs.d a() {
         return ggs.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public ggs.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<ggs.a.a> e = atx.j.flatComapMap($$0 -> new ggs.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<ggs.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atx.i.fieldOf("left").forGetter(ggs.a.a::a),
                     atx.i.fieldOf("top").forGetter(ggs.a.a::b),
                     atx.i.fieldOf("right").forGetter(ggs.a.a::c),
                     atx.i.fieldOf("bottom").forGetter(ggs.a.a::d)
                  )
                  .apply($$0, ggs.a.a::new)
         );
         static final Codec<ggs.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (ggs.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements ggs {
      public static final Codec<ggs.b> c = Codec.unit(ggs.b::new);

      @Override
      public ggs.d a() {
         return ggs.d.a;
      }
   }

   public static record c(int d, int e) implements ggs {
      public static final Codec<ggs.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(atx.j.fieldOf("width").forGetter(ggs.c::b), atx.j.fieldOf("height").forGetter(ggs.c::c)).apply($$0, ggs.c::new)
      );

      @Override
      public ggs.d a() {
         return ggs.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements avl {
      a("stretch", ggs.b.c),
      b("tile", ggs.c.c),
      c("nine_slice", ggs.a.c);

      public static final Codec<ggs.d> d = avl.a(ggs.d::values);
      private final String e;
      private final Codec<? extends ggs> f;

      private d(String $$0, Codec<? extends ggs> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends ggs> a() {
         return this.f;
      }
   }
}
