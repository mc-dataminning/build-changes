import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class iq<T> extends je<T> implements ir<T> {
   private final akh b;
   private iw.c<T> c;

   public iq(String $$0, akg<? extends jj<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new akh($$0);
   }

   @Override
   public iw.c<T> a(akg<T> $$0, T $$1, ji $$2) {
      iw.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public akh b(T $$0) {
      akh $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable akh $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable akh $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<iw.c<T>> a(ayg $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public akh a() {
      return this.b;
   }
}
