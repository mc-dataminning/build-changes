import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hhp {
   void a(hhs var1, czy var2, hhq var3, czw var4, @Nullable gmb var5, @Nullable bxu var6, int var7);

   public static record a(hnj a, gla b, hhp c, @Nullable azy d) {
   }

   public interface b extends hnr {
      MapCodec<? extends hhp.b> a();

      hhp a(hhp.a var1);
   }
}
