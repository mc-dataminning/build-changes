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

public record gnc(Map<aku, gnc.d> b, List<gnc.e> c) {
   public static final Codec<gnc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(aku.a, gnc.d.b).optionalFieldOf("targets", Map.of()).forGetter(gnc::a),
               gnc.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gnc::b)
            )
            .apply($$0, gnc::new)
   );

   public Map<aku, gnc.d> a() {
      return this.b;
   }

   public List<gnc.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gnc.d {
      public static final Codec<gnc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(gnc.a::a), ayi.m.fieldOf("height").forGetter(gnc.a::b)).apply($$0, gnc.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gnc.d {
      public static final Codec<gnc.b> a = Codec.unit(gnc.b::new);
   }

   public sealed interface c permits gnc.g, gnc.f {
      Codec<gnc.c> a = Codec.xor(gnc.g.b, gnc.f.b).xmap($$0 -> (gnc.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gnc.g $$3 -> Either.left($$3);
            case gnc.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<aku> b();
   }

   public sealed interface d permits gnc.b, gnc.a {
      Codec<gnc.d> b = Codec.either(gnc.a.a, gnc.b.a).xmap($$0 -> (gnc.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gnc.a $$3 -> Either.left($$3);
            case gnc.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(aku b, List<gnc.c> c, aku d, List<gnc.h> e) {
      private static final Codec<List<gnc.c>> f = gnc.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gnc.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gnc.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("program").forGetter(gnc.e::c),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gnc.e::d),
                  aku.a.fieldOf("output").forGetter(gnc.e::e),
                  gnc.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gnc.e::f)
               )
               .apply($$0, gnc.e::new)
      );

      public gnp a() {
         return new gnp(this.b, fgp.e, gnn.a);
      }

      public Stream<aku> b() {
         Stream<aku> $$0 = this.c.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.d));
      }

      public aku c() {
         return this.b;
      }

      public List<gnc.c> d() {
         return this.c;
      }

      public aku e() {
         return this.d;
      }

      public List<gnc.h> f() {
         return this.e;
      }
   }

   public static record f(String c, aku d, boolean e, boolean f) implements gnc.c {
      public static final Codec<gnc.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gnc.f::a),
                  aku.a.fieldOf("target").forGetter(gnc.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gnc.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gnc.f::e)
               )
               .apply($$0, gnc.f::new)
      );

      @Override
      public Set<aku> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public aku c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, aku d, int e, int f, boolean g) implements gnc.c {
      public static final Codec<gnc.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gnc.g::a),
                  aku.a.fieldOf("location").forGetter(gnc.g::c),
                  ayi.m.fieldOf("width").forGetter(gnc.g::d),
                  ayi.m.fieldOf("height").forGetter(gnc.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gnc.g::f)
               )
               .apply($$0, gnc.g::new)
      );

      @Override
      public Set<aku> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public aku c() {
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
      public static final Codec<gnc.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gnc.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gnc.h::b))
               .apply($$0, gnc.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
