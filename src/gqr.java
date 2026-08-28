import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public record gqr(Map<alg, gqr.d> b, List<gqr.e> c) {
   public static final Codec<gqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alg.a, gqr.d.b).optionalFieldOf("targets", Map.of()).forGetter(gqr::a),
               gqr.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gqr::b)
            )
            .apply($$0, gqr::new)
   );

   public Map<alg, gqr.d> a() {
      return this.b;
   }

   public List<gqr.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gqr.d {
      public static final Codec<gqr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(gqr.a::a), ayu.m.fieldOf("height").forGetter(gqr.a::b)).apply($$0, gqr.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gqr.d {
      public static final Codec<gqr.b> a = Codec.unit(gqr.b::new);
   }

   public sealed interface c permits gqr.g, gqr.f {
      Codec<gqr.c> a = Codec.xor(gqr.g.b, gqr.f.b).xmap($$0 -> (gqr.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gqr.g $$3 -> Either.left($$3);
            case gqr.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alg> b();
   }

   public sealed interface d permits gqr.b, gqr.a {
      Codec<gqr.d> b = Codec.either(gqr.a.a, gqr.b.a).xmap($$0 -> (gqr.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gqr.a $$3 -> Either.left($$3);
            case gqr.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alg b, alg c, List<gqr.c> d, alg e, List<gqr.h> f) {
      private static final Codec<List<gqr.c>> g = gqr.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gqr.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gqr.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("vertex_shader").forGetter(gqr.e::b),
                  alg.a.fieldOf("fragment_shader").forGetter(gqr.e::c),
                  g.optionalFieldOf("inputs", List.of()).forGetter(gqr.e::d),
                  alg.a.fieldOf("output").forGetter(gqr.e::e),
                  gqr.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gqr.e::f)
               )
               .apply($$0, gqr.e::new)
      );

      public Stream<alg> a() {
         Stream<alg> $$0 = this.d.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.e));
      }
   }

   public static record f(String c, alg d, boolean e, boolean f) implements gqr.c {
      public static final Codec<gqr.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gqr.f::a),
                  alg.a.fieldOf("target").forGetter(gqr.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gqr.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gqr.f::e)
               )
               .apply($$0, gqr.f::new)
      );

      @Override
      public Set<alg> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alg c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alg d, int e, int f, boolean g) implements gqr.c {
      public static final Codec<gqr.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gqr.g::a),
                  alg.a.fieldOf("location").forGetter(gqr.g::c),
                  ayu.m.fieldOf("width").forGetter(gqr.g::d),
                  ayu.m.fieldOf("height").forGetter(gqr.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gqr.g::f)
               )
               .apply($$0, gqr.g::new)
      );

      @Override
      public Set<alg> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alg c() {
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

   public static record h(String b, String c, Optional<List<Float>> d) {
      public static final Codec<gqr.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(gqr.h::a),
                  Codec.STRING.fieldOf("type").forGetter(gqr.h::b),
                  Codec.FLOAT.sizeLimitedListOf(4).optionalFieldOf("values").forGetter(gqr.h::c)
               )
               .apply($$0, gqr.h::new)
      );

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public Optional<List<Float>> c() {
         return this.d;
      }
   }
}
