import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record hk(String b, hi c) {
   public static final Codec<hk> a = Codec.STRING.comapFlatMap(hk::a, hk::a);

   public static DataResult<hk> a(String $$0) {
      try {
         hj $$1 = new hj(new StringReader($$0), true);
         return DataResult.success(new hk($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof hk $$1 && this.b.equals($$1.b)) {
         return true;
      }

      return false;
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public String a() {
      return this.b;
   }

   public hi b() {
      return this.c;
   }
}
