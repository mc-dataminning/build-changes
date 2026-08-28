import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hdx<T> {
   void a(@Nullable T var1, cwo var2, ffv var3, glz var4, int var5, int var6, boolean var7);

   @Nullable
   T b(cwq var1);

   public interface a {
      @Nullable
      hdx<?> a(gfa var1);

      MapCodec<? extends hdx.a> a();
   }
}
