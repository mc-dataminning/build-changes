import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface gi<A extends ArgumentType<?>, T extends gi.a<A>> {
   void a(T var1, so var2);

   T b(so var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dn var1);

      gi<A, ?> a();
   }
}
