import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gmc(alz b, alz c, List<gmc.a> d, List<gmc.b> e, glz f) {
   public static final Codec<gmc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("vertex").forGetter(gmc::a),
               alz.a.fieldOf("fragment").forGetter(gmc::b),
               gmc.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gmc::c),
               gmc.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gmc::d),
               glz.b.optionalFieldOf("defines", glz.a).forGetter(gmc::e)
            )
            .apply($$0, gmc::new)
   );

   public alz a() {
      return this.b;
   }

   public alz b() {
      return this.c;
   }

   public List<gmc.a> c() {
      return this.d;
   }

   public List<gmc.b> d() {
      return this.e;
   }

   public glz e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gmc.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gmc.a::a)).apply($$0, gmc.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gmc.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gmc.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gmc.b::b),
                     Codec.INT.fieldOf("count").forGetter(gmc.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gmc.b::d)
                  )
                  .apply($$0, gmc.b::new)
         )
         .validate(gmc.b::a);

      private static DataResult<gmc.b> a(gmc.b $$0) {
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
