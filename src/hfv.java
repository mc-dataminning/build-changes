import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hfv(String b, String c, boolean d) {
   public static final Codec<hfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.A.fieldOf("region").forGetter(hfv::b),
               ayh.A.fieldOf("name").forGetter(hfv::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hfv::d)
            )
            .apply($$0, hfv::new)
   );

   public wo a() {
      return wo.b(this.c + " (" + this.b + ")");
   }
}
