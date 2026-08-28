import com.mojang.serialization.Codec;
import java.util.Map;

public record hao(Map<String, hab> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hao> b = Codec.unboundedMap(a, hab.a).xmap(hao::new, hao::a);
   public static final aud<hao> c = aud.a("language", b);

   public Map<String, hab> a() {
      return this.d;
   }
}
