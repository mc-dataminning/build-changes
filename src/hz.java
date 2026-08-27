import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class hz<T> extends io<T> implements ia<T> {
   private final agm b;
   private ig.c<T> c;

   public hz(String $$0, agl<? extends is<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new agm($$0);
   }

   @Override
   public ig.c<T> a(int $$0, agl<T> $$1, T $$2, Lifecycle $$3) {
      ig.c<T> $$4 = super.a($$0, $$1, $$2, $$3);
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
   public agm b(T $$0) {
      agm $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable agm $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable agm $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<ig.c<T>> a(atw $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public agm a() {
      return this.b;
   }
}
