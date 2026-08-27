import com.mojang.serialization.Codec;

public abstract class jr<T extends jq> {
   private final boolean a;
   private final jq.a<T> b;

   protected jr(boolean $$0, jq.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public jq.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
