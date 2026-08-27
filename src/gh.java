import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface gh<A extends ArgumentType<?>, T extends gh.a<A>> {
   void a(T var1, sh var2);

   T b(sh var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dm var1);

      gh<A, ?> a();
   }
}
