import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gar(gas d) {
   public static final gar a = new gar(gas.b);
   public static final Codec<gar> b = RecordCodecBuilder.create($$0 -> $$0.group(arj.a(gas.a, "scaling", gas.b).forGetter(gar::a)).apply($$0, gar::new));
   public static final amx<gar> c = amx.a("gui", b);

   public gas a() {
      return this.d;
   }
}
