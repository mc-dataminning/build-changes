import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface jt {
   ju<?> b();

   void a(ue var1);

   String a();

   @Deprecated
   public interface a<T extends jt> {
      T b(ju<T> var1, StringReader var2) throws CommandSyntaxException;

      T b(ju<T> var1, ue var2);
   }
}
