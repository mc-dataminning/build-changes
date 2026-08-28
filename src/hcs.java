import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hcs(String b, String c, boolean d) {
   public static final Codec<hcs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.A.fieldOf("region").forGetter(hcs::b),
               azn.A.fieldOf("name").forGetter(hcs::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hcs::d)
            )
            .apply($$0, hcs::new)
   );

   public xv a() {
      return xv.b(this.c + " (" + this.b + ")");
   }
}
