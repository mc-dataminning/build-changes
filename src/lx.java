import com.mojang.serialization.MapCodec;

public abstract class lx<T extends lw> {
   private final boolean a;

   protected lx(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract yy<? super wl, T> d();
}
