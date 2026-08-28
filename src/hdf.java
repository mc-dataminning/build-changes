import com.mojang.serialization.Codec;
import java.util.Map;

public record hdf(Map<String, hcs> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hdf> b = Codec.unboundedMap(a, hcs.a).xmap(hdf::new, hdf::a);
   public static final auu<hdf> c = auu.a("language", b);

   public Map<String, hcs> a() {
      return this.d;
   }
}
