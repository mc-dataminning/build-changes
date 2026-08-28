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

public record gpi(Map<ale, gpi.d> b, List<gpi.e> c) {
   public static final Codec<gpi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(ale.a, gpi.d.b).optionalFieldOf("targets", Map.of()).forGetter(gpi::a),
               gpi.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gpi::b)
            )
            .apply($$0, gpi::new)
   );

   public Map<ale, gpi.d> a() {
      return this.b;
   }

   public List<gpi.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gpi.d {
      public static final Codec<gpi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ays.m.fieldOf("width").forGetter(gpi.a::a), ays.m.fieldOf("height").forGetter(gpi.a::b)).apply($$0, gpi.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gpi.d {
      public static final Codec<gpi.b> a = Codec.unit(gpi.b::new);
   }

   public sealed interface c permits gpi.g, gpi.f {
      Codec<gpi.c> a = Codec.xor(gpi.g.b, gpi.f.b).xmap($$0 -> (gpi.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gpi.g $$3 -> Either.left($$3);
            case gpi.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<ale> b();
   }

   public sealed interface d permits gpi.b, gpi.a {
      Codec<gpi.d> b = Codec.either(gpi.a.a, gpi.b.a).xmap($$0 -> (gpi.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gpi.a $$3 -> Either.left($$3);
            case gpi.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(ale b, List<gpi.c> c, ale d, List<gpi.h> e) {
      private static final Codec<List<gpi.c>> f = gpi.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gpi.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gpi.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("program").forGetter(gpi.e::c),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gpi.e::d),
                  ale.a.fieldOf("output").forGetter(gpi.e::e),
                  gpi.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gpi.e::f)
               )
               .apply($$0, gpi.e::new)
      );

      public gpv a() {
         return new gpv(this.b, fio.e, gpt.a);
      }

      public Stream<ale> b() {
         Stream<ale> $$0 = this.c.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.d));
      }

      public ale c() {
         return this.b;
      }

      public List<gpi.c> d() {
         return this.c;
      }

      public ale e() {
         return this.d;
      }

      public List<gpi.h> f() {
         return this.e;
      }
   }

   public static record f(String c, ale d, boolean e, boolean f) implements gpi.c {
      public static final Codec<gpi.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gpi.f::a),
                  ale.a.fieldOf("target").forGetter(gpi.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gpi.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gpi.f::e)
               )
               .apply($$0, gpi.f::new)
      );

      @Override
      public Set<ale> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public ale c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, ale d, int e, int f, boolean g) implements gpi.c {
      public static final Codec<gpi.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gpi.g::a),
                  ale.a.fieldOf("location").forGetter(gpi.g::c),
                  ays.m.fieldOf("width").forGetter(gpi.g::d),
                  ays.m.fieldOf("height").forGetter(gpi.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gpi.g::f)
               )
               .apply($$0, gpi.g::new)
      );

      @Override
      public Set<ale> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public ale c() {
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
      public static final Codec<gpi.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gpi.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gpi.h::b))
               .apply($$0, gpi.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
