import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgb(hgc d) {
   public static final hgb a = new hgb(hgc.b);
   public static final Codec<hgb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgc.a.optionalFieldOf("scaling", hgc.b).forGetter(hgb::a)).apply($$0, hgb::new)
   );
   public static final atp<hgb> c = atp.a("gui", b);

   public hgc a() {
      return this.d;
   }
}
