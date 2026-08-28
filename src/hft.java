import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hft(int b) implements hfs {
   public static final MapCodec<hft> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hft::b)).apply($$0, hft::new));

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      dbh $$5 = $$0.a(kj.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hft> a() {
      return a;
   }
}
