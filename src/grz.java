import com.mojang.serialization.Codec;
import java.util.Map;

public record grz(Map<String, grm> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<grz> b = Codec.unboundedMap(a, grm.a).xmap(grz::new, grz::a);
   public static final atd<grz> c = atd.a("language", b);

   public Map<String, grm> a() {
      return this.d;
   }
}
