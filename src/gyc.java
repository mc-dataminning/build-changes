import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gyc(gyd d) {
   public static final gyc a = new gyc(gyd.b);
   public static final Codec<gyc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gyd.a.optionalFieldOf("scaling", gyd.b).forGetter(gyc::a)).apply($$0, gyc::new)
   );
   public static final ats<gyc> c = ats.a("gui", b);

   public gyd a() {
      return this.d;
   }
}
