import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hfn {
   void a(hfq var1, czd var2, hfo var3, czb var4, @Nullable gjz var5, @Nullable bxe var6, int var7);

   public static record a(hlg a, giy b, hfn c, @Nullable azw d) {
      public hkx a(alg $$0) {
         return this.a().a($$0, hky.a);
      }
   }

   public interface b extends hlp {
      MapCodec<? extends hfn.b> a();

      hfn a(hfn.a var1);
   }
}
