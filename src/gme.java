import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gme(alz b, alz c, List<gme.a> d, List<gme.b> e, gmb f) {
   public static final Codec<gme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("vertex").forGetter(gme::a),
               alz.a.fieldOf("fragment").forGetter(gme::b),
               gme.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gme::c),
               gme.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gme::d),
               gmb.b.optionalFieldOf("defines", gmb.a).forGetter(gme::e)
            )
            .apply($$0, gme::new)
   );

   public alz a() {
      return this.b;
   }

   public alz b() {
      return this.c;
   }

   public List<gme.a> c() {
      return this.d;
   }

   public List<gme.b> d() {
      return this.e;
   }

   public gmb e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gme.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gme.a::a)).apply($$0, gme.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gme.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gme.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gme.b::b),
                     Codec.INT.fieldOf("count").forGetter(gme.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gme.b::d)
                  )
                  .apply($$0, gme.b::new)
         )
         .validate(gme.b::a);

      private static DataResult<gme.b> a(gme.b $$0) {
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
