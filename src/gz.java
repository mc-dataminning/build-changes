import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class gz<T> extends hn<T> implements ha<T> {
   private final aep b;
   private hf.c<T> c;

   public gz(String $$0, aeo<? extends hs<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new aep($$0);
   }

   @Override
   public hf.c<T> a(int $$0, aeo<T> $$1, T $$2, Lifecycle $$3) {
      hf.c<T> $$4 = super.a($$0, $$1, $$2, $$3);
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
   public aep b(T $$0) {
      aep $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable aep $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable aep $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<hf.c<T>> a(art $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public aep a() {
      return this.b;
   }
}
