import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hck {
   void a(hcn var1, cxh var2, hcl var3, cxf var4, @Nullable ggy var5, @Nullable bvy var6, int var7);

   public static record a(hia a, gfy b, hck c) {
      public hhr a(aku $$0) {
         return this.a().a($$0, hhs.a);
      }
   }

   public interface b extends hij {
      MapCodec<? extends hck.b> a();

      hck a(hck.a var1);
   }
}
