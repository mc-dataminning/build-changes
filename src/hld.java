import com.mojang.serialization.Codec;
import java.util.Map;

public record hld(Map<String, hks> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hld> b = Codec.unboundedMap(a, hks.a).xmap(hld::new, hld::a);
   public static final auc<hld> c = new auc<>("language", b);

   public Map<String, hks> a() {
      return this.d;
   }
}
