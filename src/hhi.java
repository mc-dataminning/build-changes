import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hhi(hhj d) {
   public static final hhi a = new hhi(hhj.b);
   public static final Codec<hhi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hhj.a.optionalFieldOf("scaling", hhj.b).forGetter(hhi::a)).apply($$0, hhi::new)
   );
   public static final atp<hhi> c = new atp<>("gui", b);

   public hhj a() {
      return this.d;
   }
}
