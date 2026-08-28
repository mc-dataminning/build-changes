import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hct(String b, String c, boolean d) {
   public static final Codec<hct> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.A.fieldOf("region").forGetter(hct::b),
               azn.A.fieldOf("name").forGetter(hct::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hct::d)
            )
            .apply($$0, hct::new)
   );

   public xv a() {
      return xv.b(this.c + " (" + this.b + ")");
   }
}
