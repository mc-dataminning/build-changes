import javax.annotation.Nullable;

public interface vf<T extends sw> {
   void a(sq var1);

   void a(T var1);

   default boolean b() {
      return false;
   }

   @Nullable
   default sp c() {
      return null;
   }
}
