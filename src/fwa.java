import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fwa(String b, String c, boolean d) {
   public static final Codec<fwa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aoi.u.fieldOf("region").forGetter(fwa::b),
               aoi.u.fieldOf("name").forGetter(fwa::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(fwa::d)
            )
            .apply($$0, fwa::new)
   );

   public sw a() {
      return sw.b(this.c + " (" + this.b + ")");
   }
}
