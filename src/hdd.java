import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hdd(hde d) {
   public static final hdd a = new hdd(hde.b);
   public static final Codec<hdd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hde.a.optionalFieldOf("scaling", hde.b).forGetter(hdd::a)).apply($$0, hdd::new)
   );
   public static final auu<hdd> c = auu.a("gui", b);

   public hde a() {
      return this.d;
   }
}
