import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hck(int b) implements hco {
   public static final MapCodec<hck> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.l.optionalFieldOf("index", 0).forGetter(hck::b)).apply($$0, hck::new));

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      cyx $$4 = $$0.a(kv.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hck> a() {
      return a;
   }
}
