import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gkf(String b, String c, boolean d) {
   public static final Codec<gkf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.w.fieldOf("region").forGetter(gkf::b),
               awe.w.fieldOf("name").forGetter(gkf::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gkf::d)
            )
            .apply($$0, gkf::new)
   );

   public vu a() {
      return vu.b(this.c + " (" + this.b + ")");
   }
}
