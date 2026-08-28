import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hcm(String b, String c, boolean d) {
   public static final Codec<hcm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.A.fieldOf("region").forGetter(hcm::b),
               azn.A.fieldOf("name").forGetter(hcm::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hcm::d)
            )
            .apply($$0, hcm::new)
   );

   public xv a() {
      return xv.b(this.c + " (" + this.b + ")");
   }
}
