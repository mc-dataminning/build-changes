import com.mojang.serialization.Codec;
import java.util.Map;

public record gdt(Map<String, gdg> d) {
   public static final Codec<String> a = asy.b(1, 16);
   public static final Codec<gdt> b = Codec.unboundedMap(a, gdg.a).xmap(gdt::new, gdt::a);
   public static final aom<gdt> c = aom.a("language", b);

   public Map<String, gdg> a() {
      return this.d;
   }
}
