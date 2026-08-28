import com.mojang.serialization.MapCodec;

public abstract class li<T extends lh> {
   private final boolean a;

   protected li(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract ys<? super wf, T> d();
}
