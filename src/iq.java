import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface iq<A extends ArgumentType<?>, T extends iq.a<A>> {
   void a(T var1, wb var2);

   T b(wb var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(eq var1);

      iq<A, ?> a();
   }
}
