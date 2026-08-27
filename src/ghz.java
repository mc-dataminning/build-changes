import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ghz(String b, String c, boolean d) {
   public static final Codec<ghz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.v.fieldOf("region").forGetter(ghz::b),
               avp.v.fieldOf("name").forGetter(ghz::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(ghz::d)
            )
            .apply($$0, ghz::new)
   );

   public vq a() {
      return vq.b(this.c + " (" + this.b + ")");
   }
}
