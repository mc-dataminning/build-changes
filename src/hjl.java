import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjl() implements hjs<alj<bxe<?>>> {
   public static final Codec<alj<bxe<?>>> a = alj.a(mi.B);
   public static final hjs.a<hjl, alj<bxe<?>>> b = hjs.a.a(MapCodec.unit(new hjl()), a);

   @Nullable
   public alj<bxe<?>> a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$2 == null ? null : $$2.an().r().h();
   }

   @Override
   public hjs.a<hjl, alj<bxe<?>>> a() {
      return b;
   }

   @Override
   public Codec<alj<bxe<?>>> b() {
      return a;
   }
}
