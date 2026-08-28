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

public record gmd(Map<akv, gmd.d> b, List<gmd.e> c) {
   public static final Codec<gmd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(akv.a, gmd.d.b).optionalFieldOf("targets", Map.of()).forGetter(gmd::a),
               gmd.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gmd::b)
            )
            .apply($$0, gmd::new)
   );

   public Map<akv, gmd.d> a() {
      return this.b;
   }

   public List<gmd.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gmd.d {
      public static final Codec<gmd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(gmd.a::a), ayi.m.fieldOf("height").forGetter(gmd.a::b)).apply($$0, gmd.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gmd.d {
      public static final Codec<gmd.b> a = Codec.unit(gmd.b::new);
   }

   public sealed interface c permits gmd.g, gmd.f {
      Codec<gmd.c> a = Codec.xor(gmd.g.b, gmd.f.b).xmap($$0 -> (gmd.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gmd.g $$3 -> Either.left($$3);
            case gmd.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<akv> b();
   }

   public sealed interface d permits gmd.b, gmd.a {
      Codec<gmd.d> b = Codec.either(gmd.a.a, gmd.b.a).xmap($$0 -> (gmd.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gmd.a $$3 -> Either.left($$3);
            case gmd.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(akv b, List<gmd.c> c, akv d, List<gmd.h> e) {
      private static final Codec<List<gmd.c>> f = gmd.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gmd.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gmd.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("program").forGetter(gmd.e::b),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gmd.e::c),
                  akv.a.fieldOf("output").forGetter(gmd.e::d),
                  gmd.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gmd.e::e)
               )
               .apply($$0, gmd.e::new)
      );

      public gmq a() {
         return new gmq(this.b, ffs.e, gmo.a);
      }
   }

   public static record f(String c, akv d, boolean e, boolean f) implements gmd.c {
      public static final Codec<gmd.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gmd.f::a),
                  akv.a.fieldOf("target").forGetter(gmd.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gmd.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gmd.f::e)
               )
               .apply($$0, gmd.f::new)
      );

      @Override
      public Set<akv> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public akv c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, akv d, int e, int f, boolean g) implements gmd.c {
      public static final Codec<gmd.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gmd.g::a),
                  akv.a.fieldOf("location").forGetter(gmd.g::c),
                  ayi.m.fieldOf("width").forGetter(gmd.g::d),
                  ayi.m.fieldOf("height").forGetter(gmd.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gmd.g::f)
               )
               .apply($$0, gmd.g::new)
      );

      @Override
      public Set<akv> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public akv c() {
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
      public static final Codec<gmd.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gmd.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gmd.h::b))
               .apply($$0, gmd.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
