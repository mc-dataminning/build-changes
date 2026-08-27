import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface iv {
   iw<?> b();

   void a(sl var1);

   String a();

   @Deprecated
   public interface a<T extends iv> {
      T b(iw<T> var1, StringReader var2) throws CommandSyntaxException;

      T b(iw<T> var1, sl var2);
   }
}
