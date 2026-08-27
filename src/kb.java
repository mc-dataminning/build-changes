import com.mojang.serialization.Codec;

public abstract class kb<T extends ka> {
   private final boolean a;
   private final ka.a<T> b;

   protected kb(boolean $$0, ka.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public ka.a<T> c() {
      return this.b;
   }

   public abstract Codec<T> d();

   public abstract xs<? super vf, T> e();
}
