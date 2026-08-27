import com.mojang.serialization.Codec;
import java.util.Map;

public record gpp(Map<String, gpc> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gpp> b = Codec.unboundedMap(a, gpc.a).xmap(gpp::new, gpp::a);
   public static final asx<gpp> c = asx.a("language", b);

   public Map<String, gpc> a() {
      return this.d;
   }
}
