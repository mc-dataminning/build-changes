import com.mojang.serialization.Codec;
import java.util.Map;

public record hhl(Map<String, hha> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hhl> b = Codec.unboundedMap(a, hha.a).xmap(hhl::new, hhl::a);
   public static final atp<hhl> c = new atp<>("language", b);

   public Map<String, hha> a() {
      return this.d;
   }
}
