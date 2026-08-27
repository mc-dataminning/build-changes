import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gia(String b, String c, boolean d) {
   public static final Codec<gia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.v.fieldOf("region").forGetter(gia::b),
               avp.v.fieldOf("name").forGetter(gia::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gia::d)
            )
            .apply($$0, gia::new)
   );

   public vq a() {
      return vq.b(this.c + " (" + this.b + ")");
   }
}
