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

public record glo(Map<alz, glo.d> b, List<glo.e> c) {
   public static final Codec<glo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alz.a, glo.d.b).optionalFieldOf("targets", Map.of()).forGetter(glo::a),
               glo.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(glo::b)
            )
            .apply($$0, glo::new)
   );

   public Map<alz, glo.d> a() {
      return this.b;
   }

   public List<glo.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements glo.d {
      public static final Codec<glo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(glo.a::a), azn.m.fieldOf("height").forGetter(glo.a::b)).apply($$0, glo.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements glo.d {
      public static final Codec<glo.b> a = Codec.unit(glo.b::new);
   }

   public sealed interface c permits glo.g, glo.f {
      Codec<glo.c> a = Codec.xor(glo.g.b, glo.f.b).xmap($$0 -> (glo.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glo.g $$3 -> Either.left($$3);
            case glo.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alz> b();
   }

   public sealed interface d permits glo.b, glo.a {
      Codec<glo.d> b = Codec.either(glo.a.a, glo.b.a).xmap($$0 -> (glo.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glo.a $$3 -> Either.left($$3);
            case glo.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alz b, List<glo.c> c, alz d, List<glo.h> e) {
      private static final Codec<List<glo.c>> f = glo.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (glo.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<glo.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("program").forGetter(glo.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(glo.e::b),
                  alz.a.fieldOf("output").forGetter(glo.e::c),
                  glo.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(glo.e::d)
               )
               .apply($$0, glo.e::new)
      );

      public alz a() {
         return this.b;
      }

      public List<glo.c> b() {
         return this.c;
      }

      public alz c() {
         return this.d;
      }

      public List<glo.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alz d, boolean e, boolean f) implements glo.c {
      public static final Codec<glo.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glo.f::a),
                  alz.a.fieldOf("target").forGetter(glo.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(glo.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glo.f::e)
               )
               .apply($$0, glo.f::new)
      );

      @Override
      public Set<alz> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alz c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alz d, int e, int f, boolean g) implements glo.c {
      public static final Codec<glo.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glo.g::a),
                  alz.a.fieldOf("location").forGetter(glo.g::c),
                  azn.m.fieldOf("width").forGetter(glo.g::d),
                  azn.m.fieldOf("height").forGetter(glo.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glo.g::f)
               )
               .apply($$0, glo.g::new)
      );

      @Override
      public Set<alz> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alz c() {
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
      public static final Codec<glo.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(glo.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(glo.h::b))
               .apply($$0, glo.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
