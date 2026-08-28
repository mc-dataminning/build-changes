import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqs(gqt d) {
   public static final gqs a = new gqs(gqt.b);
   public static final Codec<gqs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gqt.a.optionalFieldOf("scaling", gqt.b).forGetter(gqs::a)).apply($$0, gqs::new)
   );
   public static final atp<gqs> c = atp.a("gui", b);

   public gqt a() {
      return this.d;
   }
}
