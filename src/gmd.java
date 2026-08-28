import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gmd(alz b, alz c, List<gmd.a> d, List<gmd.b> e, gma f) {
   public static final Codec<gmd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("vertex").forGetter(gmd::a),
               alz.a.fieldOf("fragment").forGetter(gmd::b),
               gmd.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gmd::c),
               gmd.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gmd::d),
               gma.b.optionalFieldOf("defines", gma.a).forGetter(gmd::e)
            )
            .apply($$0, gmd::new)
   );

   public alz a() {
      return this.b;
   }

   public alz b() {
      return this.c;
   }

   public List<gmd.a> c() {
      return this.d;
   }

   public List<gmd.b> d() {
      return this.e;
   }

   public gma e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gmd.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gmd.a::a)).apply($$0, gmd.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gmd.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gmd.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gmd.b::b),
                     Codec.INT.fieldOf("count").forGetter(gmd.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gmd.b::d)
                  )
                  .apply($$0, gmd.b::new)
         )
         .validate(gmd.b::a);

      private static DataResult<gmd.b> a(gmd.b $$0) {
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
