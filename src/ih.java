import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface ih<A extends ArgumentType<?>, T extends ih.a<A>> {
   void a(T var1, vy var2);

   T b(vy var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(eg var1);

      ih<A, ?> a();
   }
}
