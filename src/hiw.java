import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hiw() implements hjg<czd.a> {
   public static final Codec<czd.a> a = czd.a.d;
   public static final hjg.a<hiw, czd.a> b = hjg.a.a(MapCodec.unit(new hiw()), a);

   public czd.a a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      dco $$5 = $$0.a(kl.P);
      if ($$5 == null || $$5.b()) {
         return czd.a.a;
      } else {
         return $$5.a(dao.vE) ? czd.a.c : czd.a.b;
      }
   }

   @Override
   public hjg.a<hiw, czd.a> a() {
      return b;
   }

   @Override
   public Codec<czd.a> b() {
      return a;
   }
}
