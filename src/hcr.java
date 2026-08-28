import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hcr(String b, String c, boolean d) {
   public static final Codec<hcr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.A.fieldOf("region").forGetter(hcr::b),
               azn.A.fieldOf("name").forGetter(hcr::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hcr::d)
            )
            .apply($$0, hcr::new)
   );

   public xv a() {
      return xv.b(this.c + " (" + this.b + ")");
   }
}
