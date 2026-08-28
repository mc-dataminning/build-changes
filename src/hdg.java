import com.mojang.serialization.Codec;
import java.util.Map;

public record hdg(Map<String, hct> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hdg> b = Codec.unboundedMap(a, hct.a).xmap(hdg::new, hdg::a);
   public static final auu<hdg> c = auu.a("language", b);

   public Map<String, hct> a() {
      return this.d;
   }
}
