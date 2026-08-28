import com.mojang.serialization.Codec;
import java.util.Map;

public record haz(Map<String, ham> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<haz> b = Codec.unboundedMap(a, ham.a).xmap(haz::new, haz::a);
   public static final auc<haz> c = auc.a("language", b);

   public Map<String, ham> a() {
      return this.d;
   }
}
