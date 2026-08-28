import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gja(ali b, ali c, List<gja.a> d, List<gja.b> e, gix f) {
   public static final Codec<gja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ali.a.fieldOf("vertex").forGetter(gja::a),
               ali.a.fieldOf("fragment").forGetter(gja::b),
               gja.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gja::c),
               gja.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gja::d),
               gix.b.optionalFieldOf("defines", gix.a).forGetter(gja::e)
            )
            .apply($$0, gja::new)
   );

   public ali a() {
      return this.b;
   }

   public ali b() {
      return this.c;
   }

   public List<gja.a> c() {
      return this.d;
   }

   public List<gja.b> d() {
      return this.e;
   }

   public gix e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gja.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gja.a::a)).apply($$0, gja.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gja.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gja.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gja.b::b),
                     Codec.INT.fieldOf("count").forGetter(gja.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gja.b::d)
                  )
                  .apply($$0, gja.b::new)
         )
         .validate(gja.b::a);

      private static DataResult<gja.b> a(gja.b $$0) {
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
