import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hp<A extends ArgumentType<?>, T extends hp.a<A>> {
   void a(T var1, vi var2);

   T b(vi var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dr var1);

      hp<A, ?> a();
   }
}
