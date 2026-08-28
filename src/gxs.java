import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gxs(String b, String c, boolean d) {
   public static final Codec<gxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.y.fieldOf("region").forGetter(gxs::b),
               ayl.y.fieldOf("name").forGetter(gxs::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gxs::d)
            )
            .apply($$0, gxs::new)
   );

   public xd a() {
      return xd.b(this.c + " (" + this.b + ")");
   }
}
