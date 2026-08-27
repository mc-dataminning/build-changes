import com.mojang.serialization.Codec;

public abstract class jw<T extends jv> {
   private final boolean a;
   private final jv.a<T> b;

   protected jw(boolean $$0, jv.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public jv.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
