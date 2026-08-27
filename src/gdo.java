import com.mojang.serialization.Codec;
import java.util.Map;

public record gdo(Map<String, gdb> d) {
   public static final Codec<String> a = asu.b(1, 16);
   public static final Codec<gdo> b = Codec.unboundedMap(a, gdb.a).xmap(gdo::new, gdo::a);
   public static final aoi<gdo> c = aoi.a("language", b);

   public Map<String, gdb> a() {
      return this.d;
   }
}
