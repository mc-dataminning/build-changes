import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gyy(gyz d) {
   public static final gyy a = new gyy(gyz.b);
   public static final Codec<gyy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gyz.a.optionalFieldOf("scaling", gyz.b).forGetter(gyy::a)).apply($$0, gyy::new)
   );
   public static final atv<gyy> c = atv.a("gui", b);

   public gyz a() {
      return this.d;
   }
}
