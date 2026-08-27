import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gki(String b, String c, boolean d) {
   public static final Codec<gki> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.w.fieldOf("region").forGetter(gki::b),
               awe.w.fieldOf("name").forGetter(gki::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gki::d)
            )
            .apply($$0, gki::new)
   );

   public vu a() {
      return vu.b(this.c + " (" + this.b + ")");
   }
}
