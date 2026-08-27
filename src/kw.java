import com.mojang.serialization.Codec;

public abstract class kw<T extends kv> {
   private final boolean a;
   private final kv.a<T> b;

   protected kw(boolean $$0, kv.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public kv.a<T> c() {
      return this.b;
   }

   public abstract Codec<T> d();

   public abstract ys<? super wf, T> e();
}
