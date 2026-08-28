import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hie(int b) implements hid {
   public static final MapCodec<hie> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.l.optionalFieldOf("index", 0).forGetter(hie::b)).apply($$0, hie::new));

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      dch $$5 = $$0.a(kk.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hie> a() {
      return a;
   }
}
