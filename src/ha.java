import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record ha(String b, gy c) {
   public static final Codec<ha> a = Codec.STRING.comapFlatMap(ha::a, ha::a);

   public static DataResult<ha> a(String $$0) {
      try {
         gz $$1 = new gz(new StringReader($$0), true);
         return DataResult.success(new ha($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof ha $$1 && this.b.equals($$1.b)) {
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

   public gy b() {
      return this.c;
   }
}
