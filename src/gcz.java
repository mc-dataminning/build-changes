import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gcz {
   Codec<gcz> a = gcz.d.d.dispatch(gcz::a, gcz.d::a);
   gcz b = new gcz.b();

   gcz.d a();

   public static record a(int d, int e, gcz.a.a f) implements gcz {
      public static final Codec<gcz.a> c = asq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asq.j.fieldOf("width").forGetter(gcz.a::b), asq.j.fieldOf("height").forGetter(gcz.a::c), gcz.a.a.g.fieldOf("border").forGetter(gcz.a::d)
                  )
                  .apply($$0, gcz.a::new)
         ),
         gcz.a::a
      );

      private static DataResult<gcz.a> a(gcz.a $$0) {
         gcz.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gcz.d a() {
         return gcz.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gcz.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gcz.a.a> e = asq.j.flatComapMap($$0 -> new gcz.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gcz.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asq.i.fieldOf("left").forGetter(gcz.a.a::a),
                     asq.i.fieldOf("top").forGetter(gcz.a.a::b),
                     asq.i.fieldOf("right").forGetter(gcz.a.a::c),
                     asq.i.fieldOf("bottom").forGetter(gcz.a.a::d)
                  )
                  .apply($$0, gcz.a.a::new)
         );
         static final Codec<gcz.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gcz.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gcz {
      public static final Codec<gcz.b> c = Codec.unit(gcz.b::new);

      @Override
      public gcz.d a() {
         return gcz.d.a;
      }
   }

   public static record c(int d, int e) implements gcz {
      public static final Codec<gcz.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(asq.j.fieldOf("width").forGetter(gcz.c::b), asq.j.fieldOf("height").forGetter(gcz.c::c)).apply($$0, gcz.c::new)
      );

      @Override
      public gcz.d a() {
         return gcz.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements aub {
      a("stretch", gcz.b.c),
      b("tile", gcz.c.c),
      c("nine_slice", gcz.a.c);

      public static final Codec<gcz.d> d = aub.a(gcz.d::values);
      private final String e;
      private final Codec<? extends gcz> f;

      private d(String $$0, Codec<? extends gcz> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gcz> a() {
         return this.f;
      }
   }
}
