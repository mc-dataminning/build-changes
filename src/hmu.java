import com.mojang.serialization.Codec;
import java.util.Map;

public record hmu(Map<String, hmj> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hmu> b = Codec.unboundedMap(a, hmj.a).xmap(hmu::new, hmu::a);
   public static final aue<hmu> c = new aue<>("language", b);

   public Map<String, hmj> a() {
      return this.d;
   }
}
