import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdb(ku<?> b, boolean c) implements hcw {
   public static final MapCodec<hdb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.ao.q().fieldOf("component").forGetter(hdb::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hdb::c))
            .apply($$0, hdb::new)
   );

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return this.c ? $$0.c(this.b) : $$0.b(this.b);
   }

   @Override
   public MapCodec<hdb> a() {
      return a;
   }
}
