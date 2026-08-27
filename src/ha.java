import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ha<T> extends ho<T> implements hb<T> {
   private final aeu b;
   private hg.c<T> c;

   public ha(String $$0, aet<? extends ht<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = new aeu($$0);
   }

   @Override
   public hg.c<T> a(int $$0, aet<T> $$1, T $$2, Lifecycle $$3) {
      hg.c<T> $$4 = super.a($$0, $$1, $$2, $$3);
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
   public aeu b(T $$0) {
      aeu $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable aeu $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable aeu $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<hg.c<T>> a(arx $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public aeu a() {
      return this.b;
   }
}
