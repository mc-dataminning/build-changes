import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcl(int b) implements hcp {
   public static final MapCodec<hcl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hcl::b)).apply($$0, hcl::new));

   @Override
   public float a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      cyz $$4 = $$0.a(kv.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hcl> a() {
      return a;
   }
}
