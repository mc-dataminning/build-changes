import com.mojang.serialization.Codec;
import java.util.Map;

public record gjs(Map<String, gjf> d) {
   public static final Codec<String> a = avu.b(1, 16);
   public static final Codec<gjs> b = Codec.unboundedMap(a, gjf.a).xmap(gjs::new, gjs::a);
   public static final arg<gjs> c = arg.a("language", b);

   public Map<String, gjf> a() {
      return this.d;
   }
}
