import com.mojang.serialization.Codec;
import java.util.Map;

public record hde(Map<String, hcr> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hde> b = Codec.unboundedMap(a, hcr.a).xmap(hde::new, hde::a);
   public static final auu<hde> c = auu.a("language", b);

   public Map<String, hcr> a() {
      return this.d;
   }
}
