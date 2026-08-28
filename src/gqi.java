import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqi(String b, String c, boolean d) {
   public static final Codec<gqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.y.fieldOf("region").forGetter(gqi::b),
               ayh.y.fieldOf("name").forGetter(gqi::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqi::d)
            )
            .apply($$0, gqi::new)
   );

   public xp a() {
      return xp.b(this.c + " (" + this.b + ")");
   }
}
