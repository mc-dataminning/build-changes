import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record hl(String b, hj c) {
   public static final Codec<hl> a = Codec.STRING.comapFlatMap(hl::a, hl::a);

   public static DataResult<hl> a(String $$0) {
      try {
         hk $$1 = new hk(new StringReader($$0), true);
         return DataResult.success(new hl($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof hl $$1 && this.b.equals($$1.b)) {
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

   public hj b() {
      return this.c;
   }
}
