import com.mojang.serialization.Codec;

public abstract class la<T extends kz> {
   private final boolean a;
   private final kz.a<T> b;

   protected la(boolean $$0, kz.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public kz.a<T> c() {
      return this.b;
   }

   public abstract Codec<T> d();

   public abstract zc<? super wp, T> e();
}
