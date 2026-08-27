import javax.annotation.Nullable;

public interface ve<T extends sv> {
   void a(sp var1);

   void a(T var1);

   default boolean b() {
      return false;
   }

   @Nullable
   default so c() {
      return null;
   }
}
