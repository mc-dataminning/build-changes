import com.mojang.serialization.MapCodec;

public abstract class kx<T extends kw> {
   private final boolean a;
   private final kw.a<T> b;

   protected kx(boolean $$0, kw.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean b() {
      return this.a;
   }

   public kw.a<T> c() {
      return this.b;
   }

   public abstract MapCodec<T> d();

   public abstract yv<? super wi, T> e();
}
