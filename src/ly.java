import com.mojang.serialization.MapCodec;

public abstract class ly<T extends lx> {
   private final boolean a;

   protected ly(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract za<? super wn, T> d();
}
