import com.mojang.serialization.MapCodec;

public abstract class lr<T extends lq> {
   private final boolean a;

   protected lr(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract zj<? super ww, T> d();
}
