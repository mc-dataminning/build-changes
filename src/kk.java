import com.mojang.serialization.Codec;

public abstract class kk<T extends kj> {
   private final boolean a;
   private final kj.a<T> b;

   protected kk(boolean $$0, kj.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public kj.a<T> c() {
      return this.b;
   }

   public abstract Codec<T> d();

   public abstract ye<? super vr, T> e();
}
