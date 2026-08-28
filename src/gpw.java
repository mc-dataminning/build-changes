import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gpw(ale b, ale c, List<gpw.a> d, List<gpw.b> e, gpt f) {
   public static final Codec<gpw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("vertex").forGetter(gpw::a),
               ale.a.fieldOf("fragment").forGetter(gpw::b),
               gpw.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gpw::c),
               gpw.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gpw::d),
               gpt.b.optionalFieldOf("defines", gpt.a).forGetter(gpw::e)
            )
            .apply($$0, gpw::new)
   );

   public ale a() {
      return this.b;
   }

   public ale b() {
      return this.c;
   }

   public List<gpw.a> c() {
      return this.d;
   }

   public List<gpw.b> d() {
      return this.e;
   }

   public gpt e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gpw.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gpw.a::a)).apply($$0, gpw.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gpw.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gpw.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gpw.b::b),
                     Codec.INT.fieldOf("count").forGetter(gpw.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gpw.b::d)
                  )
                  .apply($$0, gpw.b::new)
         )
         .validate(gpw.b::a);

      private static DataResult<gpw.b> a(gpw.b $$0) {
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
