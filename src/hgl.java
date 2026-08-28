import com.mojang.serialization.Codec;
import java.util.Map;

public record hgl(Map<String, hga> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hgl> b = Codec.unboundedMap(a, hga.a).xmap(hgl::new, hgl::a);
   public static final atp<hgl> c = new atp<>("language", b);

   public Map<String, hga> a() {
      return this.d;
   }
}
