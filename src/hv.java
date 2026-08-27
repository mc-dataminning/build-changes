import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class hv<T> extends ik<T> implements hw<T> {
   private final afw b;
   private ib.c<T> c;

   public hv(String $$0, afv<? extends io<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new afw($$0);
   }

   @Override
   public ib.c<T> a(int $$0, afv<T> $$1, T $$2, Lifecycle $$3) {
      ib.c<T> $$4 = super.a($$0, $$1, $$2, $$3);
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
   public afw b(T $$0) {
      afw $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable afw $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable afw $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<ib.c<T>> a(ate $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public afw a() {
      return this.b;
   }
}
