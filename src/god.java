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

public record god(Map<ald, god.d> b, List<god.e> c) {
   public static final Codec<god> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(ald.a, god.d.b).optionalFieldOf("targets", Map.of()).forGetter(god::a),
               god.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(god::b)
            )
            .apply($$0, god::new)
   );

   public Map<ald, god.d> a() {
      return this.b;
   }

   public List<god.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements god.d {
      public static final Codec<god.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ays.m.fieldOf("width").forGetter(god.a::a), ays.m.fieldOf("height").forGetter(god.a::b)).apply($$0, god.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements god.d {
      public static final Codec<god.b> a = Codec.unit(god.b::new);
   }

   public sealed interface c permits god.g, god.f {
      Codec<god.c> a = Codec.xor(god.g.b, god.f.b).xmap($$0 -> (god.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case god.g $$3 -> Either.left($$3);
            case god.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<ald> b();
   }

   public sealed interface d permits god.b, god.a {
      Codec<god.d> b = Codec.either(god.a.a, god.b.a).xmap($$0 -> (god.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case god.a $$3 -> Either.left($$3);
            case god.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(ald b, List<god.c> c, ald d, List<god.h> e) {
      private static final Codec<List<god.c>> f = god.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (god.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<god.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a.fieldOf("program").forGetter(god.e::c),
                  f.optionalFieldOf("inputs", List.of()).forGetter(god.e::d),
                  ald.a.fieldOf("output").forGetter(god.e::e),
                  god.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(god.e::f)
               )
               .apply($$0, god.e::new)
      );

      public goq a() {
         return new goq(this.b, fhm.e, goo.a);
      }

      public Stream<ald> b() {
         Stream<ald> $$0 = this.c.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.d));
      }

      public ald c() {
         return this.b;
      }

      public List<god.c> d() {
         return this.c;
      }

      public ald e() {
         return this.d;
      }

      public List<god.h> f() {
         return this.e;
      }
   }

   public static record f(String c, ald d, boolean e, boolean f) implements god.c {
      public static final Codec<god.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(god.f::a),
                  ald.a.fieldOf("target").forGetter(god.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(god.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(god.f::e)
               )
               .apply($$0, god.f::new)
      );

      @Override
      public Set<ald> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public ald c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, ald d, int e, int f, boolean g) implements god.c {
      public static final Codec<god.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(god.g::a),
                  ald.a.fieldOf("location").forGetter(god.g::c),
                  ays.m.fieldOf("width").forGetter(god.g::d),
                  ays.m.fieldOf("height").forGetter(god.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(god.g::f)
               )
               .apply($$0, god.g::new)
      );

      @Override
      public Set<ald> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public ald c() {
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
      public static final Codec<god.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(god.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(god.h::b))
               .apply($$0, god.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
