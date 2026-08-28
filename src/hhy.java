import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhy() implements hia<bxa> {
   public static final Codec<bxa> a = bxa.c;
   public static final hia.a<hhy, bxa> b = hia.a.a(MapCodec.unit(new hhy()), a);

   @Nullable
   public bxa a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$2 == null ? null : $$2.fx();
   }

   @Override
   public hia.a<hhy, bxa> a() {
      return b;
   }

   @Override
   public Codec<bxa> b() {
      return a;
   }
}
