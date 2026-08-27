import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface gg<A extends ArgumentType<?>, T extends gg.a<A>> {
   void a(T var1, si var2);

   T b(si var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dl var1);

      gg<A, ?> a();
   }
}
