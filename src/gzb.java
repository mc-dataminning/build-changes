import com.mojang.serialization.Codec;
import java.util.Map;

public record gzb(Map<String, gyo> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gzb> b = Codec.unboundedMap(a, gyo.a).xmap(gzb::new, gzb::a);
   public static final atv<gzb> c = atv.a("language", b);

   public Map<String, gyo> a() {
      return this.d;
   }
}
