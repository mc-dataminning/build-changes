import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdo(int b) implements hds {
   public static final MapCodec<hdo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hdo::b)).apply($$0, hdo::new));

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      czp $$4 = $$0.a(kv.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hdo> a() {
      return a;
   }
}
