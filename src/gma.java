import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public record gma(Map<aku, gma.d> b, List<gma.e> c) {
   public static final Codec<gma> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(aku.a, gma.d.b).optionalFieldOf("targets", Map.of()).forGetter(gma::a),
               gma.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gma::b)
            )
            .apply($$0, gma::new)
   );

   public Map<aku, gma.d> a() {
      return this.b;
   }

   public List<gma.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gma.d {
      public static final Codec<gma.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayh.m.fieldOf("width").forGetter(gma.a::a), ayh.m.fieldOf("height").forGetter(gma.a::b)).apply($$0, gma.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gma.d {
      public static final Codec<gma.b> a = Codec.unit(gma.b::new);
   }

   public sealed interface c permits gma.g, gma.f {
      Codec<gma.c> a = Codec.xor(gma.g.b, gma.f.b).xmap($$0 -> (gma.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gma.g $$3 -> Either.left($$3);
            case gma.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<aku> b();
   }

   public sealed interface d permits gma.b, gma.a {
      Codec<gma.d> b = Codec.either(gma.a.a, gma.b.a).xmap($$0 -> (gma.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gma.a $$3 -> Either.left($$3);
            case gma.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(aku b, List<gma.c> c, aku d, List<gma.h> e) {
      private static final Codec<List<gma.c>> f = gma.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gma.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gma.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("program").forGetter(gma.e::b),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gma.e::c),
                  aku.a.fieldOf("output").forGetter(gma.e::d),
                  gma.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gma.e::e)
               )
               .apply($$0, gma.e::new)
      );

      public gmn a() {
         return new gmn(this.b, ffq.e, gml.a);
      }
   }

   public static record f(String c, aku d, boolean e, boolean f) implements gma.c {
      public static final Codec<gma.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gma.f::a),
                  aku.a.fieldOf("target").forGetter(gma.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gma.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gma.f::e)
               )
               .apply($$0, gma.f::new)
      );

      @Override
      public Set<aku> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public aku c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, aku d, int e, int f, boolean g) implements gma.c {
      public static final Codec<gma.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gma.g::a),
                  aku.a.fieldOf("location").forGetter(gma.g::c),
                  ayh.m.fieldOf("width").forGetter(gma.g::d),
                  ayh.m.fieldOf("height").forGetter(gma.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gma.g::f)
               )
               .apply($$0, gma.g::new)
      );

      @Override
      public Set<aku> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public aku c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public int e() {
         return this.f;
      }

      public boolean f() {
         return this.g;
      }
   }

   public static record h(String b, List<Float> c) {
      public static final Codec<gma.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gma.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gma.h::b))
               .apply($$0, gma.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
