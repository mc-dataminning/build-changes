import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gft(String b, String c, boolean d) {
   public static final Codec<gft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atw.v.fieldOf("region").forGetter(gft::b),
               atw.v.fieldOf("name").forGetter(gft::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gft::d)
            )
            .apply($$0, gft::new)
   );

   public vf a() {
      return vf.b(this.c + " (" + this.b + ")");
   }
}
