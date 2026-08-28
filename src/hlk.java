import com.mojang.serialization.Codec;
import java.util.Map;

public record hlk(Map<String, hkz> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hlk> b = Codec.unboundedMap(a, hkz.a).xmap(hlk::new, hlk::a);
   public static final auc<hlk> c = new auc<>("language", b);

   public Map<String, hkz> a() {
      return this.d;
   }
}
