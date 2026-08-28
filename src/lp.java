import com.mojang.serialization.MapCodec;

public abstract class lp<T extends lo> {
   private final boolean a;

   protected lp(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract zf<? super ws, T> d();
}
