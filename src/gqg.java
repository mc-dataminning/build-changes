import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqg(String b, String c, boolean d) {
   public static final Codec<gqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.y.fieldOf("region").forGetter(gqg::b),
               ayh.y.fieldOf("name").forGetter(gqg::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqg::d)
            )
            .apply($$0, gqg::new)
   );

   public xp a() {
      return xp.b(this.c + " (" + this.b + ")");
   }
}
