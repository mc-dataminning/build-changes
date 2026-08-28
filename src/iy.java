import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class iy<T> extends jm<T> implements iz<T> {
   private final ale b;
   private je.c<T> c;

   public iy(String $$0, ald<? extends jr<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = ale.a($$0);
   }

   @Override
   public je.c<T> a(ald<T> $$0, T $$1, jq $$2) {
      je.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public ale b(T $$0) {
      ale $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable ale $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable ale $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Override
   public Optional<je.c<T>> a() {
      return Optional.ofNullable(this.c);
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<je.c<T>> a(azt $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public ale b() {
      return this.b;
   }
}
