import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqh(String b, String c, boolean d) {
   public static final Codec<gqh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.y.fieldOf("region").forGetter(gqh::b),
               ayh.y.fieldOf("name").forGetter(gqh::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqh::d)
            )
            .apply($$0, gqh::new)
   );

   public xp a() {
      return xp.b(this.c + " (" + this.b + ")");
   }
}
