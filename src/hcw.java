import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcw() implements hdc<cwl> {
   public static final hdc.a<hcw, cwl> a = hdc.a.a(MapCodec.unit(new hcw()), cwl.j);

   public cwl a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return $$4;
   }

   @Override
   public hdc.a<hcw, cwl> a() {
      return a;
   }
}
