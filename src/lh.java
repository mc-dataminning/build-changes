import com.mojang.serialization.MapCodec;

public abstract class lh<T extends lg> {
   private final boolean a;

   protected lh(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract zn<? super xa, T> d();
}
