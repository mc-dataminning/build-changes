import com.mojang.serialization.MapCodec;

public abstract class ln<T extends lm> {
   private final boolean a;

   protected ln(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract zc<? super wp, T> d();
}
