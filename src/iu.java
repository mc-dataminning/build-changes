import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface iu<A extends ArgumentType<?>, T extends iu.a<A>> {
   void a(T var1, vr var2);

   T b(vr var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(et var1);

      iu<A, ?> a();
   }
}
