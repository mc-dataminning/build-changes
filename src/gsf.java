import com.mojang.serialization.Codec;
import java.util.Map;

public record gsf(Map<String, grs> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gsf> b = Codec.unboundedMap(a, grs.a).xmap(gsf::new, gsf::a);
   public static final ate<gsf> c = ate.a("language", b);

   public Map<String, grs> a() {
      return this.d;
   }
}
