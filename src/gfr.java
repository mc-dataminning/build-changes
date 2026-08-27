import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gfr(String b, String c, boolean d) {
   public static final Codec<gfr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.v.fieldOf("region").forGetter(gfr::b),
               atv.v.fieldOf("name").forGetter(gfr::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gfr::d)
            )
            .apply($$0, gfr::new)
   );

   public vf a() {
      return vf.b(this.c + " (" + this.b + ")");
   }
}
