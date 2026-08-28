import com.mojang.serialization.Codec;
import java.util.Map;

public record hki(Map<String, hjx> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hki> b = Codec.unboundedMap(a, hjx.a).xmap(hki::new, hki::a);
   public static final auc<hki> c = new auc<>("language", b);

   public Map<String, hjx> a() {
      return this.d;
   }
}
