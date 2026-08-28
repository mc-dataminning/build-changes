import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hdc(hdd d) {
   public static final hdc a = new hdc(hdd.b);
   public static final Codec<hdc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hdd.a.optionalFieldOf("scaling", hdd.b).forGetter(hdc::a)).apply($$0, hdc::new)
   );
   public static final auu<hdc> c = auu.a("gui", b);

   public hdd a() {
      return this.d;
   }
}
