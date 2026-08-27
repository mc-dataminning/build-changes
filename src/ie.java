import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ie<T> extends it<T> implements ig<T> {
   private final ajc b;
   private il.c<T> c;

   public ie(String $$0, ajb<? extends ix<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new ajc($$0);
   }

   @Override
   public il.c<T> a(ajb<T> $$0, T $$1, Lifecycle $$2) {
      il.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public ajc b(T $$0) {
      ajc $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable ajc $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable ajc $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<il.c<T>> a(awt $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public ajc a() {
      return this.b;
   }
}
