import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hht<T> {
   void a(@Nullable T var1, cyw var2, fjc var3, gps var4, int var5, int var6, boolean var7);

   @Nullable
   T b(cyy var1);

   public interface a {
      @Nullable
      hht<?> a(giq var1);

      MapCodec<? extends hht.a> a();
   }
}
