import com.mojang.serialization.MapCodec;

public abstract class lm<T extends ll> {
   private final boolean a;

   protected lm(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract zb<? super wo, T> d();
}
