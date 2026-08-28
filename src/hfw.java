import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hfw<T> {
   void a(@Nullable T var1, cxw var2, fho var3, gny var4, int var5, int var6, boolean var7);

   @Nullable
   T b(cxy var1);

   public interface a {
      @Nullable
      hfw<?> a(ggz var1);

      MapCodec<? extends hfw.a> a();
   }
}
