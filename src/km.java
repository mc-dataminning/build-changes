import com.mojang.serialization.Codec;

public abstract class km<T extends kl> {
   private final boolean a;
   private final kl.a<T> b;

   protected km(boolean $$0, kl.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public kl.a<T> c() {
      return this.b;
   }

   public abstract Codec<T> d();

   public abstract yg<? super vt, T> e();
}
