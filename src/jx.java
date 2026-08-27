import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface jx {
   jy<?> b();

   String a();

   @Deprecated
   public interface a<T extends jx> {
      T b(jy<T> var1, StringReader var2) throws CommandSyntaxException;
   }
}
