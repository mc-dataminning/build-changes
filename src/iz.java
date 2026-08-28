import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class iz<T> extends jn<T> implements ja<T> {
   private final ali b;
   private jf.c<T> c;

   public iz(String $$0, alh<? extends js<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = ali.a($$0);
   }

   @Override
   public jf.c<T> a(alh<T> $$0, T $$1, jr $$2) {
      jf.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public ali b(T $$0) {
      ali $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable ali $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable ali $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Override
   public Optional<jf.c<T>> a() {
      return Optional.ofNullable(this.c);
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<jf.c<T>> a(azx $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public ali b() {
      return this.b;
   }
}
