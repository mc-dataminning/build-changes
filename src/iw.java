import com.mojang.serialization.Codec;

public abstract class iw<T extends iv> {
   private final boolean a;
   private final iv.a<T> b;

   protected iw(boolean $$0, iv.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public iv.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
