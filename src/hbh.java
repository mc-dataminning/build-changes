import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hbh {
   void a(hbk var1, cwn var2, hbi var3, cwl var4, @Nullable gfw var5, @Nullable bvf var6, int var7);

   public static record a(hgv a, gew b, hbh c) {
      public hgm a(aku $$0) {
         return this.a().a($$0, hgn.a);
      }
   }

   public interface b extends hhe {
      MapCodec<? extends hbh.b> a();

      hbh a(hbh.a var1);
   }
}
