import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface ka {
   kb<?> a();

   String a(in.a var1);

   @Deprecated
   public interface a<T extends ka> {
      T b(kb<T> var1, StringReader var2, in.a var3) throws CommandSyntaxException;
   }
}
