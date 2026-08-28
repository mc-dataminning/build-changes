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

public record gib(Map<alh, gib.d> b, List<gib.e> c) {
   public static final Codec<gib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alh.a, gib.d.b).optionalFieldOf("targets", Map.of()).forGetter(gib::a),
               gib.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gib::b)
            )
            .apply($$0, gib::new)
   );

   public Map<alh, gib.d> a() {
      return this.b;
   }

   public List<gib.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gib.d {
      public static final Codec<gib.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ays.m.fieldOf("width").forGetter(gib.a::a), ays.m.fieldOf("height").forGetter(gib.a::b)).apply($$0, gib.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gib.d {
      public static final Codec<gib.b> a = Codec.unit(gib.b::new);
   }

   public sealed interface c permits gib.g, gib.f {
      Codec<gib.c> a = Codec.xor(gib.g.b, gib.f.b).xmap($$0 -> (gib.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gib.g $$3 -> Either.left($$3);
            case gib.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alh> b();
   }

   public sealed interface d permits gib.b, gib.a {
      Codec<gib.d> b = Codec.either(gib.a.a, gib.b.a).xmap($$0 -> (gib.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gib.a $$3 -> Either.left($$3);
            case gib.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alh b, List<gib.c> c, alh d, List<gib.h> e) {
      private static final Codec<List<gib.c>> f = gib.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gib.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gib.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alh.a.fieldOf("program").forGetter(gib.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gib.e::b),
                  alh.a.fieldOf("output").forGetter(gib.e::c),
                  gib.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gib.e::d)
               )
               .apply($$0, gib.e::new)
      );

      public alh a() {
         return this.b;
      }

      public List<gib.c> b() {
         return this.c;
      }

      public alh c() {
         return this.d;
      }

      public List<gib.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alh d, boolean e, boolean f) implements gib.c {
      public static final Codec<gib.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gib.f::a),
                  alh.a.fieldOf("target").forGetter(gib.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gib.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gib.f::e)
               )
               .apply($$0, gib.f::new)
      );

      @Override
      public Set<alh> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alh c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alh d, int e, int f, boolean g) implements gib.c {
      public static final Codec<gib.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gib.g::a),
                  alh.a.fieldOf("location").forGetter(gib.g::c),
                  ays.m.fieldOf("width").forGetter(gib.g::d),
                  ays.m.fieldOf("height").forGetter(gib.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gib.g::f)
               )
               .apply($$0, gib.g::new)
      );

      @Override
      public Set<alh> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alh c() {
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
      public static final Codec<gib.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gib.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gib.h::b))
               .apply($$0, gib.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
