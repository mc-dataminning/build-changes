import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhd() implements hhn<cxw.a> {
   public static final Codec<cxw.a> a = cxw.a.d;
   public static final hhn.a<hhd, cxw.a> b = hhn.a.a(MapCodec.unit(new hhd()), a);

   public cxw.a a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      dbh $$5 = $$0.a(kj.P);
      if ($$5 == null || $$5.b()) {
         return cxw.a.a;
      } else {
         return $$5.a(czh.vE) ? cxw.a.c : cxw.a.b;
      }
   }

   @Override
   public hhn.a<hhd, cxw.a> a() {
      return b;
   }

   @Override
   public Codec<cxw.a> b() {
      return a;
   }
}
