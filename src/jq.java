import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface jq {
   jr<?> b();

   void a(tu var1);

   String a();

   @Deprecated
   public interface a<T extends jq> {
      T b(jr<T> var1, StringReader var2) throws CommandSyntaxException;

      T b(jr<T> var1, tu var2);
   }
}
