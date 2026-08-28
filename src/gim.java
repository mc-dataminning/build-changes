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

public record gim(Map<ali, gim.d> b, List<gim.e> c) {
   public static final Codec<gim> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(ali.a, gim.d.b).optionalFieldOf("targets", Map.of()).forGetter(gim::a),
               gim.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gim::b)
            )
            .apply($$0, gim::new)
   );

   public Map<ali, gim.d> a() {
      return this.b;
   }

   public List<gim.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gim.d {
      public static final Codec<gim.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayt.m.fieldOf("width").forGetter(gim.a::a), ayt.m.fieldOf("height").forGetter(gim.a::b)).apply($$0, gim.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gim.d {
      public static final Codec<gim.b> a = Codec.unit(gim.b::new);
   }

   public sealed interface c permits gim.g, gim.f {
      Codec<gim.c> a = Codec.xor(gim.g.b, gim.f.b).xmap($$0 -> (gim.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gim.g $$3 -> Either.left($$3);
            case gim.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<ali> b();
   }

   public sealed interface d permits gim.b, gim.a {
      Codec<gim.d> b = Codec.either(gim.a.a, gim.b.a).xmap($$0 -> (gim.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gim.a $$3 -> Either.left($$3);
            case gim.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(ali b, List<gim.c> c, ali d, List<gim.h> e) {
      private static final Codec<List<gim.c>> f = gim.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gim.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gim.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.fieldOf("program").forGetter(gim.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gim.e::b),
                  ali.a.fieldOf("output").forGetter(gim.e::c),
                  gim.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gim.e::d)
               )
               .apply($$0, gim.e::new)
      );

      public ali a() {
         return this.b;
      }

      public List<gim.c> b() {
         return this.c;
      }

      public ali c() {
         return this.d;
      }

      public List<gim.h> d() {
         return this.e;
      }
   }

   public static record f(String c, ali d, boolean e, boolean f) implements gim.c {
      public static final Codec<gim.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gim.f::a),
                  ali.a.fieldOf("target").forGetter(gim.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gim.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gim.f::e)
               )
               .apply($$0, gim.f::new)
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

   public static record g(String c, ali d, int e, int f, boolean g) implements gim.c {
      public static final Codec<gim.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gim.g::a),
                  ali.a.fieldOf("location").forGetter(gim.g::c),
                  ayt.m.fieldOf("width").forGetter(gim.g::d),
                  ayt.m.fieldOf("height").forGetter(gim.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gim.g::f)
               )
               .apply($$0, gim.g::new)
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

   public static record h(String b, List<Float> c) {
      public static final Codec<gim.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gim.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gim.h::b))
               .apply($$0, gim.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
