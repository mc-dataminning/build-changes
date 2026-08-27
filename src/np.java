import com.mojang.serialization.Lifecycle;

public interface np<T> {
   hg.c<T> a(aet<T> var1, T var2, Lifecycle var3);

   default hg.c<T> a(aet<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> hh<S> a(aet<? extends ht<? extends S>> var1);
}
