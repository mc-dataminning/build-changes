import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ia<T> extends ip<T> implements ib<T> {
   private final ahg b;
   private ih.c<T> c;

   public ia(String $$0, ahf<? extends it<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new ahg($$0);
   }

   @Override
   public ih.c<T> a(int $$0, ahf<T> $$1, T $$2, Lifecycle $$3) {
      ih.c<T> $$4 = super.a($$0, $$1, $$2, $$3);
      if (this.b.equals($$1.a())) {
         this.c = $$4;
      }

      return $$4;
   }

   @Override
   public int a(@Nullable T $$0) {
      int $$1 = super.a($$0);
      return $$1 == -1 ? super.a(this.c.a()) : $$1;
   }

   @Nonnull
   @Override
   public ahg b(T $$0) {
      ahg $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable ahg $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable ahg $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<ih.c<T>> a(auu $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public ahg a() {
      return this.b;
   }
}
