import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface ku {
   kv<?> a();

   String a(ix.a var1);

   @Deprecated
   public interface a<T extends ku> {
      T fromCommand(kv<T> var1, StringReader var2, ix.a var3) throws CommandSyntaxException;
   }
}
