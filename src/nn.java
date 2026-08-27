import com.mojang.serialization.Lifecycle;

public interface nn<T> {
   hf.c<T> a(aeo<T> var1, T var2, Lifecycle var3);

   default hf.c<T> a(aeo<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> hg<S> a(aeo<? extends hs<? extends S>> var1);
}
