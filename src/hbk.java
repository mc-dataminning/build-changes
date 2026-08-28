import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hbk {
   void a(hbn var1, cwo var2, hbl var3, cwm var4, @Nullable gfy var5, @Nullable bvg var6, int var7);

   public static record a(hha a, gey b, hbk c) {
      public hgr a(akv $$0) {
         return this.a().a($$0, hgs.a);
      }
   }

   public interface b extends hhj {
      MapCodec<? extends hbk.b> a();

      hbk a(hbk.a var1);
   }
}
