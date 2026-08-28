import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hff {
   void a(hfi var1, cyy var2, hfg var3, cyw var4, @Nullable gjr var5, @Nullable bxc var6, int var7);

   public static record a(hky a, giq b, hff c, @Nullable azw d) {
      public hkp a(alg $$0) {
         return this.a().a($$0, hkq.a);
      }
   }

   public interface b extends hlh {
      MapCodec<? extends hff.b> a();

      hff a(hff.a var1);
   }
}
