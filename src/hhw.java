import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhw() implements hig<cyg.a> {
   public static final Codec<cyg.a> a = cyg.a.d;
   public static final hig.a<hhw, cyg.a> b = hig.a.a(MapCodec.unit(new hhw()), a);

   public cyg.a a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      dbr $$5 = $$0.a(kk.P);
      if ($$5 == null || $$5.b()) {
         return cyg.a.a;
      } else {
         return $$5.a(czr.vE) ? cyg.a.c : cyg.a.b;
      }
   }

   @Override
   public hig.a<hhw, cyg.a> a() {
      return b;
   }

   @Override
   public Codec<cyg.a> b() {
      return a;
   }
}
