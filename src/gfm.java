import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gfm(String b, String c, boolean d) {
   public static final Codec<gfm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.v.fieldOf("region").forGetter(gfm::b),
               atq.v.fieldOf("name").forGetter(gfm::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gfm::d)
            )
            .apply($$0, gfm::new)
   );

   public vd a() {
      return vd.b(this.c + " (" + this.b + ")");
   }
}
