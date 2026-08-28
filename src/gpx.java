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
import java.util.stream.Stream;

public record gpx(Map<alg, gpx.d> b, List<gpx.e> c) {
   public static final Codec<gpx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alg.a, gpx.d.b).optionalFieldOf("targets", Map.of()).forGetter(gpx::a),
               gpx.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gpx::b)
            )
            .apply($$0, gpx::new)
   );

   public Map<alg, gpx.d> a() {
      return this.b;
   }

   public List<gpx.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gpx.d {
      public static final Codec<gpx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(gpx.a::a), ayu.m.fieldOf("height").forGetter(gpx.a::b)).apply($$0, gpx.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gpx.d {
      public static final Codec<gpx.b> a = Codec.unit(gpx.b::new);
   }

   public sealed interface c permits gpx.g, gpx.f {
      Codec<gpx.c> a = Codec.xor(gpx.g.b, gpx.f.b).xmap($$0 -> (gpx.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gpx.g $$3 -> Either.left($$3);
            case gpx.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alg> b();
   }

   public sealed interface d permits gpx.b, gpx.a {
      Codec<gpx.d> b = Codec.either(gpx.a.a, gpx.b.a).xmap($$0 -> (gpx.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gpx.a $$3 -> Either.left($$3);
            case gpx.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alg b, List<gpx.c> c, alg d, List<gpx.h> e) {
      private static final Codec<List<gpx.c>> f = gpx.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gpx.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gpx.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("program").forGetter(gpx.e::c),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gpx.e::d),
                  alg.a.fieldOf("output").forGetter(gpx.e::e),
                  gpx.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gpx.e::f)
               )
               .apply($$0, gpx.e::new)
      );

      public gqk a() {
         return new gqk(this.b, fja.e, gqi.a);
      }

      public Stream<alg> b() {
         Stream<alg> $$0 = this.c.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.d));
      }

      public alg c() {
         return this.b;
      }

      public List<gpx.c> d() {
         return this.c;
      }

      public alg e() {
         return this.d;
      }

      public List<gpx.h> f() {
         return this.e;
      }
   }

   public static record f(String c, alg d, boolean e, boolean f) implements gpx.c {
      public static final Codec<gpx.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gpx.f::a),
                  alg.a.fieldOf("target").forGetter(gpx.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gpx.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gpx.f::e)
               )
               .apply($$0, gpx.f::new)
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

   public static record g(String c, alg d, int e, int f, boolean g) implements gpx.c {
      public static final Codec<gpx.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gpx.g::a),
                  alg.a.fieldOf("location").forGetter(gpx.g::c),
                  ayu.m.fieldOf("width").forGetter(gpx.g::d),
                  ayu.m.fieldOf("height").forGetter(gpx.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gpx.g::f)
               )
               .apply($$0, gpx.g::new)
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

   public static record h(String b, List<Float> c) {
      public static final Codec<gpx.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gpx.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gpx.h::b))
               .apply($$0, gpx.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
