import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hhf {
   void a(hhi var1, dak var2, hhg var3, dai var4, @Nullable glo var5, @Nullable byf var6, int var7);

   public static record a(hmz a, gkn b, hhf c, @Nullable baj d) {
   }

   public interface b extends hnh {
      MapCodec<? extends hhf.b> a();

      hhf a(hhf.a var1);
   }
}
