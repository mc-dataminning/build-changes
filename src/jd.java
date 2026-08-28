import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class jd<T> extends jr<T> implements je<T> {
   private final akk b;
   private jj.c<T> c;

   public jd(String $$0, akj<? extends jw<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new akk($$0);
   }

   @Override
   public jj.c<T> a(akj<T> $$0, T $$1, jv $$2) {
      jj.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public akk b(T $$0) {
      akk $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable akk $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable akk $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Override
   public Optional<jj.c<T>> a() {
      return Optional.ofNullable(this.c);
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<jj.c<T>> a(ayo $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public akk b() {
      return this.b;
   }
}
