import com.mojang.serialization.MapCodec;

public abstract class ll<T extends lk> {
   private final boolean a;

   protected ll(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract yx<? super wk, T> d();
}
