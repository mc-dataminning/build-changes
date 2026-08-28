import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcp(int b) implements hct {
   public static final MapCodec<hcp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hcp::b)).apply($$0, hcp::new));

   @Override
   public float a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3) {
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
   public MapCodec<hcp> a() {
      return a;
   }
}
