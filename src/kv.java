import com.mojang.serialization.Codec;

public abstract class kv<T extends ku> {
   private final boolean a;
   private final ku.a<T> b;

   protected kv(boolean $$0, ku.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public ku.a<T> c() {
      return this.b;
   }

   public abstract Codec<T> d();

   public abstract yq<? super wd, T> e();
}
