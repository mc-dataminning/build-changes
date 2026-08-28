import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record hb(String b, gz c) {
   public static final Codec<hb> a = Codec.STRING.comapFlatMap(hb::a, hb::a);

   public static DataResult<hb> a(String $$0) {
      try {
         ha $$1 = new ha(new StringReader($$0), true);
         return DataResult.success(new hb($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof hb $$1 && this.b.equals($$1.b)) {
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

   public gz b() {
      return this.c;
   }
}
