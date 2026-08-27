import com.mojang.serialization.Codec;
import java.util.Map;

public record fwk(Map<String, fwa> d) {
   public static final Codec<String> a = aoi.b(1, 16);
   public static final Codec<fwk> b = Codec.unboundedMap(a, fwa.a).xmap(fwk::new, fwk::a);
   public static final ajy<fwk> c = ajy.a("language", b);

   public Map<String, fwa> a() {
      return this.d;
   }
}
