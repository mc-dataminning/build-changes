import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hib<T> {
   void a(@Nullable T var1, czb var2, fjj var3, gqa var4, int var5, int var6, boolean var7);

   @Nullable
   T b(czd var1);

   public interface a {
      @Nullable
      hib<?> a(giy var1);

      MapCodec<? extends hib.a> a();
   }
}
