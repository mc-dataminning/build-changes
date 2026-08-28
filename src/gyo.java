import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gyo(String b, String c, boolean d) {
   public static final Codec<gyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.z.fieldOf("region").forGetter(gyo::b),
               ayo.z.fieldOf("name").forGetter(gyo::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gyo::d)
            )
            .apply($$0, gyo::new)
   );

   public xe a() {
      return xe.b(this.c + " (" + this.b + ")");
   }
}
