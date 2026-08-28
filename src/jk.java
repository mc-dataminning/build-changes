import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class jk<T> extends jy<T> implements jl<T> {
   private final alp b;
   private jq.c<T> c;

   public jk(String $$0, alo<? extends kd<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = alp.a($$0);
   }

   @Override
   public jq.c<T> a(alo<T> $$0, T $$1, kc $$2) {
      jq.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public alp b(T $$0) {
      alp $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable alp $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable alp $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Override
   public Optional<jq.c<T>> a() {
      return Optional.ofNullable(this.c);
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<jq.c<T>> a(bac $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public alp b() {
      return this.b;
   }
}
