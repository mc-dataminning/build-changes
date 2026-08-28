import com.mojang.serialization.Codec;
import java.util.Map;

public record hkq(Map<String, hkf> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hkq> b = Codec.unboundedMap(a, hkf.a).xmap(hkq::new, hkq::a);
   public static final auc<hkq> c = new auc<>("language", b);

   public Map<String, hkf> a() {
      return this.d;
   }
}
