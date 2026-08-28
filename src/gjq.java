import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gjq(all b, all c, List<gjq.a> d, List<gjq.b> e, gjn f) {
   public static final Codec<gjq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               all.a.fieldOf("vertex").forGetter(gjq::a),
               all.a.fieldOf("fragment").forGetter(gjq::b),
               gjq.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gjq::c),
               gjq.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gjq::d),
               gjn.b.optionalFieldOf("defines", gjn.a).forGetter(gjq::e)
            )
            .apply($$0, gjq::new)
   );

   public all a() {
      return this.b;
   }

   public all b() {
      return this.c;
   }

   public List<gjq.a> c() {
      return this.d;
   }

   public List<gjq.b> d() {
      return this.e;
   }

   public gjn e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gjq.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gjq.a::a)).apply($$0, gjq.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gjq.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gjq.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gjq.b::b),
                     Codec.INT.fieldOf("count").forGetter(gjq.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gjq.b::d)
                  )
                  .apply($$0, gjq.b::new)
         )
         .validate(gjq.b::a);

      private static DataResult<gjq.b> a(gjq.b $$0) {
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
