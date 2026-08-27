import com.mojang.serialization.Codec;

public abstract class ju<T extends jt> {
   private final boolean a;
   private final jt.a<T> b;

   protected ju(boolean $$0, jt.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public jt.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
