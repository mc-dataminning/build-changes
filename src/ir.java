import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ir<T> extends jf<T> implements is<T> {
   private final akm b;
   private ix.c<T> c;

   public ir(String $$0, akl<? extends jk<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new akm($$0);
   }

   @Override
   public ix.c<T> a(akl<T> $$0, T $$1, jj $$2) {
      ix.c<T> $$3 = super.a($$0, $$1, $$2);
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
   public akm b(T $$0) {
      akm $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable akm $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable akm $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<ix.c<T>> a(ayk $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public akm a() {
      return this.b;
   }
}
