import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record hn(String b, hl c) {
   public static final Codec<hn> a = Codec.STRING.comapFlatMap(hn::a, hn::a);

   public static DataResult<hn> a(String $$0) {
      try {
         hm $$1 = new hm(new StringReader($$0), true);
         return DataResult.success(new hn($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof hn $$1 && this.b.equals($$1.b)) {
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

   public hl b() {
      return this.c;
   }
}
