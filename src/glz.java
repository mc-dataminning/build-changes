import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record glz(alp b, alp c, List<glz.a> d, List<glz.b> e, glw f) {
   public static final Codec<glz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alp.a.fieldOf("vertex").forGetter(glz::a),
               alp.a.fieldOf("fragment").forGetter(glz::b),
               glz.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(glz::c),
               glz.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(glz::d),
               glw.b.optionalFieldOf("defines", glw.a).forGetter(glz::e)
            )
            .apply($$0, glz::new)
   );

   public alp a() {
      return this.b;
   }

   public alp b() {
      return this.c;
   }

   public List<glz.a> c() {
      return this.d;
   }

   public List<glz.b> d() {
      return this.e;
   }

   public glw e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<glz.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(glz.a::a)).apply($$0, glz.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<glz.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(glz.b::a),
                     Codec.STRING.fieldOf("type").forGetter(glz.b::b),
                     Codec.INT.fieldOf("count").forGetter(glz.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(glz.b::d)
                  )
                  .apply($$0, glz.b::new)
         )
         .validate(glz.b::a);

      private static DataResult<glz.b> a(glz.b $$0) {
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
