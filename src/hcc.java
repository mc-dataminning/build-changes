import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcc(ku<?> b, boolean c) implements hbx {
   public static final MapCodec<hcc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.ao.q().fieldOf("component").forGetter(hcc::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hcc::c))
            .apply($$0, hcc::new)
   );

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return this.c ? $$0.c(this.b) : $$0.b(this.b);
   }

   @Override
   public MapCodec<hcc> a() {
      return a;
   }
}
