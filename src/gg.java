import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface gg<A extends ArgumentType<?>, T extends gg.a<A>> {
   void a(T var1, sf var2);

   T b(sf var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dm var1);

      gg<A, ?> a();
   }
}
