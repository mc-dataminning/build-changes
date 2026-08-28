import com.mojang.serialization.MapCodec;

public abstract class lw<T extends lv> {
   private final boolean a;

   protected lw(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract yu<? super wh, T> d();
}
