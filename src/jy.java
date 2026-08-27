import com.mojang.serialization.Codec;

public abstract class jy<T extends jx> {
   private final boolean a;
   private final jx.a<T> b;

   protected jy(boolean $$0, jx.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public jx.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();

   public abstract xo<? super vb, T> f();
}
