import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hl<A extends ArgumentType<?>, T extends hl.a<A>> {
   void a(T var1, uq var2);

   T b(uq var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dq var1);

      hl<A, ?> a();
   }
}
