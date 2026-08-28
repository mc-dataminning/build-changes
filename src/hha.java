import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hha() implements hhf<cyw> {
   public static final Codec<cyw> a = cyw.j;
   public static final hhf.a<hha, cyw> b = hhf.a.a(MapCodec.unit(new hha()), a);

   public cyw a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$4;
   }

   @Override
   public hhf.a<hha, cyw> a() {
      return b;
   }

   @Override
   public Codec<cyw> b() {
      return a;
   }
}
