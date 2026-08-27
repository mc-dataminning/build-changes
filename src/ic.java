import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ic<T> extends ir<T> implements id<T> {
   private final aiy b;
   private ij.c<T> c;

   public ic(String $$0, aix<? extends iv<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new aiy($$0);
   }

   @Override
   public ij.c<T> a(int $$0, aix<T> $$1, T $$2, Lifecycle $$3) {
      ij.c<T> $$4 = super.a($$0, $$1, $$2, $$3);
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
   public aiy b(T $$0) {
      aiy $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable aiy $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable aiy $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<ij.c<T>> a(awo $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public aiy a() {
      return this.b;
   }
}
