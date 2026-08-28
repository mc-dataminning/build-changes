import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class jj<T> extends jx<T> implements jk<T> {
   private final alh b;
   private jp.c<T> c;

   public jj(String $$0, alg<? extends kc<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = alh.a($$0);
   }

   @Override
   public jp.c<T> a(alg<T> $$0, T $$1, kb $$2) {
      jp.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public alh b(T $$0) {
      alh $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable alh $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable alh $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Override
   public Optional<jp.c<T>> a() {
      return Optional.ofNullable(this.c);
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<jp.c<T>> a(azr $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public alh b() {
      return this.b;
   }
}
