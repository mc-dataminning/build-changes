import com.mojang.blaze3d.systems.RenderPass;
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

public record grs(Map<alr, grs.d> b, List<grs.e> c) {
   public static final Codec<grs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alr.a, grs.d.b).optionalFieldOf("targets", Map.of()).forGetter(grs::a),
               grs.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(grs::b)
            )
            .apply($$0, grs::new)
   );

   public Map<alr, grs.d> a() {
      return this.b;
   }

   public List<grs.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements grs.d {
      public static final Codec<grs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azg.m.fieldOf("width").forGetter(grs.a::a), azg.m.fieldOf("height").forGetter(grs.a::b)).apply($$0, grs.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements grs.d {
      public static final Codec<grs.b> a = Codec.unit(grs.b::new);
   }

   public sealed interface c permits grs.g, grs.f {
      Codec<grs.c> a = Codec.xor(grs.g.b, grs.f.b).xmap($$0 -> (grs.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case grs.g $$3 -> Either.left($$3);
            case grs.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alr> b();
   }

   public sealed interface d permits grs.b, grs.a {
      Codec<grs.d> b = Codec.either(grs.a.a, grs.b.a).xmap($$0 -> (grs.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case grs.a $$3 -> Either.left($$3);
            case grs.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alr b, alr c, List<grs.c> d, alr e, List<grs.h> f) {
      private static final Codec<List<grs.c>> g = grs.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (grs.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<grs.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alr.a.fieldOf("vertex_shader").forGetter(grs.e::b),
                  alr.a.fieldOf("fragment_shader").forGetter(grs.e::c),
                  g.optionalFieldOf("inputs", List.of()).forGetter(grs.e::d),
                  alr.a.fieldOf("output").forGetter(grs.e::e),
                  grs.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(grs.e::f)
               )
               .apply($$0, grs.e::new)
      );

      public Stream<alr> a() {
         Stream<alr> $$0 = this.d.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.e));
      }
   }

   public static record f(String c, alr d, boolean e, boolean f) implements grs.c {
      public static final Codec<grs.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(grs.f::a),
                  alr.a.fieldOf("target").forGetter(grs.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(grs.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(grs.f::e)
               )
               .apply($$0, grs.f::new)
      );

      @Override
      public Set<alr> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alr c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alr d, int e, int f, boolean g) implements grs.c {
      public static final Codec<grs.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(grs.g::a),
                  alr.a.fieldOf("location").forGetter(grs.g::c),
                  azg.m.fieldOf("width").forGetter(grs.g::d),
                  azg.m.fieldOf("height").forGetter(grs.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(grs.g::f)
               )
               .apply($$0, grs.g::new)
      );

      @Override
      public Set<alr> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alr c() {
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
      public static final Codec<grs.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(grs.h::a),
                  Codec.STRING.fieldOf("type").forGetter(grs.h::b),
                  Codec.FLOAT.sizeLimitedListOf(4).optionalFieldOf("values").forGetter(grs.h::c)
               )
               .apply($$0, grs.h::new)
      );

      public void a(RenderPass $$0) {
         fku $$1 = fku.h.a(this.c);
         if (!this.d.isEmpty() && $$1 != null && !this.d.get().isEmpty()) {
            List<Float> $$2 = this.d.get();
            if ($$1.b()) {
               $$0.setUniform(this.b, (int)$$2.getFirst().floatValue());
            } else {
               float[] $$3 = new float[$$1.d()];
               if ($$2.size() == 1) {
                  Arrays.fill($$3, $$2.getFirst().floatValue());
               } else {
                  for (int $$4 = 0; $$4 < Math.min($$2.size(), $$1.d()); $$4++) {
                     $$3[$$4] = $$2.get($$4);
                  }
               }

               $$0.setUniform(this.b, $$3);
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
