import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record hm(String b, hk c) {
   public static final Codec<hm> a = Codec.STRING.comapFlatMap(hm::a, hm::a);

   public static DataResult<hm> a(String $$0) {
      try {
         hl $$1 = new hl(new StringReader($$0), true);
         return DataResult.success(new hm($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof hm $$1 && this.b.equals($$1.b)) {
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

   public hk b() {
      return this.c;
   }
}
