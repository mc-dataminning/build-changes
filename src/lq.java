import com.mojang.serialization.MapCodec;

public abstract class lq<T extends lp> {
   private final boolean a;

   protected lq(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract zg<? super wt, T> d();
}
