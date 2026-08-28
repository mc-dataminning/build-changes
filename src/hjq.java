import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjq() implements hjs<bxn> {
   public static final Codec<bxn> a = bxn.c;
   public static final hjs.a<hjq, bxn> b = hjs.a.a(MapCodec.unit(new hjq()), a);

   @Nullable
   public bxn a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hjs.a<hjq, bxn> a() {
      return b;
   }

   @Override
   public Codec<bxn> b() {
      return a;
   }
}
