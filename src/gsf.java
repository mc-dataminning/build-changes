import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public record gsf(Map<ali, gsf.d> b, List<gsf.e> c) {
   public static final Codec<gsf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(ali.a, gsf.d.b).optionalFieldOf("targets", Map.of()).forGetter(gsf::a),
               gsf.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gsf::b)
            )
            .apply($$0, gsf::new)
   );

   public Map<ali, gsf.d> a() {
      return this.b;
   }

   public List<gsf.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gsf.d {
      public static final Codec<gsf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayw.m.fieldOf("width").forGetter(gsf.a::a), ayw.m.fieldOf("height").forGetter(gsf.a::b)).apply($$0, gsf.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gsf.d {
      public static final Codec<gsf.b> a = Codec.unit(gsf.b::new);
   }

   public sealed interface c permits gsf.g, gsf.f {
      Codec<gsf.c> a = Codec.xor(gsf.g.b, gsf.f.b).xmap($$0 -> (gsf.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gsf.g $$3 -> Either.left($$3);
            case gsf.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<ali> b();
   }

   public sealed interface d permits gsf.b, gsf.a {
      Codec<gsf.d> b = Codec.either(gsf.a.a, gsf.b.a).xmap($$0 -> (gsf.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gsf.a $$3 -> Either.left($$3);
            case gsf.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(ali b, ali c, List<gsf.c> d, ali e, List<gsf.h> f) {
      private static final Codec<List<gsf.c>> g = gsf.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gsf.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gsf.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.fieldOf("vertex_shader").forGetter(gsf.e::b),
                  ali.a.fieldOf("fragment_shader").forGetter(gsf.e::c),
                  g.optionalFieldOf("inputs", List.of()).forGetter(gsf.e::d),
                  ali.a.fieldOf("output").forGetter(gsf.e::e),
                  gsf.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gsf.e::f)
               )
               .apply($$0, gsf.e::new)
      );

      public Stream<ali> a() {
         Stream<ali> $$0 = this.d.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.e));
      }
   }

   public static record f(String c, ali d, boolean e, boolean f) implements gsf.c {
      public static final Codec<gsf.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gsf.f::a),
                  ali.a.fieldOf("target").forGetter(gsf.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gsf.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gsf.f::e)
               )
               .apply($$0, gsf.f::new)
      );

      @Override
      public Set<ali> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public ali c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, ali d, int e, int f, boolean g) implements gsf.c {
      public static final Codec<gsf.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gsf.g::a),
                  ali.a.fieldOf("location").forGetter(gsf.g::c),
                  ayw.m.fieldOf("width").forGetter(gsf.g::d),
                  ayw.m.fieldOf("height").forGetter(gsf.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gsf.g::f)
               )
               .apply($$0, gsf.g::new)
      );

      @Override
      public Set<ali> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public ali c() {
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
      public static final Codec<gsf.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(gsf.h::a),
                  Codec.STRING.fieldOf("type").forGetter(gsf.h::b),
                  Codec.FLOAT.sizeLimitedListOf(4).optionalFieldOf("values").forGetter(gsf.h::c)
               )
               .apply($$0, gsf.h::new)
      );

      public void a(flb $$0) {
         fkx $$1 = fkx.h.a(this.c);
         if (!this.d.isEmpty() && $$1 != null && !this.d.get().isEmpty()) {
            List<Float> $$2 = this.d.get();
            if ($$1.b()) {
               $$0.a(this.b, (int)$$2.getFirst().floatValue());
            } else {
               float[] $$3 = new float[$$1.d()];
               if ($$2.size() == 1) {
                  Arrays.fill($$3, $$2.getFirst().floatValue());
               } else {
                  for (int $$4 = 0; $$4 < Math.min($$2.size(), $$1.d()); $$4++) {
                     $$3[$$4] = $$2.get($$4);
                  }
               }

               $$0.a(this.b, $$3);
            }
         }
      }

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
