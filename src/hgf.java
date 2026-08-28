import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hgf {
   void a(hgi var1, czn var2, hgg var3, czl var4, @Nullable gkq var5, @Nullable bxj var6, int var7);

   public static record a(hlz a, gjp b, hgf c, @Nullable azw d) {
   }

   public interface b extends hmi {
      MapCodec<? extends hgf.b> a();

      hgf a(hgf.a var1);
   }
}
