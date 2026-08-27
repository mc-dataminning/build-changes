import com.mojang.serialization.Lifecycle;

public interface pl<T> {
   il.c<T> a(ajg<T> var1, T var2, Lifecycle var3);

   default il.c<T> a(ajg<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> im<S> a(ajg<? extends iy<? extends S>> var1);
}
