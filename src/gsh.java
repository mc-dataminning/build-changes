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

public record gsh(Map<alk, gsh.d> b, List<gsh.e> c) {
   public static final Codec<gsh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alk.a, gsh.d.b).optionalFieldOf("targets", Map.of()).forGetter(gsh::a),
               gsh.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gsh::b)
            )
            .apply($$0, gsh::new)
   );

   public Map<alk, gsh.d> a() {
      return this.b;
   }

   public List<gsh.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gsh.d {
      public static final Codec<gsh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayy.m.fieldOf("width").forGetter(gsh.a::a), ayy.m.fieldOf("height").forGetter(gsh.a::b)).apply($$0, gsh.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gsh.d {
      public static final Codec<gsh.b> a = Codec.unit(gsh.b::new);
   }

   public sealed interface c permits gsh.g, gsh.f {
      Codec<gsh.c> a = Codec.xor(gsh.g.b, gsh.f.b).xmap($$0 -> (gsh.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gsh.g $$3 -> Either.left($$3);
            case gsh.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alk> b();
   }

   public sealed interface d permits gsh.b, gsh.a {
      Codec<gsh.d> b = Codec.either(gsh.a.a, gsh.b.a).xmap($$0 -> (gsh.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gsh.a $$3 -> Either.left($$3);
            case gsh.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alk b, alk c, List<gsh.c> d, alk e, List<gsh.h> f) {
      private static final Codec<List<gsh.c>> g = gsh.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gsh.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gsh.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alk.a.fieldOf("vertex_shader").forGetter(gsh.e::b),
                  alk.a.fieldOf("fragment_shader").forGetter(gsh.e::c),
                  g.optionalFieldOf("inputs", List.of()).forGetter(gsh.e::d),
                  alk.a.fieldOf("output").forGetter(gsh.e::e),
                  gsh.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gsh.e::f)
               )
               .apply($$0, gsh.e::new)
      );

      public Stream<alk> a() {
         Stream<alk> $$0 = this.d.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.e));
      }
   }

   public static record f(String c, alk d, boolean e, boolean f) implements gsh.c {
      public static final Codec<gsh.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gsh.f::a),
                  alk.a.fieldOf("target").forGetter(gsh.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gsh.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gsh.f::e)
               )
               .apply($$0, gsh.f::new)
      );

      @Override
      public Set<alk> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alk c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alk d, int e, int f, boolean g) implements gsh.c {
      public static final Codec<gsh.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gsh.g::a),
                  alk.a.fieldOf("location").forGetter(gsh.g::c),
                  ayy.m.fieldOf("width").forGetter(gsh.g::d),
                  ayy.m.fieldOf("height").forGetter(gsh.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gsh.g::f)
               )
               .apply($$0, gsh.g::new)
      );

      @Override
      public Set<alk> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alk c() {
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
      public static final Codec<gsh.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(gsh.h::a),
                  Codec.STRING.fieldOf("type").forGetter(gsh.h::b),
                  Codec.FLOAT.sizeLimitedListOf(4).optionalFieldOf("values").forGetter(gsh.h::c)
               )
               .apply($$0, gsh.h::new)
      );

      public void a(fld $$0) {
         fkz $$1 = fkz.h.a(this.c);
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
