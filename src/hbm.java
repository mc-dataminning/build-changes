import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hbm {
   void a(hbp var1, cwq var2, hbn var3, cwo var4, @Nullable gga var5, @Nullable bvi var6, int var7);

   public static record a(hhc a, gfa b, hbm c) {
      public hgt a(akv $$0) {
         return this.a().a($$0, hgu.a);
      }
   }

   public interface b extends hhl {
      MapCodec<? extends hbm.b> a();

      hbm a(hbm.a var1);
   }
}
