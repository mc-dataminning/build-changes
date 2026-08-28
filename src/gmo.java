import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gmo(aku b, aku c, List<gmo.a> d, List<gmo.b> e, gml f) {
   public static final Codec<gmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.fieldOf("vertex").forGetter(gmo::a),
               aku.a.fieldOf("fragment").forGetter(gmo::b),
               gmo.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gmo::c),
               gmo.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gmo::d),
               gml.b.optionalFieldOf("defines", gml.a).forGetter(gmo::e)
            )
            .apply($$0, gmo::new)
   );

   public aku a() {
      return this.b;
   }

   public aku b() {
      return this.c;
   }

   public List<gmo.a> c() {
      return this.d;
   }

   public List<gmo.b> d() {
      return this.e;
   }

   public gml e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gmo.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gmo.a::a)).apply($$0, gmo.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gmo.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gmo.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gmo.b::b),
                     Codec.INT.fieldOf("count").forGetter(gmo.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gmo.b::d)
                  )
                  .apply($$0, gmo.b::new)
         )
         .validate(gmo.b::a);

      private static DataResult<gmo.b> a(gmo.b $$0) {
         int $$1 = $$0.d;
         int $$2 = $$0.e.size();
         return $$2 != $$1 && $$2 > 1
            ? DataResult.error(() -> "Invalid amount of uniform values specified (expected " + $$1 + ", found " + $$2 + ")")
            : DataResult.success($$0);
      }

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public List<Float> d() {
         return this.e;
      }
   }
}
