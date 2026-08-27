import com.mojang.serialization.Codec;

public abstract class iv<T extends iu> {
   private final boolean a;
   private final iu.a<T> b;

   protected iv(boolean $$0, iu.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public iu.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
