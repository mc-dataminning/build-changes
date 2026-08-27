import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gev(String b, String c, boolean d) {
   public static final Codec<gev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.v.fieldOf("region").forGetter(gev::b),
               atg.v.fieldOf("name").forGetter(gev::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gev::d)
            )
            .apply($$0, gev::new)
   );

   public vb a() {
      return vb.b(this.c + " (" + this.b + ")");
   }
}
