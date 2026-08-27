import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface kv {
   kw<?> a();

   String a(iy.a var1);

   @Deprecated
   public interface a<T extends kv> {
      T b(kw<T> var1, StringReader var2, iy.a var3) throws CommandSyntaxException;
   }
}
