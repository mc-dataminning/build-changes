import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ja<T> extends jo<T> implements jb<T> {
   private final alr b;
   private jg.c<T> c;

   public ja(String $$0, alq<? extends jt<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = alr.a($$0);
   }

   @Override
   public jg.c<T> a(alq<T> $$0, T $$1, js $$2) {
      jg.c<T> $$3 = super.a($$0, $$1, $$2);
      if (this.b.equals($$0.a())) {
         this.c = $$3;
      }

      return $$3;
   }

   @Override
   public int a(@Nullable T $$0) {
      int $$1 = super.a($$0);
      return $$1 == -1 ? super.a(this.c.a()) : $$1;
   }

   @Nonnull
   @Override
   public alr b(T $$0) {
      alr $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable alr $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable alr $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Override
   public Optional<jg.c<T>> a() {
      return Optional.ofNullable(this.c);
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<jg.c<T>> a(bai $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public alr b() {
      return this.b;
   }
}
