import com.mojang.serialization.MapCodec;

public abstract class lu<T extends lt> {
   private final boolean a;

   protected lu(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract yt<? super wg, T> d();
}
