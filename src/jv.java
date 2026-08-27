import com.mojang.serialization.Codec;

public abstract class jv<T extends ju> {
   private final boolean a;
   private final ju.a<T> b;

   protected jv(boolean $$0, ju.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public ju.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
