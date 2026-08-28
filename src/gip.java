import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gip(alh b, alh c, List<gip.a> d, List<gip.b> e, gim f) {
   public static final Codec<gip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alh.a.fieldOf("vertex").forGetter(gip::a),
               alh.a.fieldOf("fragment").forGetter(gip::b),
               gip.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gip::c),
               gip.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gip::d),
               gim.b.optionalFieldOf("defines", gim.a).forGetter(gip::e)
            )
            .apply($$0, gip::new)
   );

   public alh a() {
      return this.b;
   }

   public alh b() {
      return this.c;
   }

   public List<gip.a> c() {
      return this.d;
   }

   public List<gip.b> d() {
      return this.e;
   }

   public gim e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gip.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gip.a::a)).apply($$0, gip.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gip.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gip.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gip.b::b),
                     Codec.INT.fieldOf("count").forGetter(gip.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gip.b::d)
                  )
                  .apply($$0, gip.b::new)
         )
         .validate(gip.b::a);

      private static DataResult<gip.b> a(gip.b $$0) {
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
