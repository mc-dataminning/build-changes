import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hdk {
   void a(hdn var1, cxy var2, hdl var3, cxw var4, @Nullable ghz var5, @Nullable bwr var6, int var7);

   public static record a(hjb a, ggz b, hdk c) {
      public his a(ald $$0) {
         return this.a().a($$0, hit.a);
      }
   }

   public interface b extends hjk {
      MapCodec<? extends hdk.b> a();

      hdk a(hdk.a var1);
   }
}
