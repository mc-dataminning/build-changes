import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gza(String b, String c, boolean d) {
   public static final Codec<gza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.A.fieldOf("region").forGetter(gza::b),
               ays.A.fieldOf("name").forGetter(gza::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gza::d)
            )
            .apply($$0, gza::new)
   );

   public xh a() {
      return xh.b(this.c + " (" + this.b + ")");
   }
}
