import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hbi {
   void a(hbl var1, cwp var2, hbj var3, cwn var4, @Nullable gfy var5, @Nullable bvg var6, int var7);

   public static record a(hgu a, gey b, hbi c) {
      public hgl a(aku $$0) {
         return this.a().a($$0, hgm.a);
      }
   }

   public interface b extends hhd {
      MapCodec<? extends hbi.b> a();

      hbi a(hbi.a var1);
   }
}
