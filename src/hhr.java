import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hhr {
   void a(hhu var1, daa var2, hhs var3, czy var4, @Nullable gmd var5, @Nullable bxw var6, int var7);

   public static record a(hnl a, glc b, hhr c, @Nullable baa d) {
   }

   public interface b extends hnt {
      MapCodec<? extends hhr.b> a();

      hhr a(hhr.a var1);
   }
}
