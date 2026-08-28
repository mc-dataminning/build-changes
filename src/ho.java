import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record ho(String b, hm c) {
   public static final Codec<ho> a = Codec.STRING.comapFlatMap(ho::a, ho::a);

   public static DataResult<ho> a(String $$0) {
      try {
         hn $$1 = new hn(new StringReader($$0), true);
         return DataResult.success(new ho($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof ho $$1 && this.b.equals($$1.b)) {
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

   public hm b() {
      return this.c;
   }
}
