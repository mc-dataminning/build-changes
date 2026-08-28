import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hju<T> {
   void a(@Nullable T var1, dai var2, fld var3, grn var4, int var5, int var6, boolean var7);

   @Nullable
   T b(dak var1);

   public interface a {
      @Nullable
      hju<?> a(gkn var1);

      MapCodec<? extends hju.a> a();
   }
}
