import com.mojang.serialization.Codec;

public abstract class iu<T extends it> {
   private final boolean a;
   private final it.a<T> b;

   protected iu(boolean $$0, it.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public it.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
