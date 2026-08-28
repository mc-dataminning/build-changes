import com.mojang.serialization.Codec;
import java.util.Map;

public record hgm(Map<String, hgb> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hgm> b = Codec.unboundedMap(a, hgb.a).xmap(hgm::new, hgm::a);
   public static final atp<hgm> c = new atp<>("language", b);

   public Map<String, hgb> a() {
      return this.d;
   }
}
