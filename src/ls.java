import com.mojang.serialization.MapCodec;

public abstract class ls<T extends lr> {
   private final boolean a;

   protected ls(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract ym<? super vz, T> d();
}
