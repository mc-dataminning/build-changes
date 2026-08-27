import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gih(String b, String c, boolean d) {
   public static final Codec<gih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.v.fieldOf("region").forGetter(gih::b),
               avq.v.fieldOf("name").forGetter(gih::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gih::d)
            )
            .apply($$0, gih::new)
   );

   public vq a() {
      return vq.b(this.c + " (" + this.b + ")");
   }
}
