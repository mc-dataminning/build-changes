import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record hc(String b, ha c) {
   public static final Codec<hc> a = Codec.STRING.comapFlatMap(hc::a, hc::a);

   public static DataResult<hc> a(String $$0) {
      try {
         hb $$1 = new hb(new StringReader($$0), true);
         return DataResult.success(new hc($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof hc $$1 && this.b.equals($$1.b)) {
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

   public ha b() {
      return this.c;
   }
}
