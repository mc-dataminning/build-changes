import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hke<T> {
   void a(@Nullable T var1, czw var2, flo var3, gsa var4, int var5, int var6, boolean var7);

   @Nullable
   T b(czy var1);

   public interface a {
      @Nullable
      hke<?> a(gla var1);

      MapCodec<? extends hke.a> a();
   }
}
