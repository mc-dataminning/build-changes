import com.mojang.serialization.Codec;
import java.util.Map;

public record hcz(Map<String, hcm> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hcz> b = Codec.unboundedMap(a, hcm.a).xmap(hcz::new, hcz::a);
   public static final auu<hcz> c = auu.a("language", b);

   public Map<String, hcm> a() {
      return this.d;
   }
}
