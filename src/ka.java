import com.mojang.serialization.Codec;

public abstract class ka<T extends jz> {
   private final boolean a;
   private final jz.a<T> b;

   protected ka(boolean $$0, jz.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public jz.a<T> c() {
      return this.b;
   }

   public abstract Codec<T> d();

   public abstract xq<? super vd, T> e();
}
