import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hbz(int b) implements hby {
   public static final MapCodec<hbz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hbz::b)).apply($$0, hbz::new));

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      cza $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hbz> a() {
      return a;
   }
}
