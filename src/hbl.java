import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface hbl {
   void a(hbo var1, cwp var2, hbm var3, cwn var4, @Nullable gfz var5, @Nullable bvh var6, int var7);

   public static record a(hhb a, gez b, hbl c) {
      public hgs a(akv $$0) {
         return this.a().a($$0, hgt.a);
      }
   }

   public interface b extends hhk {
      MapCodec<? extends hbl.b> a();

      hbl a(hbl.a var1);
   }
}
