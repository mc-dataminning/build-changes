import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface ju {
   jv<?> b();

   void a(ty var1);

   String a();

   @Deprecated
   public interface a<T extends ju> {
      T b(jv<T> var1, StringReader var2) throws CommandSyntaxException;

      T b(jv<T> var1, ty var2);
   }
}
