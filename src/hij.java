import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hij(hik d) {
   public static final hij a = new hij(hik.b);
   public static final Codec<hij> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hik.a.optionalFieldOf("scaling", hik.b).forGetter(hij::a)).apply($$0, hij::new)
   );
   public static final atz<hij> c = new atz<>("gui", b);

   public hik a() {
      return this.d;
   }
}
