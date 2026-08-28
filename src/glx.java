import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record glx(alz b, alz c, List<glx.a> d, List<glx.b> e, glu f) {
   public static final Codec<glx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("vertex").forGetter(glx::a),
               alz.a.fieldOf("fragment").forGetter(glx::b),
               glx.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(glx::c),
               glx.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(glx::d),
               glu.b.optionalFieldOf("defines", glu.a).forGetter(glx::e)
            )
            .apply($$0, glx::new)
   );

   public alz a() {
      return this.b;
   }

   public alz b() {
      return this.c;
   }

   public List<glx.a> c() {
      return this.d;
   }

   public List<glx.b> d() {
      return this.e;
   }

   public glu e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<glx.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(glx.a::a)).apply($$0, glx.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<glx.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(glx.b::a),
                     Codec.STRING.fieldOf("type").forGetter(glx.b::b),
                     Codec.INT.fieldOf("count").forGetter(glx.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(glx.b::d)
                  )
                  .apply($$0, glx.b::new)
         )
         .validate(glx.b::a);

      private static DataResult<glx.b> a(glx.b $$0) {
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
